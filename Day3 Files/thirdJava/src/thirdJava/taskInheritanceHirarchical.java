package thirdJava;

import java.util.Scanner;

public class taskInheritanceHirarchical {

	public static void main(String[] args) {
		MPCMarks m=new MPCMarks();
		CECMarks c= new CECMarks();
		m.readDetails();
		m.readMPCMarks();
		c.readCECMarks();
		m.displayDetails();
		m.displayMPCMarks();
		c.displayCECMarks();
	}
	
}
 class newstud{
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
 
 
 
 class MPCMarks extends newstud{
	 int Mathmarks1,Physicsmarks2,Chemistrymarks3;
	
	 
	 void readMPCMarks() {
		 System.out.println("Enter math marks:");
		 Mathmarks1=s.nextInt();
		 System.out.println("Enter physics marks:");
		 Physicsmarks2=s.nextInt();
		 System.out.println("Enter chemistry marks:");
		 Chemistrymarks3=s.nextInt();
		 
	 }
	 void displayMPCMarks() {
		 System.out.println("math:"+Mathmarks1);
		 System.out.println("physics:"+Physicsmarks2);
		 System.out.println("chemistry:"+Chemistrymarks3);
	 
 }}

 class CECMarks extends newstud{
	 int Commercemarks1,Economicsmarks2,Civicsmarks3;
	
	 
	 void readCECMarks() {
		 System.out.println("Enter commerce marks:");
		 Commercemarks1=s.nextInt();
		 System.out.println("Enter Economics marks:");
		 Economicsmarks2=s.nextInt();
		 System.out.println("Enter Civics marks:");
		 Civicsmarks3=s.nextInt();
		 
	 }
	 void displayCECMarks() {
		 System.out.println("Commerce:"+Commercemarks1);
		 System.out.println("Economics:"+Economicsmarks2);
		 System.out.println("Civics:"+Civicsmarks3);
	 
 }}
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 