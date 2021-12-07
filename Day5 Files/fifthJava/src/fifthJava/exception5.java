package fifthJava;

public class exception5 {

	public static void main(String[] args) {                  //Multiple catch
		try {
			int a[]=new int[9];
			System.out.println(a[10]);
		}
      catch(ArithmeticException e) {
    	  System.out.println("Arithmetic Exception");
      }
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException");
		}
		System.out.println("Thank you");
	}

}
