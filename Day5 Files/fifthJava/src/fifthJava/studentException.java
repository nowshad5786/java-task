package fifthJava;

import java.util.Scanner;

public class studentException {

	public static void main(String[] args) throws stud{
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the marks");
		int m=s.nextInt();
		try {
			if(m<=200)
			{
				throw new stud("student failed");
			}
			else {
				System.out.println("Marks scored by student is:" +m);
			}		
		}			
		catch(stud n){
			System.out.println(n);			
		}
	}
}

class stud extends Exception{
	String message;
	public stud(String message) {
		super(message);
	}
}