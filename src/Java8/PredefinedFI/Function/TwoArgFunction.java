package Java8.PredefinedFI.Function;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;

class Student
{
    String name;
    int marks;
    Student(String name, int marks)
    {
        this.name = name;
        this.marks = marks;
    }
}
public class TwoArgFunction
{
    public static void main(String[] args) {
        BiFunction<String, Integer, Student> f = (name, marks)->new Student(name,marks);
        Student s1 = f.apply("Pavan", 85);
        System.out.println(s1.name+" "+s1.marks);
    }
}
