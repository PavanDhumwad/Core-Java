package Collections.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListInterfaceDemo
{
    public static void main(String[] args) {
        ArrayList<String> lst = new ArrayList<>(); //When we will use List<String> lst = new ArrayList<>(); ?????????????????
        Collections.addAll(lst,"1","2","3");
        /*lst.add("1");
        lst.add("2");
        lst.add("3");*/
        lst.add("1");
        lst.add(2," 2.1(Modify element @ second index)");
        lst.remove("1"); //Removes first occurance of "1"
        Iterator<String> itr = lst.iterator();
        while (itr.hasNext())
            System.out.println(itr.next());
        System.out.println("Element @ second index: "+lst.get(1));
        List<Integer> lstNum = new ArrayList<>();
        lstNum.add(1);
        lstNum.add(2);
        lstNum.add(3);
        lstNum.add(1);
        lstNum.remove(Integer.valueOf(1));  //OR lstNum.remove(new Integer(1));
        /*  lstNum.remove(1)                    will remove element present at index/position 1.
            lstNum.remove(Integer.valueOf(1))   will remove first occurance of 1.
            Reason is list does not store primitive data-types
         */
        System.out.println(lst.toString()); //WHAT IT DOES??????????????????????????????????????????????????????????????????
    }
}
