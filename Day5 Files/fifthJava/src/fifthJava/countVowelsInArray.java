package fifthJava;

import java.util.Scanner;

public class countVowelsInArray {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("enter the size of an array");
		int size=s.nextInt();
		char num[]=new char[size];
		System.out.println("Enter the array elements");
		for(int i=0;i<size;i++)
		{
			num[i]=s.next().charAt(0);
		}
	    int sum=0;
	    for(int i=0;i<num.length;i++)
	    {
	    	if(num[i]=='a'||num[i]=='e'||num[i]=='i'||num[i]=='o'||num[i]=='u')
	    	{
	    		System.out.println("The vowels are:"+num[i]);
	    		sum++;
	    	}
	    	
	    }
System.out.println("The total number of vovels are:"+sum);
	}

}
