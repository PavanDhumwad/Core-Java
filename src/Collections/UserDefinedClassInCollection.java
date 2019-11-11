package Collections;

import java.util.*;
class Address 
{
	String name;
	private String street;
	private String city;
	private String state;
	private String code;
	Address(String n, String s, String c,String st, String cd)
	{
		name = n;
		street = s;
		city = c;
		state = st;
		code = cd;
	}
	public String toString() 
	{
		return name + "\n" + street + "\n" + city + " " + state + " " + code;
	}
}
public class UserDefinedClassInCollection {

	public static void main(String[] args) {
		
		LinkedList<Address> m = new LinkedList<Address>();
		
		Address a1=new Address("J.W. West", "11 Oak Ave","Urbana", "IL", "61801");
		m.add(a1);
		a1.name="pavan";//Name J.W.West is replaced by pavan
		//m.set(0, a1);
		m.add(new Address("Ralph Baker", "1142 Maple Lane","Mahomet", "IL", "61853"));
		m.add(new Address("Tom Carlton", "867 Elm St","Champaign", "IL", "61820"));
		
		
		for(Address element : m)
		System.out.println(element + "\n");
		
		/*
		 * Another way of printing elements
		 * System.out.println("size="+m.size()+"Elements are "+m);
		 */
		
		
		/*
		 *  Iterator itr = m.iterator();
		 	while(itr.hasNext())
		 	{
			   Collections.Address a = (Collections.Address)itr.next();
			   System.out.println(a.name);
		 	}
		 */

	}

}
