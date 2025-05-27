package assignment9;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

import assignment9.scenes.Bubbles;
import assignment9.scenes.Clear;
import assignment9.scenes.Forest;
import assignment9.scenes.Leaves;
import assignment9.scenes.Line;
import assignment9.scenes.Poly;
import assignment9.scenes.Sequence;
import assignment9.scenes.Square;
import assignment9.scenes.ifs.Dragon;
import assignment9.scenes.ifs.Tree;
import edu.princeton.cs.introcs.StdDraw;

public class SceneComposer {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		StdDraw.enableDoubleBuffering();
		// MY CODE
		// allow users to recall existing scenes and create new ones
		// map used because key value pair , scene associated with an input
		Map<String, Drawable> theScene = new HashMap<String, Drawable>();
		
		// Note: Double Buffering is enabled!  
		//       You'll need to call show() to update the screen.
		//       In most cases you'll want to call show() after you've drawn something
		
		// LinkedList Version
		LinkedList<Drawable> init = new LinkedList<>();
				
		LinkedList<Drawable> bubbles1 = new LinkedList<>();
		LinkedList<Drawable> bubbles2 = new LinkedList<>();
		LinkedList<Drawable> bubbles3 = new LinkedList<>();
		LinkedList<Drawable> bubbles4 = new LinkedList<>();
				
		LinkedList<Drawable> forest1 = new LinkedList<>();
		LinkedList<Drawable> forest2 = new LinkedList<>();
		LinkedList<Drawable> forest3 = new LinkedList<>();
		LinkedList<Drawable> forest4 = new LinkedList<>();
				
		LinkedList<Drawable> leaves1 = new LinkedList<>();
		LinkedList<Drawable> leaves2 = new LinkedList<>();
		LinkedList<Drawable> leaves3 = new LinkedList<>();
		LinkedList<Drawable> leaves4 = new LinkedList<>();
				
		LinkedList<Drawable> line1 = new LinkedList<>();
		LinkedList<Drawable> line2 = new LinkedList<>();
		LinkedList<Drawable> line3 = new LinkedList<>();
		LinkedList<Drawable> line4 = new LinkedList<>();
		
		LinkedList<Drawable> poly1 = new LinkedList<>();
		LinkedList<Drawable> poly2 = new LinkedList<>();
		LinkedList<Drawable> poly3 = new LinkedList<>();
		LinkedList<Drawable> poly4 = new LinkedList<>();
		
		LinkedList<Drawable> square1 = new LinkedList<>();
		LinkedList<Drawable> square2 = new LinkedList<>();
		LinkedList<Drawable> square3 = new LinkedList<>();
		LinkedList<Drawable> square4 = new LinkedList<>();
				
		LinkedList<Drawable> dragon1 = new LinkedList<>();
		LinkedList<Drawable> dragon2 = new LinkedList<>();
		LinkedList<Drawable> dragon3 = new LinkedList<>();
		LinkedList<Drawable> dragon4 = new LinkedList<>();
				
		LinkedList<Drawable> tree1 = new LinkedList<>();
		LinkedList<Drawable> tree2 = new LinkedList<>();
		LinkedList<Drawable> tree3 = new LinkedList<>();
		LinkedList<Drawable> tree4 = new LinkedList<>();
				
		StdDraw.enableDoubleBuffering();
		
		// initial THE SCENE
		StdDraw.show();
		init.add(new Bubbles(20));
		init.add(new Forest(175));
		init.add(new Leaves(130));
		init.add(new Line());
		init.add(new Poly());
		init.add(new Square(0.1, 0.03, 0.25));
		init.add(new Dragon(0, 0, 1));
		init.add(new Tree(0, 0, 1));
		Sequence initDrawable = new Sequence(init); // cannot draw lists, can draw sequences
		initDrawable.draw();
		StdDraw.show();
		
		// each .put adds the string name and drawable to the Map
		theScene.put("init", initDrawable);
		
		// BUBBLES 1
		bubbles1.add(new Bubbles(20));
		Sequence b1 = new Sequence(bubbles1);
		theScene.put("b1", b1);
		
		// BUBBLES 2
		bubbles2.add(new Bubbles(55));
		Sequence b2 = new Sequence(bubbles2);
		theScene.put("b2", b2);
		
