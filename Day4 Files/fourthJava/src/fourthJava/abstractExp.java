package fourthJava;

import java.util.Scanner;

public class abstractExp {

	public static void main(String[] args) {
		animals a=new animals();
		a.eat();
		a.makeSound();
		vehicle v=new vehicle();
		v.brake();

	}

}
abstract class Animal {                                  //Example Animal
	  abstract void makeSound();

	  public void eat() {
	   System.out.println("Welcome!!!");

	  }
	}
class animals extends Animal{

	@Override
	void makeSound() {
		System.out.println("Hello all,have a good day");
		
	}
	
}


abstract class MotorBike {                                    //Example MotoBike
	  abstract void brake();
	}

class vehicle extends MotorBike{

	@Override
	void brake() {
		Scanner s=new Scanner(System.in);
		System.out.println("Choose your  bike");
		String st=s.next();
		System.out.println("the price of bike is Rs:2,50,000");
		
	}
	
}








