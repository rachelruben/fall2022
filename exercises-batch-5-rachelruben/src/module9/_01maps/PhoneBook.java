package module9._01maps;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {

	public static void main(String[] args) {
		Map<String, Integer> phonebook = new HashMap<>();
	
		System.out.println("Newly created map: ");
		System.out.println("map: " + phonebook);
		System.out.println("size: " + phonebook.size());
		System.out.println("ghostbusters?: " + phonebook.get("ghostbusters"));
		
		//Let's put something in the map:
		phonebook.put("ghostbusters", 5555555);
		
		System.out.println("Updated map: ");
		System.out.println("map: " + phonebook);
		System.out.println("size: " + phonebook.size());
		System.out.println("ghostbusters?: " + phonebook.get("ghostbusters"));
		
		//Let's add some more
		phonebook.put("jenny", 8675309);
		
		//This is the same number as ghostbusters, what happens?
		phonebook.put("saul goodman", 5555555);
		
		System.out.println("After saul goodman: ");
		System.out.println("map: " + phonebook);
		System.out.println("size: " + phonebook.size());
		System.out.println("ghostbusters?: " + phonebook.get("ghostbusters"));
		System.out.println("jenny?: " + phonebook.get("jenny"));
		System.out.println("saul goodman?: " + phonebook.get("saul goodman"));

		//OK, what if we want to change a number?
		phonebook.put("ghostbusters", 1234567);
		
		//What happened to our map? Print out the appropriate values to check the contents of our data structure
	}
}
