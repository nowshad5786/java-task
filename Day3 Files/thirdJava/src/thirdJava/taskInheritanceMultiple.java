package thirdJava;

import java.util.Scanner;

public class taskInheritanceMultiple {

	public static void main(String[] args) {
		result r=new result();
		r.readDetails();
		r.readMarks();
		r.displayDetails();
		r.displayMarks();
		r.calculateResult();
		r.displayResult();
	}

}

 class sincere{
	Scanner s=new Scanner(System.in);
	int studentId;
	String studentName,phone;
	
	 void readDetails() {
	
		System.out.println("Enter the student id:");
		studentId=s.nextInt();
		System.out.println("Enter the student name:");
		studentName=s.next();
		System.out.println("Enter the student phonenumber:");
		phone=s.next();
	}

     void displayDetails() {
    	System.out.println("Student id  :"+studentId);
    	System.out.println("studen name  :"+studentName);
    	System.out.println("student phone number:"+phone);
	}
	
  }
  
 class marking extends sincere{
	 int marks1,marks2,marks3;
	
	 
	 void readMarks() {
		 System.out.println("Enter english marks:");
		  marks1=s.nextInt();
		 System.out.println("Enter hindi marks:");
		 marks2=s.nextInt();
		 System.out.println("Enter math marks:");
		 marks3=s.nextInt();
		 
	 }
	 void displayMarks() {
		 System.out.println("english:"+marks1);
		 System.out.println("hindi:"+marks2);
		 System.out.println("math:"+marks3);
	 
 }}

class result extends marking{
	int totalmarks;
	float percentage;
	String grade;
	
	void calculateResult() {
		totalmarks=marks1+marks2+marks3;
		percentage=((totalmarks*100)/300);
		if(percentage>=85) {
			grade="first Class";
		}
		else if(percentage>=55 && percentage<=85) {
			grade="second Class";
		}
		else if(percentage>=40&&percentage<=55) {
			grade="third Class";
		}
		else {
			grade="Fail";
		}	
	}
	
	void displayResult() {
		System.out.println("Total marks:" +totalmarks);
		System.out.println("Percentage:"+percentage);
		System.out.println("Grade:"+grade);
	}
}
















