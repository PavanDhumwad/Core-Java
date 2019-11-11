package Collections.Queue;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

class  StringLenComp implements Comparator<String>
{
    @Override
    public int compare(String o1, String o2) {
        System.out.println("here");
        return Integer.compare(o1.length(),o2.length());
    }
}
public class QueueInterfaceDemo
{
    public static void main(String[] args) {
        Queue<String> str = new PriorityQueue<>(new StringLenComp());
        /*str.add("a");
        str.add("abc");
        str.add("ac");*/
        Collections.addAll(str,"a","abc","ac");
        /*System.out.println(str.poll());
        System.out.println(str.poll());
        System.out.println(str.poll());*/
        //System.out.println(str);
    }

}
