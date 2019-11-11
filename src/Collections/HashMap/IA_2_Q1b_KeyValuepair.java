package Collections.HashMap;

import java.util.HashMap;

public class IA_2_Q1b_KeyValuepair
{

	public static void main(String[] args) 
	{
		
		HashMap<String, String> hmap = new HashMap<String, String>();
		
		hmap.put("513", "Pavan");
		hmap.put("14cs001", "Bhat");
		hmap.put("14cs070", "Pavan");//If Duplicate key is present then corresponding entry will not be displayed
		hmap.put(null, "Pavan");	 //If key itself is null, corresponding entry will not be displayed
		hmap.put("14cs070", null);
		hmap.put("14cs071", "Bhat"); //It is printed since key is unique although value is same
		hmap.put(null,null);
		
		System.out.println(hmap);
		
		String name = hmap.get("513");
		hmap.put("513", name+ " Dhumwad");
		System.out.println(hmap);
		
		

	}

}
