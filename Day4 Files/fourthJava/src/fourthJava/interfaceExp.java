package fourthJava;

import java.util.Scanner;

public class interfaceExp {

	public static void main(String[] args) {
		myClass m=new myClass();
		m.method1();
		m.method2();
	    veh v=new veh();
	    v.tuneUpCost();
	    v.canCarry(8);
	}

}
interface A{                                                  //Example One
	 public void method1();
	 public void method2();
}
class myClass implements A{

	@Override
	public void method1() {
		System.out.println("hello");
		
	}

	@Override
	public void method2() {
		System.out.println("hi");
		
	}
	
     
	}
	
interface IVehicle {                                           //Example two
    // indicate how much a basic tune-up costs
    public double tuneUpCost();
  
    // determine whether vehicle can hold given num of passengers
    public boolean canCarry(int numPassengers);
  }

class veh implements IVehicle{

	@Override
	public double tuneUpCost() {
		System.out.println("Tune up costs Rs.2000");
		return 0;
	}

	@Override
	public boolean canCarry(int numPassengers) {
		if(numPassengers<=5) {
			System.out.println("True,The vehile holds the passengers");
			return true;
		}
		else {
			
			System.out.println("False,The vehicle cannot hold so many passengers");
			return false;
		
		}
		
	}
}


