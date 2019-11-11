package Java8.LambdaExpression;

public class LambdaExpression_In_MultiThreading
{
    public static void main(String[] args)
    {
        Runnable thread1 = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Child Thread");
            }
        };
        Thread t1 = new Thread(thread1);
        t1.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("Main Thread");
        }
    }
}
