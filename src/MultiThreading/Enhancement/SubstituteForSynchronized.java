package MultiThreading.Enhancement;

import java.util.concurrent.locks.ReentrantLock;

public class SubstituteForSynchronized
{
    public static void main(String[] args) {
        Display d = new Display();
        MyThread pavan = new MyThread(d,"Pavan");
        MyThread dhumwad = new MyThread(d,"Dhumwad");
        pavan.start();
        dhumwad.start();
    }
}
class Display
{
    ReentrantLock l = new ReentrantLock();
    public void wish(String name)
    {
        l.lock();
        
        try {
            for(int i=0;i<5;i++) {
                System.out.println("Hello:"+name);
                Thread.sleep(2000);
            }
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        l.unlock();
    }
}

class MyThread extends Thread
{
    Display d;
    String name;
    MyThread(Display d, String name)
    {
        this.d = d;
        this.name = name;
    }
    public void run()
    {
        d.wish(name);
    }
}