package fifthJava;

import java.util.Scanner;

public class duplicateNumArray {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the array size");
		int size=s.nextInt();
		int[] num=new int[size];
		System.out.println("Enter the array elements");
		
		for(int i=0;i<size;i++)
		{
			num[i]=s.nextInt();
			
		}
		System.out.println("Enter the number to check the duplicacy");
		int n=s.nextInt();
		int dup=-1;
		for(int i=0;i<num.length;i++)
		{
			if(num[i]==n)
			{
				dup++;
			}				
		}
		System.out.println("The number of duplicacy of "+n+"  is: "+dup);

	}

}
