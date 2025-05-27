package _this;

public class ComboLock {

	private final int[] secret;
	private int numTries;
	private int maxTries;
	private int[] recentTry;
	
	public ComboLock(int[] secret, int maxTries) {
		System.out.println("C");
		this.secret = secret;
		this.maxTries = maxTries;
		this.numTries = 0;
		this.recentTry = new int[secret.length]; // all zero
	}
	
	public String toString() {
		String ans = "#" + this.numTries;
		for(int i = 0; i < recentTry.length; i++) {
			ans = ans + " " + recentTry[i];
		}
		return ans;
	}
	
	public boolean trySoln(int[] guess) {
		numTries = numTries + 1;
		System.out.println("T: " + numTries + "/" + maxTries);
		recentTry = guess;
		if(numTries > maxTries) {
			System.out.println("X");
			return false;
		}
		for(int i = 0; i < secret.length; i++) {
			if(secret[i] != guess[i]) {
				System.out.println("F");
				return false;
			}
		}
		System.out.println("G");
		return true;
	}
	
	public int numCorrect(int[] guess) {
		int numRight = 0;
		for(int i = 0; i < secret.length; i++) {
			if(secret[i] == guess[i]) {
				numRight++;
			}
		}
		System.out.println(numRight);
		return numRight;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] secret = new int[] {1, 3, 1};
		ComboLock c2 = new ComboLock(secret, 2);
		
		//System.out.println(c2);
		//c2.trySoln(new int[] {1, 2, 3});
		c2.numCorrect(new int[] {2, 4, 5});
		System.out.println(c2);

	}

}
