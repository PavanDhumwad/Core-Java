package MultiThreading.Basic;

import java.util.Scanner;
class Fib implements Runnable
{
	Thread t;
	int n;
	
	Fib(String name, int n)
	{
		this.n = n;
		t = new Thread(this,name);
		t.start();
	}
	
	public void run()
	{
		int a=0, b=1, c;
		System.out.print("First 5 no. of MultiThreading.Basic.Fib series\n");
		
		for(int i=1; i<=n-1; i++)
		{
			c = a+b;
			System.out.println("MultiThreading.Basic.Fib["+i+"]= "+c);
			a=b;
			b=c;
			try
			{Thread.sleep(1000);}
			catch(InterruptedException e){}
		}
	}
}

class OddCount implements Runnable
{
	int arr[] = new int[10];
	int len, count=0;
	Thread t;
	
	public OddCount(int[] arr, String name)
	{
		this.arr = arr;
		len = arr.length;
		t = new Thread(this,name);
		t.start();
	}
	
	public void run() {
	for(int i=0; i<len; i++)
	{	
		if(arr[i]%2 == 1)
			count++;
	}
	try
	{
		if(count>=3)
		{
			System.out.println("1st statement");
			throw new MyException("Odd cont is greater than 3");	
/*
 * When an exception condition arises(i.e,, count>=3 ), an object representing that exception is created and thrown
   in the method(i.e,, run() method ) that caused the exception.
 */
		}
	}
	catch(MyException e)
	{
		System.out.println("3rd statement");
		System.out.println(e.getMessage());
		System.out.println("4th statement");
	}
	}
}

class MyException extends Exception
{
	public MyException(String e) 
	{
		
		super(e);
		System.out.println("2nd statement");
	}
}

public class multithreading 
{
	public static void main(String[] args)
	{
		int arr[] = new int[10];
		System.out.println("Enter arrry elements:");
		//Scanner sc = new Scanner(System.in);
		
		/*for(int i=0; i<4; i++)
			arr[i]=sc.nextInt();*/
		
		//System.out.println("0");
		Fib f = new Fib("MultiThreading.Basic.Fib", 5);
		
		try
		{
			System.out.println("MultiThreading.Basic.Fib thread started executing");
			f.t.join();
			System.out.println("MultiThreading.Basic.Fib thread finished its working\n");
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
		
		OddCount oc = new OddCount(arr, "Oddcount");
		try
		{
			System.out.println("MultiThreading.Basic.OddCount thread started executing");
			oc.t.join();
			System.out.println("OddCont thread finished its working\n");
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
		
		/*
		try
		{
			System.out.println("In try");
			f.t.join();
			System.out.println("exit from fib thread");
			oc.t.join();
			System.out.println("exit from try as well as from odcount");
			
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
		*/
		
		System.out.println("Exit from Main.\nI have brought synchronization in prg."
				+ "\nBy not allowing other thread to do its job when some other thread is running at same time");
	}

}
