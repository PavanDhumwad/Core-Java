package MultiThreading.Enhancement;

public class AllSystemThread
{
    public static void main(String[] args) {
        ThreadGroup sys = Thread.currentThread().getThreadGroup().getParent();
        int currentActiveThreadOfSys = sys.activeCount();
        Thread[] t = new Thread[currentActiveThreadOfSys];
        System.out.println("Copying all active thread of 'sys' to array 't'");
        sys.enumerate(t);
        for (Thread thread:t
             ) {
            System.out.println(thread.getName()+" Is Daemon?"+thread.isDaemon());
        }
    }
}
