package MultiThreading.Enhancement.ExecutorService;

import java.util.concurrent.*;

public class ThreadPool
{
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        SumofNnumber[] jobs = {
                        new SumofNnumber(1,10),//55
                        new SumofNnumber(11,20),//155
                        new SumofNnumber(21,30),//255
                      };
        ExecutorService service = Executors.newFixedThreadPool(3);
        for (SumofNnumber job : jobs)
        {
            Future sum = service.submit(job);
            System.out.println(sum.get());
        }
        service.shutdown();
    }
}
class SumofNnumber implements Callable
{
    int begin, end;
    SumofNnumber(int begin, int end)
    {
        this.begin = begin;
        this.end = end;
    }

    @Override
    public Object call() throws Exception
    {
        System.out.println(Thread.currentThread().getName()+" calculating sum bt["+begin+", "+end+"]");
        int sum = 0;
        for(int i=begin;i<=end;i++) {
            sum += i;
            try
            {
                Thread.sleep(2000);
            }
            catch(InterruptedException e)
            {
                System.out.println("Interrupted");
            }
        }
        System.out.println(Thread.currentThread().getName()+" returning sum bt["+begin+", "+end+"]");
        return sum;
    }
}

