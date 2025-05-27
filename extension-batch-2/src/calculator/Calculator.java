package calculator;

import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String text = in.nextLine();
		
		// TODO:	
		
		//no white spaces code needed 
		String noWhiteSpaces = "";
		for(int i = 0; i < text.length(); i++) {
			if(Character.isWhitespace(text.charAt(i)) == false)
				noWhiteSpaces = noWhiteSpaces + text.charAt(i);
		}
		
		//read the first number
		String snum1 = "";
		for(int i = 0; i < noWhiteSpaces.length(); i++) {
			if(Character.isDigit(noWhiteSpaces.charAt(i)) == false)
				break;
			else
				snum1 = snum1 + noWhiteSpaces.charAt(i);
		}
		
		//read the operation sign
		String operator = "";
		for(int i = 0; i < noWhiteSpaces.length(); i++) {
			if(Character.isDigit(noWhiteSpaces.charAt(i)) == false)
				operator = operator + noWhiteSpaces.charAt(i);
		}
		
		//read the second number 
		String snum2 = "";
		for(int i = 0; i < noWhiteSpaces.length(); i++) {
			if(Character.isDigit(noWhiteSpaces.charAt(i)) == false) {
				for(int j = i + 1; j < noWhiteSpaces.length(); j++) {
					snum2 = snum2 + noWhiteSpaces.charAt(j);
				}
			}
		}
		
		//parse the first integer
		int num1 = Integer.parseInt(snum1);
		
		//parse the second integer
		int num2 = Integer.parseInt(snum2);
		
		int result = 0;
		
		if(operator.equals("+")) {
			result = num1 + num2; 
		}
		else if(operator.equals("-")) {
			result = num1 - num2;
		}
		else if(operator.equals("*")) {
			result = num1 * num2;
		}
		else if(operator.equals("/")) {
			result = num1 / num2;
		}	
		System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
	}
}
