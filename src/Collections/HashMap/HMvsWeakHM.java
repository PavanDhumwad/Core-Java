package Collections.HashMap;

import java.util.HashMap;
import java.util.WeakHashMap;

public class HMvsWeakHM
{
    public static void main(String[] args) throws InterruptedException {
        HashMap<Temp, Integer> hmObj = new HashMap<Temp, Integer>();
        Temp temp1 = new Temp(5);
        hmObj.put(temp1,5);
        temp1 = null;
        System.gc();
        Thread.sleep(2000);
        System.out.println("Temp obj still exists"+hmObj);

        WeakHashMap<Temp,Integer> weakHMObj = new WeakHashMap<Temp, Integer>();
        Temp temp2 = new Temp(6);
        weakHMObj.put(temp2,5);
        temp2 = null;
        System.gc();
        Thread.sleep(2000);
        System.out.println(weakHMObj);

    }
}
class Temp
{
    int a;
    Temp(int a)
    {
        this.a = a;
    }
    public void finalize()
    {
        System.out.println("Finalize called!!");
    }
}