package Collections;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetWithStringBuffer
{

    public static void main(String[] args)
    {
        TreeSet t = new TreeSet(new SBNotImpComparableIntrf());
        System.out.println("StringBuffer does not implement Comparable interf. So we need provide " +
                "implementation of Comparator interf");
        t.add(new StringBuffer("A"));
        t.add(new StringBuffer("C"));
        t.add(new StringBuffer("B"));
        System.out.println(t);
    }
}
class SBNotImpComparableIntrf implements Comparator
{

    @Override
    public int compare(Object o1, Object o2) {
        String s1 = o1.toString();
        String s2 = o2.toString();
        return s1.compareTo(s2);
    }
}