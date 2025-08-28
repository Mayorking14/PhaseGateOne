

import java.util.Scanner;
import java.util.Arrays;

public class StudentGrade{
	public static void main(String...arg){

Scanner scanner = new Scanner(System.in);

System.out.println("Number of students: ");
	int noOfStudents = scanner.nextInt();

System.out.println("Number of subjects: ");
	int noOfSubjects = scanner.nextInt();


int[][] scores = new int[noOfStudents][noOfSubjects];



for(int student = 0; student < noOfStudents; student++){
	System.out.println("Entering score for student " + (student + 1));
		
		for(int subject = 0; subject < noOfSubjects; subject++){
		while(true){	
		System.out.print("Enter score for subject " + (subject + 1) + ":");
			int studentScore = scanner.nextInt();

	if(studentScore >= 0 && studentScore <= 100){
		scores[student][subject] = studentScore;
			break;
	}
	else{
		System.out.println("Score must be within the range of 0 - 100, Try again");
}
}
	System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
	System.out.println("Saved successfully");

}

}

	System.out.print("STUDENT\t");
for(int subject = 1; subject <= noOfSubjects; subject++){	
		System.out.print("SUB" + subject + "\t");			
}
	System.out.print("TOT\t AVE\t POS");

}

	}