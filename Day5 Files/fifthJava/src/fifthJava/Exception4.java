package fifthJava;

import java.util.Scanner;

public class Exception4 {

	public static void main(String[] args) {                       //Array Exception
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string");
		String s=sc.next();
		System.out.println("Enter the character to check the occurance");
		char c=sc.next().charAt(0);
		int count=0;
		try {
		for(int i=0;i<=s.length();i++) 
		{
			if(s.charAt(i)==c)
			{
				count++;
			}
		}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally
		{
		System.out.println("The total number of occurances of character is:"+count);
		}
	}

}
