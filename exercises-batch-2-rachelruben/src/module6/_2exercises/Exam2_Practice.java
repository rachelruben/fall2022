package module6._2exercises;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.Arrays;
import java.util.Scanner;

import edu.princeton.cs.introcs.StdDraw;

public class Exam2_Practice {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
//		System.out.println(direction());
		
//		String[] val1 = {"E", "T", "I", "D", "R", "G", "A"};
//		System.out.println(select(val1, 1, 1));
//		String[] val2 = {"E", "T", "I", "D", "R", "G", "A"};
//		System.out.println(select(val2, 4, 4));
		
//		System.out.println(prod(4,2,1));
//		System.out.println(sq(4));
//		double d = root(3,4,5);
//		System.out.println(f(1));
//		System.out.println(f(3));
		
//		m(-2,-1);
//		m(2,0);
//		m(4,4);
//		m2(2,0);
//		m2(2,4);
		
//		int[] a = {1, 3, 5, 7};
//		int[] b = {2, 4, 6, 8, 10};
//		int[] mergedArrays = merge(a,b);
//		System.out.println(Arrays.toString(a));
//		System.out.println(Arrays.toString(b));
//		System.out.println(Arrays.toString(mergedArrays));
		
//		boxy(0.5, 0.5, 0.25);
		
//		recursiveCarpet(0.5, 0.5, 0.1);
		
//		int y = 3; 
//		int m = b(y);
//		System.out.println(m);
//		System.out.println(y);
//		
//		int n = c(3);
//		System.out.println(n);
//		
//		System.out.println(d(1));
//		
//		m(-2, -1);
//		System.out.println();
//
//		m(2, 0);
//		System.out.println();
//		
//		m(4, 4);
//		System.out.println();
//
//		m(2, 4);
//		System.out.println();
//		m2(2, 0);
//		System.out.println();
//
//		m2(2, 4);
//		Scanner in = new Scanner(System.in);
		
//		System.out.println("Height in feet? ");
//		double height = in.nextDouble();
//		double heightm = height * 0.3048;
//		double heightm2dp = (int)(heightm * 100) / 100.0;
//		System.out.println("Height in meters " + heightm2dp);
//		
//		System.out.println("Width in feet? ");
//		double width = in.nextDouble();
//		double widthm = width * 0.3048;
//		double widthm2dp = (int)(widthm * 100) / 100.0;
//		System.out.println("Width in meters " + widthm2dp);
//		
//		System.out.println("Depth in feet? ");
//		double depth = in.nextDouble();
//		double depthm = depth * 0.3048;
//		double depthm2dp = (int)(depthm * 100) / 100.0;
//		System.out.println("Depth in meters " + depthm2dp);
		
//		REFACTOR METHOD
//		prompter("Height", in.nextDouble());
//		prompter("Width", in.nextDouble());
//		prompter("Depth", in.nextDouble());
		
//		double distance = 0.02;
//		StdDraw.show(10);
//		dashedLine(distance);
//		StdDraw.show(100);
//		zeno(0);
		
//		String[] texts = { "able was i ere i saw elba", "abba", "mom", "dad", "a", "ab", "bonbon", "cytron" };
//		for(int i = 0; i < texts.length; ++i) {
//			System.out.println("result: " + isPalindromeViaRecursion(texts[i]) + "     text: " + texts[i]);
//		}
//		for(int i = 0; i < texts.length; ++i) {
//			System.out.println("result: " + isPalindromeViaLoop(texts[i]) + "    text: " + texts[i]);
//		}
	}
		
//		RECURSIVE METHOD
//		public static void prompter(String description, double value) {
//			double valuem = value * 0.3048;
//			double valuem2dp = (int)(valuem * 100) / 100.0;
//			System.out.println(description + " in meters " + valuem2dp);
//		}
//
	
//	public static int prod(int a, int b, int c) {
//		System.out.println("A: " + a);
//		return a*b*c;
//	}
//	public static double root(int a, int b, int c) {
//		double x = sq(b);
//		System.out.println("X: " + x);
//		double y = prod(a, c, -4);
//		double z = prod(1, 2, a);
//		return (-b + Math.sqrt(x+y)) / z;
//	}
//	public static int sq(int x) {
//		System.out.println("Sq: " + x);
//		return prod(1, x, x);
//	}
	
