package Collections.Set;

import java.util.Collections;
import java.util.TreeSet;

public class TreeSetWithNavigableSet
{
    public static void main(String[] args)
    {
        TreeSet<Integer> num = new TreeSet<>();
        Collections.addAll(num,12,34,54,34); //Is it goodway???
        /*num.add(12);
        num.add(34);
        num.add(54);
        num.add(65);*/
        num.add(99);
        System.out.println(num);

        System.out.println(num.floor(34)); //Return no. which is immediate <=34 while ceiling returns immediate >=34
        System.out.println(num.lower(34)); //Return no. which is immediate <34  while higher returns immediate >34
        System.out.println(num.subSet(34,54)); // Returns 34<= Number(s) > 54
        System.out.println(num.subSet(34,false,65,false)); // Returns 34< Number(s) > 54
        System.out.println(num.headSet(54)); //Returns Number(s) <54, by default inclusive is false
        System.out.println(num.tailSet(54)); //Returns Number(s) >=54, by default inclusive is true
    }
}
