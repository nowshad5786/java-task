package fourthJava;

import java.util.Scanner;

public class pattern2 {
	 

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);    
        System.out.println("Enter the number of rows: ");    
        int rows = sc.nextInt();
        
        for (int i = 1; i <= rows; i++) 
        {
        	int num=1;
            for (int j = 1; j <= i; j++)
            {
                System.out.print(num+" ");
                num++;
            }
               
            System.out.println();
        }         
        sc.close();

	}
}