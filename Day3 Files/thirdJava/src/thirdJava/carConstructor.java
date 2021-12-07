package thirdJava;

public class carConstructor {
	String brandname,price;
	
	carConstructor(String brand,String pr){
		brandname=brand;
		price=pr;
		
	}
	String displayDetails() {
		return brandname+" "+price;
	}


    public static void main(String args[]) {
    	carConstructor c=new carConstructor("Innova","21lakh");
    	System.out.println(c.displayDetails());
    }
}