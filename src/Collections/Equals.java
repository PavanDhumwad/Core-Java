package Collections;

import java.util.HashSet;

public class Equals
{
    public static void main(String[] args)
    {
        StudentNotOverridesEquals pavan3 = new StudentNotOverridesEquals(123);
        StudentNotOverridesEquals pavan4 = new StudentNotOverridesEquals(123);
        System.out.println("== gives "+(pavan3==pavan4));
        System.out.println("Default equals() gives "+pavan3.equals(pavan4)+"\n");

        StudentOverridesEquals pavan1 = new StudentOverridesEquals(123);
        StudentOverridesEquals pavan2 = new StudentOverridesEquals(123);
        System.out.println("== gives "+(pavan1==pavan2));
        System.out.println("Overriden equals() gives "+pavan1.equals(pavan2));
    }
}

class StudentOverridesEquals
{
    int id;

    public StudentOverridesEquals(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof StudentOverridesEquals)) return false;
        if (this == obj) return false;
        return this.id == ((StudentOverridesEquals)obj).id;

    }
}

class StudentNotOverridesEquals {
    int id;

    public StudentNotOverridesEquals(int id) {
        this.id = id;
    }
}