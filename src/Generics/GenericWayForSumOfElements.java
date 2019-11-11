package Generics;

import java.util.*;

public class GenericWayForSumOfElements
{
	static Number sumOfNumbers(Collection<? extends Number> numList)
	{
		double sum =0.0;
		for(Number num : numList)
		{
			sum += num.doubleValue();
		}
		return sum;
	}
	public static void main(String[] args)
	{
		//Collection<Integer> numList = new ArrayList<Integer>() ->This is how when sumOfNumbers() is called
		ArrayList<Integer> al = new ArrayList<>();
		al.add(2);
		al.add(41);
		System.out.println(sumOfNumbers(al));

		//Collection<Integer> numList = new LinkedList<Integer>() ->This is how when sumOfNumbers() is called
		LinkedList<Integer> ll = new LinkedList<>();
		ll.add(2);
		ll.add(41);
		System.out.println(sumOfNumbers(ll));

		//Collection<Double> numList = new HashSet<Double>() ->This is how when sumOfNumbers() is called
		HashSet<Double> hs = new HashSet<>();
		hs.add(2.2);
		hs.add(41.8);
		System.out.println(sumOfNumbers(hs));

		/*TreeSet<String> ts = new TreeSet<>();
		ts.add("ab");
		ts.add("a");
		System.out.println(sumOfNumbers(ts));

		Gives error because String is used.(We put extends Number in line no. 5)
		*/
	}
}
