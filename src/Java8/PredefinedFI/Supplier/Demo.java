package Java8.PredefinedFI.Supplier;

import java.util.function.Supplier;

public class Demo
{
    public static void main(String[] args)
    {
        Supplier<Demo> d = () ->
                        {
                            System.out.println("Demo obj is created!!!");
                            return new Demo();
                        };
        Demo obj = d.get();
        obj.getObjInfo();
    }
    private void getObjInfo()
    {
        System.out.println(this);
    }
}
