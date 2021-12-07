package fifthJava;

import java.util.Scanner;

public class stringLengthException {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the password");
		String ss=s.next();
		try {
			if(ss.length()<=10)
			{
				throw new stringg("password length doesn't match exception");
			}
			else {
				System.out.println("The password is:" +ss);
			}	
		}
		catch(stringg sn){
			System.out.println(sn);
		}
	}
}

class stringg extends Exception{
	String message;
	public stringg(String message) {
		super(message);
	}


	}


