package module8._01lists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class UsingLists {

	public static void main(String[] args) {
		
		//your code here!!
		List<String> shopping = new ArrayList<String>();
		
		shopping.add("carrots");
		shopping.add("bread");
		shopping.add("chocolate");
		
		System.out.println(shopping);
		System.out.println(shopping.get(0));
		System.out.println(shopping.get(1));
		
		shopping.set(1, "chocolate");
		
		shopping.remove(2);
		System.out.println(shopping);
		
	}
}
