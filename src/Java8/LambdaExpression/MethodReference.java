package Java8.LambdaExpression;

@FunctionalInterface
interface Add
{
    int add(int a, int b);
}
public class MethodReference
{
    public static void main(String[] args) {
        Runnable r = MethodReference::test;
        Thread t = new Thread(r);
        t.start();
        for (int i = 0; i < 1; i++) {
            System.out.println("Main Thread");
        }

        Add withMR = new MethodReference()::test2;
        System.out.println(withMR.add(4, 6));

        Add withLE = (num1, num2) -> {
            for (int i = 0; i < num2 - num1; i++)
                System.out.print(i+" ");
            System.out.println("");
            return (num1 + num2);
        };
        System.out.println("W/o Method Reference, we took overhead of writing same thing " +
                "which is already present in test2() "+withLE.add(4,6));
    }
    private static int test()
    {
        for (int i=0; i<1; i++)
        {
            System.out.println("Child Thread");
        }
        return -10;
    }

    public int test2(int num1, int num2)
    {
        for (int i=0; i<num2-num1; i++)
            System.out.print(i+" ");
        System.out.println("");
        return (num1+num2);
    }
}
