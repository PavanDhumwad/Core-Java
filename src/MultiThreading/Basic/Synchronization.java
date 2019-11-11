package MultiThreading.Basic;

class Callme
{
	 void call(String msg)
	{
		System.out.print("[" + msg);
		try 
		{
			Thread.sleep(1000);
		} 
		catch(InterruptedException e) 
		{
			System.out.println("Interrupted");
		}
		System.out.println("]");
	}
}
class Caller implements Runnable
{
	String msg;
	Callme target;
	Thread t;
	public Caller(Callme targ, String s)
	{
		target = targ;
		msg = s;
		t = new Thread(this);
		t.start();
	}
	public void run() 
	{
		synchronized (target){
		target.call(msg);
		}
	}
}

public class Synchronization 
{
	public static void main(String args[]) 
	{
		Callme target1 = new Callme();
		new Caller(target1, "Hello");
		new Caller(target1, "Synchronized");
		new Caller(target1, "World");
	 }
}

