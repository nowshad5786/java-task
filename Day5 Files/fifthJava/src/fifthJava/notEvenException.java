package fifthJava;

import java.util.Scanner;

public class notEvenException {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=s.nextInt();
		try {
			if(n%2!=0)
			{
				throw new numbers("Not an even number exception");
			}
			else {
				System.out.println("The number is:" +n);
			}
		}	
		catch(numbers n1){
			System.out.println(n1);			
		}
	}
}

class numbers extends Exception{
	String message;
	public numbers(String message) {
		super(message);
	}
	}

