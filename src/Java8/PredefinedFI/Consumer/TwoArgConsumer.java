package Java8.PredefinedFI.Consumer;

import java.util.function.BiConsumer;

class Employee
{
    double salary;
    String name;
    Employee(String name, double salary)
    {
        this.name = name;
        this.salary = salary;
    }
}
public class TwoArgConsumer
{
    public static void main(String[] args) {
        BiConsumer<Employee, Double> c = (emp, salary)->emp.salary = emp.salary+ 0.05 * emp.salary;
        Employee e1 = new Employee("Raj", 1000);
        System.out.println(e1.name+" "+e1.salary);
        c.accept(e1,e1.salary);
        System.out.println(e1.name+" "+e1.salary);
    }
}
