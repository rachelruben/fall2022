package assignment7;

public class Student {
	
	private String firstName;
	private String lastName;
	private int id;
	
	/**
	 * 
	 * @param firstName
	 * @param lastName
	 * @param id
	 */
	public Student(String firstName, String lastName, int id) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
	}
	/**
	 * 
	 * @return full name
	 */
	public String getFullName() {
		return this.firstName + " " + this.lastName;
	}
	/**
	 * 
	 * @return student id
	 */
	public int getId() {
		return this.id;
	}
	
	private double GPA;
	private double qualityPoints;
	private int creditsAttempt;
	private int creditsPass;
	/**
	 * 	
	 * @param grade
	 * @param credits
	 */
	public void submitGrade(double grade, int credits) {
		this.creditsAttempt += credits;
		this.GPA += grade;
		this.qualityPoints += credits * grade;
		
		if(grade >= 1.7) { //considered passing
			this.creditsPass += credits;
		}
	}
	/**
	 * 
	 * @return attempted credits
	 */
	public int getTotalAttemptedCredits() {
		return this.creditsAttempt;
	}
	/**
	 * 
	 * @return passing credits
	 */
	public int getTotalPassingCredits() {
		return this.creditsPass;
	}
	/**
	 * 
	 * @return GPA
	 */
	public double calculateGradePointAverage() {
		this.GPA = this.qualityPoints / this.creditsAttempt;
		return this.GPA;
	}
	/**
	 * 
	 * @return class standing based on credits
	 */
	public String getClassStanding() {
		if(this.creditsPass >= 90) { //based on PASSING credits
			return "Senior";
		}
		else if(this.creditsPass < 90 && this.creditsPass >= 60) {
			return "Junior";
		}
		else if(this.creditsPass < 60 && this.creditsPass >= 30) {
			return "Sophomore";
		}
		else {
			return "First Year";
		}
	}
	/**
	 * 
	 * @return boolean regarding eligibility for Phi Beta Kappa
	 */
	public boolean isEligibleForPhiBetaKappa() {
		//student has GPA at least 3.6 AND attempted at least 98 credits
		if((this.GPA >= 3.60 && this.creditsAttempt >= 98)) {
			return true;
		}
		//student has GPA at least 3.8 AND attempted at least 75 credits
		else if(this.GPA >= 3.80 && this.creditsAttempt >= 75) {
			return true;
		}
		else {
			return false; //otherwise ineligible
		}
	}
	
	private double bearbucksAmount; 
	/**
	 * 
	 * @param amount
	 */
	public void depositBearBucks(double amount) {
		this.bearbucksAmount = this.bearbucksAmount + amount;
	}
	/**
	 * 
	 * @param amount
	 */
	public void deductBearBucks(double amount) {
		this.bearbucksAmount = this.bearbucksAmount - amount;
	}
	/**
	 * 
	 * @return bear bucks balance
	 */
	public double getBearBucksBalance() {
		return this.bearbucksAmount;
	}
	/**
	 * 
	 * @return cash out bear bucks amount 
	 */
	public double cashOutBearBucks() {
		double balanceRemain = this.bearbucksAmount;
		if(balanceRemain >= 0) { 
			if(balanceRemain > 10) { //balance of more than $10
				deductBearBucks(balanceRemain); //remaining refunded
				return (balanceRemain - 10); //minus $10 admin fee
			}
			else { //balance of $10 or less
				deductBearBucks(balanceRemain);
				return 0; //balance forfeited 
			}
		}
		else { //balance is negative (N/A)
			return -1;
		}
	}
	/**
	 * 
	 * @param firstName
	 * @param other
	 * @param isHyphenated
	 * @param id
	 * @return new student x
	 */
	public Student createLegacy(String firstName, Student other, boolean isHyphenated, int id) {
		if(isHyphenated) { //hyphenated name means you have to write it differently
			Student x = new Student(firstName, this.lastName + "-" + other.lastName, id);
			double parentOneCashOut = other.cashOutBearBucks(); //parent1 is other.
			double parentTwoCashOut = this.cashOutBearBucks(); //parent2 is this.
			double totalCash = parentOneCashOut + parentTwoCashOut;
			x.depositBearBucks(totalCash);
			return x;
		}
		else {
			Student x = new Student(firstName, this.lastName, id);
			double parentOneCashOut = other.cashOutBearBucks();
			double parentTwoCashOut = this.cashOutBearBucks();
			double totalCash = parentOneCashOut + parentTwoCashOut;
			x.depositBearBucks(totalCash);
			return x;
		}
	}
	/**
	 * @return students full name and id
	 */
	public String toString() {
		return firstName + " " + lastName + " " + id;
	}
}