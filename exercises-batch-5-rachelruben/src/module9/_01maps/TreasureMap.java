package module9._01maps;

import java.util.Map;

public class TreasureMap {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> clues = genClues();
		clues.put(10, "0123456789");
	}

	private static Map<Integer, String> genClues() {
		// TODO Auto-generated method stub
		Map<Integer, String> clues = genClues(); //code we don't see 
		String s = "Start here";
		int len = s.length();
		
		while(s != null) {
			System.out.println("Clue: " + s);
			s = clues.get(s);
			len = s.length();
		}
		System.out.println("Treasure Found: " + s);
		return null;
	}

}
