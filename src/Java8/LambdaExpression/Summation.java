package Java8.LambdaExpression;

@FunctionalInterface
interface Addition
{
    int add(int a,int b);
}

public class Summation
{
    public static void main(String[] args) {
        Addition sum = (num1, num2) -> num1 + num2;
        System.out.println("5+6 = "+sum.add(5, 6));
    }
}
