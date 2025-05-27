package module9._01maps;

import java.util.HashMap;
import java.util.Map;

public class Exam3Practice {

	private Map<String, Integer> map;
	private String popString;
	private int popCount;
	
	public Exam3Practice() {
		this.map = new HashMap<String, Integer>();
		if(map.get(popString) != null) {
			popCount++;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> things = new HashMap<>();
		HashMap<String, String> to = new HashMap<>();
		things.put("willow", "tree");
		things.put("fluffy", "dog");
		things.put("fang", "dog");
		things.put("willow", "whomping");
		to.put("dog", "animal");
		to.put("tree", "plant");
		to.put("fang", "boarhound");
		System.out.println(things.size());
		System.out.println(to.size());
		System.out.println(things.get("fang"));
		System.out.println(to.get("fang"));
		System.out.println(to.get(things.get("fang")));
	}

}
