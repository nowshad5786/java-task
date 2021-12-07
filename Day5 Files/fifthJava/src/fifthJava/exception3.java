package fifthJava;

import java.util.Scanner;

public class exception3 {

	public static void main(String[] args) {      //Aritmetic Exception
		Scanner s=new Scanner(System.in);
		System.out.println("Enter two numbers");
		int s1=s.nextInt();
		int s2=s.nextInt();
		try {
			int c=s2/s1;
		}
        catch(Exception e) {
        	System.out.println(e);
        }
	}

}
