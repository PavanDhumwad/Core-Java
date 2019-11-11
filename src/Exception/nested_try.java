package Exception;

public class nested_try {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a;
		try
		{
			 a = 5;
			int b = 42 / a;
			System.out.println("a = " + a);
			try 
		   { 
				a=6;
				a = a/(a-2); 
				int c[] = { 1 };
				c[8]=0;
		
		   } 
	       catch(ArrayIndexOutOfBoundsException e)
		   {
			   System.out.println("Array index out-of-bounds: ");
		   }
			System.out.println("hi");//You can write here*/
			
		} 
		//System.out.println("hi");You can't write any thing here
		catch(ArithmeticException e) 
		{
			System.out.println("Divide by 0 outer: ");
		}
		
	}
}