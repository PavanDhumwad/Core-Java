package OL_and_OR_with_Inheritance;

class RTP_SuperClass
{
    public int add(int num1, int num2)
    {
        return num1+num2;
    }
}
class RTP_SubClass extends RTP_SuperClass
{
    public int add(int num1, int num2)
    {
        return num1*num2;
    }
}
public class DynamicMethodDispatch
{
    public static void main(String[] args) {
        RTP_SuperClass sup = new RTP_SubClass();
        System.out.println("Gives product instead of sum " +sup.add(5, 6));
    }


}
