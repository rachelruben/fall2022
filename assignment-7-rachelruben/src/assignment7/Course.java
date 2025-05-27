package assignment7;

public class Course {
	
	private String courseName;
	private int courseCredits;
	private int capacity;
	private int seatsFilled;
	private Student[] studentEnrolled; //to keep track of student enrollment
	private int x;
	
	/**
	 * 
	 * @param courseName
	 * @param courseCredits
	 * @param capacity
	 */
	public Course(String courseName, int courseCredits, int capacity) {
		this.courseName = courseName;
		this.courseCredits = courseCredits;
		this.capacity = capacity;
		this.seatsFilled = 0;
		this.studentEnrolled = new Student[capacity];
		this.x = 0;
	}
	/**
	 * 
	 * @return course name
	 */
	public String getName() {
		return this.courseName;
	}
	/**
	 * 
	 * @return course credits
	 */
	public int getCredits() {
		return this.courseCredits;
	}
	/**
	 * 
	 * @return number of seats in the classroom
	 */
	public int getCapacity() {
		return this.capacity;
	}
	/**
	 * 
	 * @return number of seats remaining in the classroom
	 */
	public int getSeatsRemaining() {
		return this.capacity - this.seatsFilled;
	}
	/**
	 * 
	 * @param s student
	 * @return whether or not student has been enrolled
	 */
	public boolean addStudent(Student s) {
		int id = s.getId();
		if(this.seatsFilled >= this.capacity) { //full class
			return false; //cannot enroll
		}
		for(int i = 0; i < this.seatsFilled; i++) {
			if(this.studentEnrolled[i].getId() == id) { //if student is already enrolled
				return false; //cannot enroll
			}
		} 
		//not a full class 
		this.seatsFilled = this.seatsFilled + 1; //ensures that student gets put into empty seat
		this.studentEnrolled[this.x] = s; //that student is enrolled in the class
		this.x++;
		return true; //successful enrollment
	}
	/**
	 * 
	 * @param index
	 * @return student at the index added
	 */
	public Student getStudentAt(int index) {
		return studentEnrolled[index];
	}
	/**
	 * 
	 * @return roster containing enrolled students' names 
	 */
	public String generateRoster() {
		String fullNameEnrollment = "";
		for(int i = 0; i < this.seatsFilled; i++) {
			fullNameEnrollment = fullNameEnrollment + " " + this.studentEnrolled[i].getFullName();
		}
		return fullNameEnrollment;
	}
	/**
	 * 
	 * @return average GPA of all enrolled students in the course
	 */
	public double calculateAverageGPA() {
		double totalGPA = 0;
		for(int i = 0; i < this.seatsFilled; i++) {
			totalGPA = totalGPA + studentEnrolled[i].calculateGradePointAverage();
		}
		return totalGPA / this.seatsFilled;
	}
	/**
	 * @return string name of course and credits 
	 */
	public String toString() {
		return "" + this.courseName + " " + this.courseCredits;
	}
}