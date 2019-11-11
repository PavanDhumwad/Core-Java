/*
 //Try executing both V_2.0 and V_2.1
class ThrowdemoV_2
{
	
	static void throwOne() throws IllegalAccessException 
	{
		
		System.out.println("Inside throwOne.");
		
		try
		{
			throw new IllegalAccessException("ThrowdemoV_2.0");
		}
		catch(IllegalAccessException e)
		{
			System.out.println("In catch block");
			//throw e; 
			//Try removing above comment and see the variation o/p
		}
			
	}
	
	public static void main(String args[]) 
	{
		try 
		{
			throwOne();
		} 
		catch (IllegalAccessException e) 
		{
			System.out.println("Caught :" + e.getMessage());
		}
		System.out.println("Main terminates");
	}
}
*/







/*
class ThrowdemoV_2
{
	
	static void throwOne() throws IllegalAccessException 
	{
		
		System.out.println("Inside throwOne.");
		
		try
		{
			throw new IllegalAccessException("ThrowdemoV_2.1");
		}
		catch(NullPointerException e) //Here is modification done from V_2.0
		{
			System.out.println("In catch block");
		}
		
	}
	
	public static void main(String args[]) 
	{
		try 
		{
			throwOne();
		} 
		catch (IllegalAccessException e) 
		{
			System.out.println("Caught :" + e.getMessage());
		}
		System.out.println("Main terminates");
	}
}
*/