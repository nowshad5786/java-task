package fifthJava;

import java.util.Scanner;

public class averageOfArray {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the array size");
		int size=s.nextInt();
		int num[]=new int[size];
		System.out.println("Enter the array elements");
		
		for(int i=0;i<size;i++)
		{
			num[i]=s.nextInt();
			
		}
		
		int sum=0;
		for(int i=0;i<num.length;i++)
		{
			sum=sum+num[i];
		}
		int res=sum/size;
		System.out.println("The average of the given array elements are:"+res);
		

	}

}
