import java.util.StringTokenizer;


public class IA_2_Q2a_StringTokenizer
{

	public static void main(String[] args)
	{
		StringTokenizer st1 = new StringTokenizer("Java The");
		StringTokenizer st2 = new StringTokenizer("Complete/Reference/java/Java");
		
		String tokenList1[] = new String[50];
		String tokenList2[] = new String[50];
		
		int i=0;
		while(st1.hasMoreTokens())
		{	
			tokenList1[i] = st1.nextToken();
			System.out.println(tokenList1[i]);
			i++;
		}
		System.out.println();
		
		int j=0;
		while(st2.hasMoreTokens())
		{	
			tokenList2[j] = st2.nextToken("/");
			System.out.println(tokenList2[j]);
			j++;
		}
		
		System.out.println("\nCommon token are");
		for(int k=0;k<i;k++)
		{
			for(int l=0;l<j;l++)
			{
				if(tokenList1[k].compareTo(tokenList2[l])==0)
					System.out.println(tokenList1[k]);
			}
		}
		
			
	}

}
