package fourthJava;

import java.util.Scanner;

public class occuranceChar {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string");
		String s=sc.next();
		System.out.println("Enter the character to check the occurance");
		char c=sc.next().charAt(0);
		int count=0;
		for(int i=0;i<s.length();i++) 
		{
			if(s.charAt(i)==c)
			{
				count++;
			}
		}
		System.out.println("The total number of occurances of character is:"+count);
	}

}
