package Generics;

import java.util.ArrayList;
import java.util.HashMap;

public class GenericHashMap
{
    public static void main(String[] args)
    {
        ArrayList<ArrayList<Integer>>fruit = new ArrayList<>();
        ArrayList<Integer> a1 = new ArrayList<>();
        ArrayList<Integer> a2 = new ArrayList<>();
        a1.add(10);
        a1.add(12);
        a2.add(12);
        a2.add(13);
        /*a1.add("Mango")
        a1.add("Banana");
        a2.add("Mango");
        a2.add("Banana");*/
        fruit.add(a1);
        fruit.add(a2);
        System.out.println("Tomorrow ArrayList can also accept Double..!!");
        System.out.println(countFruit(fruit));
    }
    private static <T> HashMap<T,Integer> countFruit(ArrayList<ArrayList<T>>fruit) {
        HashMap<T, Integer> count = new HashMap<>();
        for (int i = 0; i < fruit.size(); i++) {
            for (int j = 0; j < fruit.get(i).size(); j++)
            {
                if (count.containsKey(fruit.get(i).get(j)))
                {
                    int previousCount = count.get(fruit.get(i).get(j));
                    previousCount++;
                    count.put(fruit.get(i).get(j), previousCount);
                }
                else
                    count.put(fruit.get(i).get(j), 1);
            }

        }
        return count;
    }
}
