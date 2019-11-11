import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
class T1 extends Thread
{
	public void run()
	{
		LostUpdate.update(10);
		System.out.println("\nT1 thread Done");
	}
}
class T2 extends Thread
{
	public void run()
	{
		LostUpdate.update(20);
		System.out.println("\nT2 thread Done");
	}
}
public class LostUpdate 
{
	static int a =200;
	public static void main(String[] args) throws IOException 
	{
		File f=null;
		try
		{
			f=new File("P:\\Study Material\\pavan.txt");
		}
		catch(Exception e)
		{
			System.out.println("File not found");
		}
		T1 t1=new T1();
		T2 t2=new T2();
		t1.start();
		t2.start();
		try
		{
			t1.join();
			t2.join();
		}
		catch(InterruptedException e)
		{
			
		}
		System.out.println("\nValue of a:"+a);
		BufferedWriter out1 = new BufferedWriter(new FileWriter(f));
		out1.write("\nValue of a:"+a);
		out1.close();
		
	}	
		public static synchronized void update(int i) 
		{
			int x;
			x=a;
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				
			}
			x=x+i;
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				
			}
			a=x;
	     }
	
	}

