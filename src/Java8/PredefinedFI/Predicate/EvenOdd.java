package Java8.PredefinedFI.Predicate;

import java.util.function.Predicate;

public class EvenOdd
{
    public static void main(String[] args) {
        Predicate<Integer> p1 = num -> num%2==0;
        System.out.println("Is 10 is Even? : "+p1.test(10));
        System.out.println("Is 11 is Even? : "+p1.test(11));
    }
}
