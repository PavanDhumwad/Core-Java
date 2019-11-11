package MultiThreading.Enhancement;

import java.util.concurrent.locks.ReentrantLock;

public class MethodInReentrantLock
{
    public static void main(String[] args) {
        ReentrantLock l = new ReentrantLock();
        l.lock();
        l.lock();
        System.out.println(l.isLocked());
        String currThread = Thread.currentThread().getName();
        System.out.println("Does "+currThread+" holds lock of 'l'?"+l.isHeldByCurrentThread());
        l.unlock();
        System.out.println(l.getHoldCount());
        System.out.println(l.isLocked());
        l.unlock();
        System.out.println(l.getHoldCount());
        System.out.println(l.isLocked());
        System.out.println(l.isFair());
    }
}