		// BUBBLES 3
		bubbles3.add(new Bubbles(85));
		Sequence b3 = new Sequence(bubbles3);
		theScene.put("b3", b3);
		
		// BUBBLES 4
		bubbles4.add(new Bubbles(100));
		Sequence b4 = new Sequence(bubbles4);
		theScene.put("b4", b4);
		
		// FOREST 1
		forest1.add(new Forest(15));
		Sequence f1 = new Sequence(forest1);
		theScene.put("f1", f1);
		
		// FOREST 2
		forest2.add(new Forest(35));
		Sequence f2 = new Sequence(forest2);
		theScene.put("f2", f2);
		
		// FOREST 3
		forest3.add(new Forest(65));
		Sequence f3 = new Sequence(forest3);
		theScene.put("f3", f3);
		
		// FOREST 4
		forest4.add(new Forest(100));
		Sequence f4 = new Sequence(forest4);
		theScene.put("f4", f4);
		
		// LEAVE 1
		leaves1.add(new Leaves(15));
		Sequence l1 = new Sequence(leaves1);
		theScene.put("l1", l1);
		
		// LEAVES 2
		leaves2.add(new Leaves(35));
		Sequence l2 = new Sequence(leaves2);
		theScene.put("l2", l2);
		
		// LEAVES 3
		leaves3.add(new Leaves(65));
		Sequence l3 = new Sequence(leaves3);
		theScene.put("l3", l3);
		
		// LEAVES 4
		leaves4.add(new Leaves(100));
		Sequence l4 = new Sequence(leaves4);
		theScene.put("l4", l4);
		
		// LINE 1
		line1.add(new Line());
		Sequence n1 = new Sequence(line1);
		theScene.put("n1", n1);
		
		// LINE 2
		line2.add(new Line());
		Sequence n2 = new Sequence(line2);
		theScene.put("n2", n2);
		
		// LINE 3
		line3.add(new Line());
		Sequence n3 = new Sequence(line3);
		theScene.put("n3", n3);
		
		// LINE 4
		line4.add(new Line());
		Sequence n4 = new Sequence(line4);
		theScene.put("n4", n4);
		
		// POLY 1
		poly1.add(new Poly());
		Sequence p1 = new Sequence(poly1);
		theScene.put("p1", p1);
		
		// POLY 2
		poly2.add(new Poly());
		Sequence p2 = new Sequence(poly2);
		theScene.put("p2", p2);
		
		// POLY 3
		poly3.add(new Poly());
		Sequence p3 = new Sequence(poly3);
		theScene.put("p3", p3);
		
		// POLY 4
		poly4.add(new Poly());
		Sequence p4 = new Sequence(poly4);
		theScene.put("p4", p4);
		
		// SQUARE 1
		square1.add(new Square(0.25, 0.2, 0.25));
		Sequence s1 = new Sequence(square1);
		theScene.put("s1", s1);
		
		// SQUARE 2
		square2.add(new Square(0.8, 0.6, 0.05));
		Sequence s2 = new Sequence(square2);
		theScene.put("s2", s2);
		
		// SQUARE 3
		square3.add(new Square(0, 0, 0.3));
		Sequence s3 = new Sequence(square3);
		theScene.put("s3", s3);
		
		// SQUARE 4
		square4.add(new Square(0.5, 0.55, 0.3));
		Sequence s4 = new Sequence(square4);
		theScene.put("s4", s4);
		
		// DRAGON 1
		dragon1.add(new Dragon(0.3, 0, 1));
		Sequence d1 = new Sequence(dragon1);
		theScene.put("d1", d1);
		
		// DRAGON 2
		dragon2.add(new Dragon(-0.4, 0.7, 1));
		Sequence d2 = new Sequence(dragon2);
		theScene.put("d2", d2);
		
		// DRAGON 3
		dragon3.add(new Dragon(0.6, -0.2, 1));
		Sequence d3 = new Sequence(dragon3);
		theScene.put("d3", d3);
		
		// DRAGON 4
		dragon4.add(new Dragon(0.5, 0.5, 1));
		Sequence d4 = new Sequence(dragon4);
		theScene.put("d4", d4);
		
		// TREE 1
		tree1.add(new Tree(0.3, 0.3, 1));
		Sequence t1 = new Sequence(tree1);
		theScene.put("t1", t1);
		
