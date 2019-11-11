package Java8.PredefinedFI.Function;

import java.util.function.Function;

public class SquareNumber
{
    public static void main(String[] args) {
        Function<Integer, Integer> square = num -> num * num;
        System.out.println("4*4 = " + square.apply(4));
    }
}
