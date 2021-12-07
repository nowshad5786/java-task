package thirdJava;

public class student {
	   String name;
	   String rollno;
	   
	 public void setName()
	 {
		 name="Anusha";
		
	 }
	 public String getName()
	 {
		 return name;
	 }
	  public void setRollno() 
	  {
		  rollno="4CI178";
	  }
	  public String getRollno()
	  {
		  return rollno;
	  }

	public static void main(String[] args) {
		
		student s=new student();
		s.setName();
		String t=s.getName();
		System.out.println(t);
		s.setRollno();
		String r=s.getRollno();
		System.out.println(r);
		
		

	}

}
