package thirdJava;

import java.util.Scanner;

public class taskInheritanceSingle {

	public static void main(String[] args) {
		marks m=new marks();
		m.readDetails();
		m.readMarks();
		m.displayDetails();
		m.displayMarks();
		
		

	}

}
class stud{
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
  
 class marks extends stud{
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


















