package MultiThreading.Basic;

public class ThreadDemo
{

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		/*A o1=new A();
		MultiThreading.Basic.B o2=new MultiThreading.Basic.B();*/
		Thread o1=new Thread(new Y());
		Thread o2=new Thread(new B());
		o1.start();
		o2.start();
		try
		{
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			
		}
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			
		}
		
	}

}
class Y implements Runnable

//class A extends Thread
{
	public void run()
	{
		for(int i=0;i<=10;i=i+2)
		{
			System.out.println(i);
			//yield();
		}
	}
}
class B implements Runnable
//class MultiThreading.Basic.B extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i=i+2)
		{
			System.out.println(i);
		}
	}
}