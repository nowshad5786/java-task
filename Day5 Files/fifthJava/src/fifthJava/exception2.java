package fifthJava;



public class exception2 {

	public static void main(String[] args) {              //null pointer exception
		String sc=null;
		int count=0;
		
		try {
			for(int i=0;i<sc.length();i++) {
				count=count+i;
			}
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
     System.out.println(count);
	}

}
