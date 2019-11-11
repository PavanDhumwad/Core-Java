package Java8.PredefinedFI.Predicate;

import java.util.function.Predicate;

public class PredicateJoin
{
    public static void main(String[] args) {
        int num[] = {0, 7, 10, 13, 16, 19, 20 ,22};
        Predicate<Integer> p1 = i->i%2==0;
        Predicate<Integer> p2 = i->i>15;
        System.out.println("Numbers which are Even and >15 are...");
        for (int n: num)
        {
            if(p1.and(p2).test(n))// Similarly we can use 'or' & 'negate'
                System.out.println(n);
        }
    }
}