		// TREE 2
		tree2.add(new Tree(-0.4, -0.2, 1));
		Sequence t2 = new Sequence(tree2);
		theScene.put("t2", t2);
		
		// TREE 3
		tree3.add(new Tree(0.5, -0.5, 1));
		Sequence t3 = new Sequence(tree3);
		theScene.put("t3", t3);
		
		// TREE 4
		tree4.add(new Tree(0.1, 0.2, 1));
		Sequence t4 = new Sequence(tree4);
		theScene.put("t4", t4);
		
		// COMMANDS MENU
		System.out.println("----------");
		System.out.println("Scenes");
		
		System.out.println("b1: bubbles 1");
		System.out.println("b2: bubbles 2");
		System.out.println("b3: bubbles 3");
		System.out.println("b4: bubbles 4");
		
		System.out.println("clear: clear the screen");
		System.out.println("init: initial scene");
		System.out.println("end: end the scene");
		
		System.out.println("f1: Forest 1");
		System.out.println("f2: Forest 2");
		System.out.println("f3: Forest 3");
		System.out.println("f4: Forest 4");
		
		System.out.println("l1: Leaves 1");
		System.out.println("l2: Leaves 2");
		System.out.println("l3: Leaves 3");
		System.out.println("l4: Leaves 4");
		
		System.out.println("n1: Line 1");
		System.out.println("n2: Line 2");
		System.out.println("n3: Line 3");
		System.out.println("n4: Line 4");
		
		System.out.println("p1: Poly 1");
		System.out.println("p2: Poly 2");
		System.out.println("p3: Poly 3");
		System.out.println("p4: Poly 4");
		
		System.out.println("s1: Square 1");
		System.out.println("s2: Square 2");
		System.out.println("s3: Square 3");
		System.out.println("s4: Square 4");
		
		System.out.println("d1: Dragon 1");
		System.out.println("d2: Dragon 2");
		System.out.println("d3: Dragon 3");
		System.out.println("d4: Dragon 4");
		
		System.out.println("t1: Tree 1");
		System.out.println("t2: Tree 2");
		System.out.println("t3: Tree 3");
		System.out.println("t4: Tree 4");
		
		System.out.println("----------");
		
		System.out.println("LETS BEGIN :)");
		String m = in.next();
		
		while(m.equals("end") == false) { // while end is NOT typed
			if(m.equals("clear") == true) { // if clear is typed, program clears
				Clear c = new Clear(); 
				StdDraw.show();
				c.draw();
				StdDraw.show();
			}
			if(theScene.containsKey(m) == true) {
				StdDraw.show();
				theScene.get(m).draw();
				StdDraw.show();
			}
			if(m.equals("init")) { // draw initial scene if init is typed
				StdDraw.show();
				initDrawable.draw();
				StdDraw.show();
			}
			if(m.equals("record")) { // to record the scenes if typed
				Clear i = new Clear();
				StdDraw.show();
				i.draw();
				StdDraw.show();
				
				System.out.println("Recording Name?");
				String n = in.next();
				
				LinkedList<Drawable> display = new LinkedList<Drawable>();
				
				System.out.println("What are you recording first?");
				String e = in.next();
				
				while(e.equals("end") == false) {
					if(theScene.containsKey(e) == true) {
						display.add(theScene.get(e));
						StdDraw.show();
						theScene.get(e).draw();
						StdDraw.show();
						e = in.next();
					}
				}
				Sequence drawable = new Sequence(display);
				theScene.put(n, drawable);
				System.out.println(n);
			}
			System.out.println("WHATS NEXT?");
			m = in.next();
		}
		
		//
		// for demo only, remove this code and write your own to do what
		//   is needed for this assignment
//		while(true) {
//			StdDraw.show();
//			StdDraw.pause(10);
//			for (int i = 0; i < 10; ++i) {
//				Forest f = new Forest(5);
//				f.draw(); f.draw(); f.draw(); f.draw();
//				Leaves l = new Leaves(5);
//				l.draw(); l.draw();
//			}
//			Bubbles b = new Bubbles(10);
//			b.draw();
//			StdDraw.show();
//			StdDraw.pause(10);
//			System.out.println("Again?");
//			String resp = in.nextLine();
//			if (resp.equals("no")) {
//				break;
//			}
//			else {
//				new Clear().draw();
//			}
//		}
		//
		// end of demo code
		//
	}
}