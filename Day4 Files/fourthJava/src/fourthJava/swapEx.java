package fourthJava;

import java.util.Scanner;

public class swapEx {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter two numbers");
	int n1=s.nextInt();
	int n2=s.nextInt();
	System.out.println("The given numbers are:"+n1+" "+n2);
	int t;
	t=n1;
	n1=n2;
	n2=t;
	System.out.println("The swapped numbers are:"+n1+" "+n2);

	}

}
