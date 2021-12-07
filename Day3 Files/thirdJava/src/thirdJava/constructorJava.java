package thirdJava;

public class constructorJava {

	public static void main(String[] args) {
		Employee e=new Employee("12","12345");
		System.out.println(e.getDetails());

	}

}
 class Employee{
	 String id,salary;
	 Employee(String x,String sal)
	 {
		 id=x;
		 salary=sal;
	 }
	 
	 String getDetails()
	 {
		 return id+" "+salary;
	 }
 }