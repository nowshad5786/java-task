package fifthJava;

import java.util.Scanner;

public class negativeNumberException {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=s.nextInt();
		try {
			if(n<=0)
			{
				throw new number("Negative number exception");
			}
			else {
				System.out.println("The number is:" +n);
			}
			
		}
		
		
		catch(number n1){
			System.out.println(n1);
			
		}

	}

}

class number extends Exception{
	String message;
	public number(String message) {
		super(message);
	}
	}


