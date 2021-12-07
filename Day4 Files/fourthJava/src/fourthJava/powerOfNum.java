package fourthJava;

import java.util.Scanner;

public class powerOfNum {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the base number");
		int base=s.nextInt();
		System.out.println("Enter the exponent");
		int exp=s.nextInt();
		double res=1;
		while(exp!=0)
		{
			res=res*base;
			exp--;
		}
		System.out.println("The value is:"+res);

	}

}
