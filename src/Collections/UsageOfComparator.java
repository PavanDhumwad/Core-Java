package Collections;

import java.util.*;
class Book
{
	String title;
	int price;
	Book(String t,int p)
	{
		title=t;
		price=p;
	}
}

class mycomp implements Comparator<String>//Replace all String to Integer in order to sort based on price
{
	public int compare(String f,String s)
	{
		if(f.compareTo(s)>0)
			return -1;
		return 1;
		//return f.compareTo(s);
	}
}

public class UsageOfComparator 
{

	public static void main(String[] args)
	{
		
		Book b1=new Book("c",12);
		Book b2=new Book("c#",192);
		Book b3=new Book("a",15);
		
		System.out.println("TreeSet by default sorts elements in the increasing order."
				+ "If you want to custmize order use comparator");
		
		TreeSet<String> t=new TreeSet<String>(new mycomp());
		System.out.println(t);
		
		t.add(b1.title);
		System.out.println(t);
		
		t.add(b2.title);
		System.out.println(t);
		
		t.add(b3.title);
		System.out.println("\nFINAL Sorted order based on title");	
		System.out.print(t);

	
	}

}
