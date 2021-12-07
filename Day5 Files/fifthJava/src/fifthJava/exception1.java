package fifthJava;

public class exception1 {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++)                                  //Exception example 1
		{
			try
			{
				if(i==5) {
					i=i/0;
				}
			}
			catch(Exception e) {
				System.out.println("Exception in code:"+e);
			}
			System.out.println(i);
		}

		
		
		try {                                                    //Exception example 2
			String var=null;
			System.out.println(var.charAt(3));
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		
		
		
		
		
	}

}
