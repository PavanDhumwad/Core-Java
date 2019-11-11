package Java8.InterfaceMethod;

interface SubClass
{
    default void m1()
    {
        System.out.println("In SubClass's m1()");
    }
}

interface B
{
    default void m1()
    {
        System.out.println("In B's m1()");
    }
}

public class Mul_Inheritance_WRT_DefaultMethod implements SubClass, B
{
    @Override
    public void m1()
    {
        System.out.println("You need to override m1() in implementing class");
        SubClass.super.m1(); //Calls SubClass's m1()
        B.super.m1(); //Calls B's m1()
    }
    public static void main(String[] args)
    {
        new Mul_Inheritance_WRT_DefaultMethod().m1();// Calls overridden method of implementing class
    }
}

