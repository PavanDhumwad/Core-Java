import java.io.*;
class A
{
	//You can't print here    System.out.println("Inside A");  
	int b=10;
	//You can't print here also
	A()
	{
		System.out.println("(2)Inside A   where value of b="+b);
	}
	static
	{
		System.out.println("(1)Inside static block of A");
	}
	//You can't print here also
	
}
public class executionFlow
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		//You can print over here
		A a=new A();
		System.out.println("(3)Inside Main   where you can acces value of b="+a.b);
		
		PrintWriter pw = new PrintWriter(System.out, true);//A false in second argument doesn't produce any o/p to console 
		pw.println("This is a string");//Try removing/adding ln 
		pw.println("hello");//Try removing/adding ln 
	}
}