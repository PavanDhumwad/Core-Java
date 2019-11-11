package Generics;

class GenOccurance
{
	
	public GenOccurance()
	{
		
	}
	<T> void countOccurance(T[] arr,T key)
	{
		int count=0;
		for(int i=0;i<arr.length;i++)
		{		
				if(arr[i]==key)
					count++;	
		}
		System.out.println("No. of occurance of "+key+" is "+count);
	}
}
public class IA_2_Q1a_CountOccurance 
{
	public static void main(String[] args)
	{
		GenOccurance g = new GenOccurance();
		Integer[] arr={1,2,3,4,1};
		g.countOccurance(arr,5);
		
		String[] str={"pavan","g","Pavan"};
		g.countOccurance(str,"pavan");
	}

}