//	public static String select(String[] values, int location, int count) {
//		System.out.println(values[location]);
//		int next = 3 * location + 1;
//		if(location % 2 == 0) { //check if location is an even number
//			next = location / 2;
//		}
//		if(location == 1 || count == 0)
//			return values[location - 1];
//		else
//			return select(values, next, count - 1);
//	}
//	public static int direction() {
//		if(StdDraw.isKeyPressed(KeyEvent.VK_LEFT) && StdDraw.isKeyPressed(KeyEvent.VK_RIGHT)){
//			return 3;
//		}
//		else if(StdDraw.isKeyPressed(KeyEvent.VK_RIGHT)) {
//			return 2;
//		}
//		else if(StdDraw.isKeyPressed(KeyEvent.VK_LEFT)) {
//			return 1;
//		}
//		else {
//			return 0;
//		}
//	}
//	public static int f(int n) {
//		if(n == 1) {
//			return 1; 
//		}
//		else if(n % 2 == 0) {
//			return f(n / 2);
//		}
//		else {
//			return f(3 * n + 1);
//		}
//	}
//	public static void m(int x, int y) {
//		System.out.println("y: " + y);
//		if(x > 3) {
//			m(x-2,y);
//		}
//		else if(y>0) {
//			m(x,y-2);
//		}
//	}
//	public static void m2(int x, int y) {
//		if(y > 3) {
//			m2(x, y - 1);
//		}
//		else if(x > 0) {
//			m2(x - 2, y);
//		}
//		System.out.println("x: " + x);
//	}
//	public static int[] merge(int[] a, int[] b) {
//		int[] result = new int[a.length + b.length];
//		int aPos = 0;
//		int bPos = 0;
//		for(int i = 0; i < result.length; i++) {
//			if(aPos < a.length && bPos < b.length && a[aPos] < b[bPos]) {
//				result[i] = a[aPos];
//				aPos++;
//			}
//			else if(bPos < b.length) {
//				result[i] = b[bPos];
//				bPos++;
//			}
//			else {
//				result[i] = a[aPos];
//				aPos++;
//			}
//		}
//		return result;
//	}
	
//	public static void boxy(double x, double y, double halfWidth) {
//		StdDraw.rectangle(x, y, halfWidth, halfWidth);
//		if(halfWidth > 0.0025) {
//			boxy(x - halfWidth, y - halfWidth, halfWidth / 2); //left bottom square
//			boxy(x + halfWidth, y - halfWidth, halfWidth / 2); //right bottom square
//		}
//	}
//	public static void recursiveCarpet(double x, double y, double halfWidth) {
//		StdDraw.filledRectangle(x, y, halfWidth, halfWidth);
//		if(halfWidth > 0.0025) {
//			recursiveCarpet(x - 2 * halfWidth, y + 2 * halfWidth, halfWidth / 3);
//			recursiveCarpet(x + 2 * halfWidth, y + 2 * halfWidth, halfWidth / 3);
//			recursiveCarpet(x - 2 * halfWidth, y - 2 * halfWidth, halfWidth / 3);
//			recursiveCarpet(x + 2 * halfWidth, y - 2 * halfWidth, halfWidth / 3);
//		}
//	}
//	public static int a(int x) {
//		System.out.println("A");
//		return x + 3;
//	}
//	public static int b(int y) {
//		System.out.println("B");
//		y = y + 1;
//		return y;
//	}
//	public static int c(int z) {
//		System.out.println("C");
//		int w = a(z);
//		w = w + b(z);
//		return w;
//	}
//	public static int d(int w) {
//		System.out.println("D");
//		System.out.println(c(w));
//		return w * 5;
//	}
//	public static void m(int x, int y) {
//		System.out.println("x: " + x);
//		if(y > 3) {
//			m(x, y - 1);
//		}
//		else if(x > 0) {
//			m(x - 2, y);
//		}
//	}
//	
//	public static void m2(int x, int y) {
//		if(y > 3) {
//			m(x, y - 1);
//		}
//		else if(x > 0) {
//			m(x - 2, y);
//		}
//		System.out.println("x: " + x);
//	}
//	public static double fahrenheitToKelvin(double degreesFahrenheit) {
//		return (degreesFahrenheit + 459.67) * (5.0/9.0);
//	}
//	
//	public static double calculatePressure(double v, double n, double r, double tF) {
//		return (n*r*fahrenheitToKelvin(tF)) / v;
//	}
//	public static void dashedLine(double x) {
//		StdDraw.setPenColor(Color.BLUE);
//		double distance = 0.02;
//		double y = 0;
//		
//		for(int i = 0; i < 25; i++) {
//			StdDraw.line(x, y, x, y + distance);
//			y = 0.04 + y;
//		}
//	}
//	
//	public static void zeno(double x) {
//		if(x == 0.96875) {
//			dashedLine(x);
//		}
//		else {
//			StdDraw.line(x, 0, x, 1);
//			zeno(x + 0.5 * (1 - x));
//		}
//	}
	//RECURSIVE METHOD
//	private static String slice(String input, int b, int e) {
//		String s = "";
//		for(int i = b; i < e; ++i) {
//			s = s + input.charAt(i);
//		}
//		return s;
//	}
//	private static String onlyFirst(String input) {
//		return slice(input, 0, 1);
//	}
//	private static String onlyLast(String input) {
//		return slice(input, input.length() - 1, input.length());
//	}
//	private static String allButFirstAndLast(String input) {
//		return slice(input, 1, input.length() - 1);
//	}
//	private static int length(String input) {
//		return input.length();
//	}
	
//	public static boolean isPalindromeViaRecursion(String s) {
//		if(length(s) <= 1) {
//			return true;
//		}
//		if(s.charAt(0) == s.charAt(length(s) - 1)) {
//			return isPalindromeViaRecursion(allButFirstAndLast(s));
//		}
//		return false;	
//	}
	//ITERATIVE METHOD
//	public static boolean isPalindromeViaLoop(String s) {
//		int i = 0;
//		int last = length(s) - 1;
//		while(length(s) > i) {
//			if(s.charAt(i) != s.charAt(last))
//				
//			return false;
//			i++;
//			last--;
//		}
//		return true;
//	}
}

	



