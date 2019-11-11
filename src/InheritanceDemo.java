class C
{
   int  x=9;
   
   void show()
   {
	   System.out.println("In C,show"); 
   }
   
   static void f1()
   {
	   System.out.println("In C,f1"); 
   }
}
class Z extends C
{
	int x=10;
	
	void disp()
	{
		System.out.println("X="+super.x);
		super.x=4;
		System.out.println("X="+x);
		System.out.println("X="+super.x);
		
	}
	
	void show()
	{
		System.out.println("In MultiThreading.B,show");
	}
	
	void fun()
	{
		System.out.println("In MultiThreading.B");
	}
	
	static void f1()
	{
		   System.out.println("In MultiThreading.B,f1");
    }
	 
}
public class InheritanceDemo 
{
	public static void main(String args[])
	{
		Z z=new Z();
		z.disp();
		
		C c=new C(); //1
		c=z;	     //2				
		c.show();    //3
		c.f1();      //In C,f1 becoz c is reference variable of type C
		//c.fun();

/*	 c.fun(); will generate CTE.Because "fun()" is non overriding function,hence  binding happens 
 * at CT(depending upon "type of Reference Variable").Since reference variable is of class C 
 * and in C we don't have "fun()" therefore CTE.
 * "static void f1() is also called based on "type of Reference Variable"   
 */

		
		/*Above 1,2 and 3 line statements is equivalent to
		 *  C c=new MultiThreading.B();
		 *  c.show();
		
		c.show(); o/p as "IN MultiThreading.B". Because "show()" is overriding function,hence  binding happens
		at RT(depending upon "type of Object").Since Object is of class MultiThreading.B o/p is "In MultiThreading.B"
		*/
		
	}
}