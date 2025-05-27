package module9._01maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Fall2018Q12 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Double> map = new HashMap<String, Double>();
		Scanner in = new Scanner(System.in);
		
//		System.out.println("How many key value pairs?");
//		int n = in.nextInt();
		
		map.put("hi", 1.0);
		map.put("bye", 2.0);
		map.put("yes", 3.0);
//		for(int i = 0; i < n; i++) {
//			String key = in.next("key?");
//			System.out.println("value?");
//			Double value = in.nextDouble();
//			map.put(key, value);
//		}
		System.out.println("There are " + map.size() + " entries.");
		for(String key : map.keySet()) {
			System.out.println(key + " -> " + map.get(key));
		}

	}

}
