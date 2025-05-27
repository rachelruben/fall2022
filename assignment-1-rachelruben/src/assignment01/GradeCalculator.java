package assignment01;

import java.util.Scanner;

public class GradeCalculator {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter your Name: ");
		String firstName = in.next();
		String lastName = in.next();
		
		
		System.out.println("CSE131 Grade for: " + firstName + " " + lastName);
	
		System.out.print("Input average assignment grade: ");
		double averageAssignment = in.nextDouble();
		
		System.out.println("Average Assignment Grade is: " + averageAssignment + "%");
		
		double weightedAssignment = averageAssignment * 0.30;
		double roundOff1 = (double)Math.round(weightedAssignment*100)/100;
		System.out.println("Weighted Assignment Grade (out of 30): " + roundOff1 + "%");
		
		System.out.println("Number of extension points (out of 40): ");
		int extensionPoints = in.nextInt();
		
		double weightedExtension = extensionPoints * 10.0 / 40.0;
		double roundOff2 = (double)Math.round(weightedExtension*100)/100;
		System.out.println("Weighted Extension Grade (out of 10): " + roundOff2 + "%");
		
		System.out.println("Number of studios attended (out of 8): ");
		double studiosAttended = in.nextInt();
		double weightedStudio = (studiosAttended / 8) * 10.0;
		System.out.println("Weighted Studio Grade (out of 10): " + weightedStudio + "%");
		
		System.out.print("Input average quiz grade: ");
		double averageQuiz = in.nextDouble();
		
		System.out.println("Average Quiz Grade: " + averageQuiz + "%");
		
		
		double weightedQuiz = averageQuiz * 0.02;
		double roundOff4 = (double)Math.round(weightedQuiz*100)/100;
		System.out.println("Weighted Quiz Grade (out of 2): " + roundOff4 + "%");
		
		
		System.out.println("Number of studio preps completed (out of 10): ");
		double studioPreps = in.nextInt();
		double weightedStudioPreps = studioPreps / 10 * 2;
		double roundOff5 = (double)Math.round(weightedStudioPreps*100)/100;
		System.out.println("Weighted Studio Prep Grade (out of 2): " + roundOff5 + "%");
		
		System.out.print("Input average exam grade: ");
		double averageExam = in.nextDouble();
		
		System.out.println("Average Exam Grade: " + averageExam + "%");
		
		double weightedExam = averageExam * 0.45;
		double roundOff7 = (double)Math.round(weightedExam*100)/100;
		System.out.println("Weighted Exam Grade (out of 45): " + roundOff7 + "%");
		
		//System.out.println("Completed Course Review: ");
		//boolean courseReview = Math.random() > 0.5;
		//System.out.println(courseReview);
		
		double variable = Math.random();
		boolean courseReview = variable < 0.5;
		System.out.println("Completed Course Review: " + courseReview);

		double weightedOne = (double)Math.round(weightedAssignment*100)/100;
		double weightedTwo = (double)Math.round(weightedExtension*100)/100;
		double weightedThree = (studiosAttended / 8) * 10.0;
		double weightedFour = (double)Math.round(weightedQuiz*100)/100;
		double weightedFive = (double)Math.round(weightedStudioPreps*100)/100;
		double weightedSix = (double)Math.round(weightedExam*100)/100;
		double totalGrade = weightedOne + weightedTwo + weightedThree + weightedFour + weightedFive + weightedSix + 1;
		
		System.out.println("Total Grade: " + totalGrade + "%");
		
	
		
		
	}
	//also figure out if you need the number of extension points and number of studios attended to show up differently
	    //once again not sure if my boolean is working 
		//might have to recode the system out because of formatting
	//figure out if weighting is correct for stuff
		
		//use double for averages , figure out if extensions are whole number things 
		//or if you can get like 35.5 out of 40.0 points
		//use String for names
		//there are nine assignments 0 to 100 points 30% of grade
		//2 extension batches 0 to 40 points each extension is worth 5%
		//studios are 10% of grade
		//nine quizzes but two get dropped so 7 2% of grade
		//nine prestudio preps 2% of grade
		//exams are 45% of grade 
	//i also have absolutely no idea how i am supposed to do the total grade bc it says those variables aren't available
		
	}


