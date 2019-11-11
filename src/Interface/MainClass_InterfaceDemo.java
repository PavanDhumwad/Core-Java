package Interface;

public class MainClass_InterfaceDemo
{
    public static void main(String[] args)
    {
        System.out.println("In interface, call to override method will happen depending upon type of object");
        SubClass a = new SubClass();
        a.abc();

        SuperClass b = new SuperClass();
        b.abc();

        SuperClass aa = new SubClass();
        aa.abc();

        System.out.println(a.notImplemeted());

        InterfaceDemo anonymousObj = new InterfaceDemo() {
            @Override
            public void abc() {
                System.out.println("Changed msg using SubClassnonymous class");
            }
        };
        anonymousObj.abc();
    }
}
