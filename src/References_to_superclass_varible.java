class Figure
{
	 double dim1;
	 double dim2;
	 Figure(double a, double b)
	 {
		 dim1 = a;
		 dim2 = b;
	 }
	 
	 double area()
	 {
		 return dim1*dim2;
	 }
	  
	 void pqr()
	 {
		System.out.println("pqr method Present in Figure not in MultiThreading.B");
	 }
}

class Rectangle extends Figure 
{
	Rectangle(double a, double b)
	{
		super(a, b);
	}
    // override area for rectangle
	double area()
	{
		System.out.println("Inside Area for Rectangle.");
		return dim1 * dim2;
	}
	void abc()
	{
		System.out.println("AllAboutClass.abc method Present in MultiThreading.B");
	}
}

class Triangle extends Figure
{
	Triangle(double a, double b) 
	{
		super(a, b);
	}
// override area for right triangle
	double area() 
	{
		System.out.println("Inside Area for Triangle.");
		return dim1 * dim2 / 2;
	}
}

class References_to_superclass_varible
{
	public static void main(String args[])
	{
	   
		Figure r = new Rectangle(9, 5);
		Triangle t = new Triangle(10, 8);

		System.out.println("Area is " + r.area());
		System.out.println("Area is " + t.area());
		
		
		Rectangle e=new Rectangle(3, 2);
		e.pqr();
		
	}
}