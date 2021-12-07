package fourthJava;

import java.util.Scanner;

public class vowelEx {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		char[] ch=new char[10];
		System.out.println("Enter characters");
		int count=0;
		
		for(int i=0;i<10;i++)
		{
	     char c=s.next().charAt(0);
	    if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
				count=count+1;
			}
			
		}
		System.out.println("Total number of vowels are:"+count);
		}
}

	
	

	
