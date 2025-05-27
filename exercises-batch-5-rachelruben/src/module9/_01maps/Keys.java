package module9._01maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Keys {
	
	public static void main(String[] args0) {
		Map<String, Integer> phonebook = new HashMap<>();

		phonebook.put("ghostbusters", 5555555);
		phonebook.put("jenny", 8675309);
		phonebook.put("saul goodman", 1234567);

		
		//Iterating through the key set:
		for(String name : phonebook.keySet()) {
			System.out.println(name + ": " + phonebook.get(name));
		}
		
		//Iterating through the entry set:
		for(Entry<String, Integer> pbEntry : phonebook.entrySet()) {
			System.out.println(pbEntry.getKey() + ": " + pbEntry.getValue());
		}
	}
}
