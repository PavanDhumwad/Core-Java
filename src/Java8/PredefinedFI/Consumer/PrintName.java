package Java8.PredefinedFI.Consumer;

import java.util.function.Consumer;

public class PrintName {
    public static void main(String[] args) {
        Consumer<String> name = i -> System.out.println("First Name: " + i);
        Consumer<String> lastName = i -> System.out.println("Last Name: " + i);
        Consumer<String> fullName = i -> System.out.println("Chained Consumer");
        fullName.andThen(name).accept("Pavan");
        lastName.accept("Dhumwad");
    }
}
