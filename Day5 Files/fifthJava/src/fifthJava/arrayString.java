package fifthJava;

import java.util.Scanner;

public class arrayString {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("enter the size of an array");
		int size=s.nextInt();
		String num[]=new String[size];
		System.out.println("Enter the array elements");
		for(int i=0;i<size;i++)
		{
			num[i]=s.next();
		}
        System.out.println("The array elements are");
        for(int i=0;i<num.length;i++)
        {
        	System.out.println(num[i]);	
        }
       

	}

}
