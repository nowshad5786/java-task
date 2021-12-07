package fifthJava;

import java.util.Scanner;

public class smallestValueArray {

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
		int smallest=num[0];
		for(int i=0;i<num.length;i++)
		{
			
			if(num[i]<smallest)
			{
				smallest=num[i];
			}
		}
		System.out.println("The smallest number in array is:"+smallest);
	}

}


/*for(int j=i+1;j<num.length;j++)       //Another method
{
	if(num[i]>num[j]) {
		int temp=num[i];
		num[i]=num[j];
		num[j]=temp;
	}
	System.out.println("The smallest number in array is:"+num[0]);
}*/


