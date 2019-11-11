package Exception;

class ExForNullPointerException
{
	String name;
	public ExForNullPointerException() 
	{
		System.out.println("Str is "+name+"\n");
		System.out.println("Str len="+name.length());
	}
	
}
public class ExNullPointerExecption
{

	public static void main(String[] args)
	{
		ExForNullPointerException e = new ExForNullPointerException();
	}

}
