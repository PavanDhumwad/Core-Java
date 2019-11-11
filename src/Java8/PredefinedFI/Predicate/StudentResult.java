package Java8.PredefinedFI.Predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

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
public class StudentResult
{
    public static void main(String[] args) {
        ArrayList<Student> student = new ArrayList<>();
        student.add(new Student("Raj", 45));
        student.add(new Student("Roy", 30));
        student.add(new Student("Ravi", 50));

        Predicate<Student> result = s -> s.marks > 35;
        for (Student student1 : student) {
            if (result.test(student1))
                System.out.println(student1.name + " Pass");
            else
                System.out.println(student1.name + " Fail");
        }
    }
}
