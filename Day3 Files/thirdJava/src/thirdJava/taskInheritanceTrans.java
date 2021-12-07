package thirdJava;

import java.util.Scanner;

public class taskInheritanceTrans {

	public static void main(String[] args) {
		
		balanceEnquiry b=new balanceEnquiry();
		b.execute();
		b.remainingBalance();
		b.balanceExecute();
		withdrawal w=new withdrawal();
		w.withdraws();
		w.withdrawReport();
		deposit d=new deposit();
		d.deposits();
		d.depositeReport();
		

	}

}
 class trans{
	  double balance=240000;
	 Scanner s=new Scanner(System.in);
	  int accountNumber=123456;
	 
	  
	 int getAccountNumber(int a) {
		 
		 return this.accountNumber=a;
		}
	  
	  void execute() {
		  System.out.println("The account number is:"+accountNumber);
	  }  
 }
 
 class balanceEnquiry extends trans {
	 double balance;
	 
	 void remainingBalance()
	 {
		 balance =240000;	 
	 }
	 
	 void balanceExecute(){
		 System.out.println("Your balance is Rs."+balance);
	 }	 
 }
 
 class withdrawal extends trans {
	 double with,amt;
	 
	 void withdraws(){
		 System.out.println("Enter the amount to withdraw");
		 with=s.nextInt();
		 amt=(this.balance)-with;
	 }
		
	 void withdrawReport(){
		 
		 System.out.println("You withdrawed  Rs."+with);
		 System.out.println("Remaining balance is  Rs."+amt);
	 }
 }
 
 class deposit extends trans {
	 double dep,amtt;
	 
	 void deposits(){
		 System.out.println("Enter the amount to deposit");
		 dep=s.nextInt();
		 amtt=(this.balance)+dep;
	 }
		
	 
	 void depositeReport(){
		 
		 System.out.println("Your deposited  Rs."+dep);
		 System.out.println("Remaining balance is  Rs."+amtt);
	 }
 }
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 