package module8._02sets;

import java.util.ArrayList;
import java.util.HashSet;

public class UsingSets {

	public static void main(String[] args) {
		
		HashSet<ArrayList> set = new HashSet<>();
		
		ArrayList<Integer> list1 = new ArrayList<>();
		
		ArrayList<Integer> list2 = new ArrayList<>();
		
		list1.add(1);
		list1.add(2);
		list2.add(1);
		list2.add(2);
		set.add(list1);
		set.add(list2);
		
		System.out.println(set.size());
		
//		Person p1 = new Person("John", "Smith");
//		Person p2 = new Person("John", "Smith");
//		Set<Person> pSet = new HashSet<>();
//		pSet.add(p1);
//		pSet.add(p2);
	}
	
}
