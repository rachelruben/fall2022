package module8._01lists;

import module8._03equality.Person;
import module8._03equality.Point;

public class TV {

	private int channel;
	private final String[] sources = {"CHAN", "HDMI", "USB"};
	private int currentSource;
	
	public TV() {
		currentSource = 0;
		channel = 100;
	}
	
	public void nextSource() {
		currentSource++;
		currentSource = currentSource % sources.length;
		if(currentSource == 1) {
			channel = 100;
		}
	}
	
	public void chanUp() {
		channel++;
	}
	
	public String settings() {
		String sourceName = sources[currentSource];
		if(currentSource == 1) {
			sourceName = sourceName + " " + channel;
		}
		return sourceName;
	}

	
	public String toString() {
		return "C = " + channel + " S = " + currentSource;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null || getClass() != obj.getClass())
			return false;
		TV other = (TV) obj;
		if(channel != other.channel)
			return false;
		if(sources[currentSource] != other.sources[currentSource])
			return false;
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TV tv = new TV();
		TV tv2 = new TV();
				
		System.out.println(tv.settings());
		
		System.out.println(tv);
		
		tv.chanUp();
		tv.chanUp();
		System.out.println(tv);
		
		tv.nextSource();
		System.out.println(tv);
		
		System.out.println(tv2.settings());
		
		System.out.println(tv2);
		
		tv2.chanUp();
		System.out.println(tv2);
		
//		tv2.nextSource();
//		tv.nextSource();
		System.out.println(tv2);
		
		//Returns false because they have different ids
		System.out.println(tv.equals(tv2));
		//Notice that this does NOT create a new person
		//This creates a new **reference** to a person.
		//New objects are only created when the constructor
		//is called using the "new" keyword
		TV tv3 = tv2;
		
		//True because values are equal
		System.out.println("tv2.equals(tv3): " + tv2.equals(tv3));
		
		//True because p2 and p3 are the **same** object
		//In other words, there is only one object being referred to in this line:
		System.out.println("tv2 == tv3: " + (tv2 == tv3));
		
		//This introduces a third person and creates a reference (p4) to this separate person
		TV tv4 = new TV();
		
		//Will be true because **contents** are equal (equal IDs)
		System.out.println("tv4.equals(tv3): " + tv4.equals(tv3));

		//Will be false because even though the contents are equal,
		//these are two different **objects**. In other words,
		//p3, and p4 do not refer to the same Person.
		System.out.println("tv3 == tv4: " + (tv3 == tv4));
		
		//What will this be? Why?
		System.out.println("tv2 == tv4: " + (tv2 == tv4));

	}

	}
