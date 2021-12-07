package fourthJava;

public class factResursionJava {
	static int factor(int n) {
		if(n==0)
			return 1;
		else
			return(n*factor(n-1));
	}

	public static void main(String[] args) {
		int i,fact=1;
		int num=3;
		fact=factor(num);
		System.out.println("Factorial of "+num+ " is:"+fact);
		
		
	}

	

}
