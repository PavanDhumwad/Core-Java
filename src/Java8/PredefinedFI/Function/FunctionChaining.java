package Java8.PredefinedFI.Function;

import java.util.function.Function;

public class FunctionChaining
{
    public static void main(String[] args) {
        Function<Integer, Integer> f1 = i -> 2 * i;
        Function<Integer, Integer> f2 = j -> j * j * j;
        System.out.println("First f1 andThen f2 "+f1.andThen(f2).apply(2));
        System.out.println("First f2 followed-by f1 "+f1.compose(f2).apply(2));
    }
}
