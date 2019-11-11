package Exception;

import java.io.*;
class Throwdemo
{
	static void demoproc() throws NullPointerException,IOException//If IOException is written then it will
																  //raise CTE
	{
	
		try 
		{
			throw new IOException("demoproc");
		
		} 
	    catch(IOException e) 
/*
 * Here e contains string "java.lang.NullPointerException:" which is appended with "demo"
 * If we want to print only string "demo" then use e.getMessage() function
 */
        {
			System.out.println("Caught inside demoproc. ");
		    throw e; // throw the exception of type 'IOException' to try block of main method.Since your are 
		    //throwing IOException throws must contain IOException otherwise CTE will occur.
        }
/*If I don't write above catch statement then first finally block will get executed then  it(finally block)
 *  will throw NullPointerException back to try block of main IMPLICITLY
 */
		finally
		{
			System.out.println("Caught inside demoproc finally");
			//throw e; You can't write this since e is not visible in finally block
			//throw new NullPointerException("pavan"); This is possible however with warning
		}
/* Execution flow for method demoproc()-
 * 1)catch block will get executed except 'throw e;' statement
 * 2)Finally block gets executed
 * 3)catch block throw NullPointerException back to try block of main by executing 'throw e;' statement		
 */
		
	}
	
	static void demo() throws NullPointerException
	{
		throw new ArithmeticException("It is arithematic");
	}
	
	public static void main(String args[]) 
	{
		try
		{
			demoproc();
/*After execution of above statement try block received an exception of type NullPointerException
 * from catch block of demoproc.			
 */
		} 
		
		catch(IOException e)//This has to be 'NullPointerException e' OR 'Exception e' i order to 
								   	//continue with normal execution of prg. 
		{
			System.out.println("Recaught: "+e.getMessage());
		}
		
		try
		{
			demo();
		}
		catch(ArithmeticException e)
		{
			System.out.println("whatsup "+e.getMessage());
		}
		/*
		 * Execution flow 
		 * 1)demo method is called which throws ArithmeticException
		 * 2)catch statement catches it & prints "whatsup It is arithematic" nd prg will terminate normally
		 * 3)Had the catch statement is other than ArithmeticException OR Exception then program
		 * 	 will terminate abnormally	
		 * 
		 */
		System.out.println("Normal termination...");
	}
}
