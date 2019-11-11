package Java8.PredefinedFI.Predicate;

import java.util.function.BiPredicate;

public class TwoArgPredicate
{
    public static void main(String[] args) {
        BiPredicate<Integer, Integer> p1 = (i, j) -> (i + j) % 2 == 0;
        System.out.println("Is 10+20 is Even? : " + p1.test(10,20));
        System.out.println("Is 11+2 is Even? : " + p1.test(11,2));
    }
}
