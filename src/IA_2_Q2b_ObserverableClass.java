import java.util.Observable;
import java.util.Observer;
import java.util.Random;
import java.util.*;

class Watcher implements Observer
{
	public void update(Observable ob, Object arg)
	{
		System.out.println("Update callled ");
	}
}

class BeingWatched extends Observable
{
	Random r = new Random();
	int i, val;
	
	void generateRandom(int limit)
	{
		for(i=0;i<limit;i++)
		{
			val = r.nextInt()/100000;
			System.out.println(val);
			//try
			//{
				if(val%2==0)
				{
					setChanged();
					notifyObservers((Integer)val);
					//Thread.sleep(1000);
				}
			/*}
			 * Put try-catch if you add thread.sleep(1000) statement
			catch(Exception e)
			{
				System.out.println(e);
			}*/
		}
	}
}
public class IA_2_Q2b_ObserverableClass {

	public static void main(String[] args) 
	{
		BeingWatched bw = new BeingWatched();	
		Watcher w = new Watcher();
		
		bw.addObserver(w);
		bw.generateRandom(10);

	}

}
