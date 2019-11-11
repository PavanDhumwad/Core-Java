package Java8.PredefinedFI.Function;

import java.util.function.Function;

public class StrLength
{
    public static void main(String[] args) {
        Function<String, Integer> strLen = str -> str.length();
        System.out.println("StrLen(\"Pavan\") = " + strLen.apply("Pavan"));
    }
}
