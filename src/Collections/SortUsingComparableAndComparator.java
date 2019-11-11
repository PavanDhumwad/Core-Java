package Collections;

import java.util.Arrays;
import java.util.Comparator;

class SortBasedOnID implements Comparator<Employee>
{

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getId() - o2.getId();
    }
}
class Employee implements Comparable<Employee>
{
    private int id;
    private String name;
    private int age;
    private int salary;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Employee(int id, String name, int age, int salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee emp)
    {
        return (this.name.compareTo(emp.name));
    }

    public String toString()
    {
        return "[id=" + this.id + ", name=" + this.name + ", age=" + this.age + ", salary=" +
                this.salary + "]";
    }
}


public class SortUsingComparableAndComparator
{
    public static void main(String[] args)
    {
        Employee[] empArr = new Employee[4];
        empArr[0] = new Employee(10, "Mikey", 25, 10000);
        empArr[1] = new Employee(20, "Arun", 29, 20000);
        empArr[2] = new Employee(5, "Lisa", 35, 5000);
        empArr[3] = new Employee(1, "Pankaj", 32, 50000);
        System.out.println("Till here we have requirement of sort based on name");
        Arrays.sort(empArr);
        System.out.println(Arrays.toString(empArr));
        System.out.println("Now we have requirement of sort based on ID");
        Arrays.sort(empArr,new SortBasedOnID());
        System.out.println(Arrays.toString(empArr));

    }
}
