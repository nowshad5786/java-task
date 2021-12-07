package fourthJava;

public class reverseString {

	public static void main(String[] args) {
		String str="HELLO",reverseString = " ";
		char c;
		int i;
		
		for(i=0;i<str.length();i++) {
			c=str.charAt(i);
			reverseString=c+reverseString;
		}
			System.out.println("The given string is:"+str);
			System.out.println("The reverse of string is:"+reverseString);
		
		

	}

}
