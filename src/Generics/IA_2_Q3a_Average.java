package Generics;

class GenAverage<T extends Number>
{
	T[] arr;
	int len;
	
	public GenAverage(T[] arr) 
	{
		this.arr = arr;
		len = arr.length;
	}
	
	double average()
	{
		double sum = 0.0;
		
		for(int i=0;i<len;i++)
			sum = sum + arr[i].doubleValue();
		
		return sum/len;			
	}
	
	
	
}
public class IA_2_Q3a_Average
{

	public static void main(String[] args) 
	{
		Integer[] arrInt = {1,2,3,50,5};
		GenAverage<Integer> GenInt = new GenAverage<Integer>(arrInt);
		double avgInt = GenInt.average();
		
		Float[] arrDouble = {1.0F, 2.0F, 3.0F, 4.0F, 8.0F};
		GenAverage<Float> GenDouble = new GenAverage<Float>(arrDouble);
		float avgDouble = (float)GenDouble.average();
		
		//Double or float  value can be compared with "=="
		if(avgInt == avgDouble)
			System.out.println("Same avg");
		else if(avgInt > avgDouble)
			System.out.println("Int avg is biggest");
		else
			System.out.println("Float avg is biggest");

	}

}
