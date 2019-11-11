package Java8.LambdaExpression;
@FunctionalInterface
interface Interf
{
    Student getObj(String name, int marks);
}

class Student {
    String name;
    int marks;

    public Student(String name, int marks) {
        System.out.println("Constructor is called with name: " + name + " & marks: " + marks);
        this.name = name;
        this.marks = marks;
    }
}

public class ConstructorReference
{
    public static void main(String[] args)
    {
        Interf withCR = Student::new;
        withCR.getObj("Pavan", 84);

        Interf withLE = (name, marks) -> new Student(name,marks);
        withLE.getObj("Ravi", 100);
        System.out.println("By using CR we avoided LE(name, marks) -> new Student(name,marks)");
    }
}
