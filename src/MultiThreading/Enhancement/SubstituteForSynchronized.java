package MultiThreading.Enhancement;

import java.util.concurrent.locks.ReentrantLock;

public class SubstituteForSynchronized
{
    public static void main(String[] args) {
        Callme d = new Callme();
        new Caller(d,"Pavan");
        new Caller(d,"Dhumwad");
    }
}
class Callme
{
    public void wish(String name)
    {
        System.out.print("[" + name);
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
    Callme d;
    String name;
    Thread t;
    static ReentrantLock l = new ReentrantLock();
    Caller(Callme d, String name)
    {
        this.d = d;
        this.name = name;
        t = new Thread(this);
        t.start();
    }
    public void run()
    {
        l.lock();
        d.wish(name);
        l.unlock();
    }
}