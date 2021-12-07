package thirdJava;

public class taskStudent {

	public static void main(String[] args) {
		students s=new students();
		System.out.println(s.getName());
	}

}
class students{                               
	String name;
	students( String n)
	{
		name=n;	
	}
	
String getName()
{
	return name;
}
students()
{
	System.out.println("unknown");
}
}
//Write a program to print the names of students by creating a Student class.
//If no name is passed while creating an object of 
//Student class, then the name should be "Unknown",
//otherwise the name should be equal to the String 
// value passed while creating object of Student class.
