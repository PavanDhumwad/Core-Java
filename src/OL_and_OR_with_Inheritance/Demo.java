package OL_and_OR_with_Inheritance;
class SuperClass
{
    public int add(int num1, int num2)
    {
        return num1+num2;
    }
}
class SubClass extends SuperClass
{
    public int difference(int num1,int num2)
    {
        return num1 - num2;
    }
    public int add(int num1)
    {
        return num1;
    }
}

public class Demo
{
    public static void main(String[] args) {
        SuperClass sup = new SubClass();
        System.out.println(sup.add(5,8));
        //You can't invoke difference() method with super class obj
        //You can't invoke overloaded add(int num1) method with super class obj
    }

}
