package Collections.Iteraor;

import java.util.*;

public class Important
{
    public static void main(String[] args) {
        Vector v = new Vector();
        Enumeration e = v.elements();

        HashSet set = new HashSet();
        Iterator iter = set.iterator();

        LinkedList list = new LinkedList();
        ListIterator listIterator = list.listIterator();

        System.out.println("Enumeration intref is implemented by Anonymous class present in Vector class: "+e.getClass().getName());
        System.out.println("Iterator intref implemented by Innerclass called KeyIterator. " +
                "That inner class object is iter : "+iter.getClass().getName());
        System.out.println("ListIterator intref implemented by Innerclass called ListItr. " +
                "That inner class object is listIterator : "+listIterator.getClass().getName());


    }
}
