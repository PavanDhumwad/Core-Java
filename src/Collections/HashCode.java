package Collections;

import java.util.HashSet;

public class HashCode
{
    public static void main(String[] args) {
        StudentOverridesEquals pavan1 = new StudentOverridesEquals(123);
        StudentOverridesEquals pavan2 = new StudentOverridesEquals(123);
        System.out.println("Overriden equals() gives "+pavan1.equals(pavan2));
        HashSet<StudentOverridesEquals> hashSet1 = new HashSet<>();
        hashSet1.add(pavan1);
        hashSet1.add(pavan2);
        System.out.println("Although 2 objects are equal, hashset1 size is still "+hashSet1.size()+"\n");

        StudentOverridesEqualsAndHashCode pavan3 = new StudentOverridesEqualsAndHashCode(123);
        StudentOverridesEqualsAndHashCode pavan4 = new StudentOverridesEqualsAndHashCode(123);
        System.out.println("Overriden equals() gives "+pavan3.equals(pavan4));
        HashSet<StudentOverridesEqualsAndHashCode> hashSet2 = new HashSet<>();
        hashSet2.add(pavan3);
        hashSet2.add(pavan4);
        System.out.println("After overriding equals() & hashCode(), hashset2 size becomes "+hashSet2.size()+"\n");


    }
}
class StudentOverridesEqualsAndHashCode
{
    int id;

    public StudentOverridesEqualsAndHashCode(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof StudentOverridesEqualsAndHashCode)) return false;
        if (this == obj) return false;
        return this.id == ((StudentOverridesEqualsAndHashCode)obj).id;

    }

    @Override
    public int hashCode() {
        return id;
    }
}
