package fifthJava;

import java.util.Scanner;

public class arrayEx {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("enter the size of an array");
		int size=s.nextInt();
		int num[]=new int[size];
		System.out.println("Enter the array elements");
		for(int i=0;i<size;i++)
		{
			num[i]=s.nextInt();
		}
        System.out.println("the array elements are");
        int sum=0;
        for(int i=0;i<num.length;i++)
        {
        	
           sum=sum+num[i];

        	System.out.println(num[i]);	
        }
        System.out.println("the sum is :"+sum);
	}

}



