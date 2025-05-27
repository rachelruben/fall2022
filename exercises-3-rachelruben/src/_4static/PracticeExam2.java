package _4static;

public class PracticeExam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//fun(4);
		System.out.println(fun(4));
	}
	public static int fun(int k) {
		if(k > 25) {
			return k;
		}
		else {
			return fun(k * 2 - 1) + 1;
		}
	}
	
}
