package thirdJava;

public class areaConstructor {


public static void main(String args[]) 
{
	circle c=new circle(24);
	System.out.println("area of circle is:"+c.getArea());
	rectangle r= new rectangle(2,4);
	System.out.println("area of rectangle is:"+r.getArea());
	square s= new square(6);
	System.out.println("area of square is:"+s.getArea());
	
}
}


class circle{
	double radius;
	circle(double r)
	{
		radius=3.14*r*r;
	}
	double getArea()
	{
		return radius;
	}
    }

class rectangle{
	float length,breadth,area;
	rectangle(float l, float b)
	{
		length=l;
		breadth=b;
		area=l*b;
	}
	float getArea()
	{
		return area;
	}	
    }

class square{
	float side;
	square(float s)
	{
		side=s*s;
	}
	float getArea()
	{
		return side;
	}

	}






