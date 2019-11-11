package AllAboutClass;

interface abc
{
    void print();

}
public class AnonymousClass
{
    public static void main(String[] args)
    {
        new abc()
        {
            @Override
            public void print()
            {
                System.out.println("Anonymous class used to implement interface");
            }
        }.print();
        ((abc) () -> System.out.println("Instead of Anonymous class, Lambda Expression can also be used to implement interface")).print();
    }
}