package thirdJava;

public class areaPerimeter {

	public static void main(String[] args) {
		triangle t=new triangle();
		System.out.println(t.classs());
	
	}

}

 class triangle{
	 int p;
	 {
	 int a=3,b=4,c=5;
	 p=a+b+c;
	 }
	 int classs() {
		 return p;
	 }
 
 }
// Write a program to print the area and perimeter of a triangle
// having sides of 3, 4 and 5 units by creating a class named 
// 'Triangle' without any parameter in its constructor.