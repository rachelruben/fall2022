package module8._03equality;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Person {

	private String name;
	private int id;
	
	public Person(String name, int id) {
		this.name = name;
		this.id = id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return id == other.id;
	}
	
	public static void main(String[] args) {
		Person p1 = new Person("John Smith", 1);
		Person p2 = new Person("John Smith", 2);
				
		//Returns false because they have different ids
		System.out.println(p1.equals(p2));
		
		//Notice that this does NOT create a new person
		//This creates a new **reference** to a person.
		//New objects are only created when the constructor
		//is called using the "new" keyword
		Person p3 = p2;
		
		//True because values are equal
		System.out.println("p2.equals(p3): " + p2.equals(p3));
		
		//True because p2 and p3 are the **same** object
		//In other words, there is only one object being referred to in this line:
		System.out.println("p2 == p3: " + (p2 == p3));
		
		//This introduces a third person and creates a reference (p4) to this separate person
		Person p4 = new Person("John Smith", 2);
		
		//Will be true because **contents** are equal (equal IDs)
		System.out.println("p4.equals(p3): " + p4.equals(p3));

		//Will be false because even though the contents are equal,
		//these are two different **objects**. In other words,
		//p3, and p4 do not refer to the same Person.
		System.out.println("p3 == p4: " + (p3 == p4));
		
		//What will this be? Why?
		System.out.println("p2 == p4: " + (p2 == p4));


	}
}
