package Collections.HashMap;

import java.util.*;

public class UsageOfEntrySet
{
	public static void main(String[] args) 
	{
		HashMap<String, Integer> hmap = new HashMap<>();
		hmap.put("A",64);
		hmap.put("B", 66);
		hmap.put("C",67);
		Set</*Entry is inner intrf of Map*/Map.Entry<String, Integer>> keyV1 = hmap.entrySet();// Works w/o Generics
		Set<String> keyV2 = hmap.keySet(); //Works w/o Generics
		Collection<Integer> value = hmap.values(); //Works w/o Generics
		System.out.println("entrySet o/p: "+keyV1);
		System.out.println("keySet o/p: "+keyV2);
		System.out.println("value are: "+value);
		Iterator iter = keyV1.iterator();
		while (iter.hasNext())
		{
			/*Entry is inner intrf of Map*/
			Map.Entry<String, Integer> entry = (Map.Entry) iter.next();
			if (entry.getKey().equals("A")) {
				System.out.println("Value of A modified..!!");
				entry.setValue(65);
			}
			System.out.println(entry.getKey()+"-"+entry.getValue());
		}
	}
}
