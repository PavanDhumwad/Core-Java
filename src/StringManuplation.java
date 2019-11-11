import java.io.*;
import java.util.Scanner;
public class StringManuplation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter:");
	    StringBuffer b=new StringBuffer(s.next());
	    
	    System.out.println("Information entered:"+b);
	    System.out.println("Capacity of StringBuffer is "+b.capacity());
	    
	    System.out.println("Reverse format of string entered is "+b.reverse());
	    String c=new String(b);
	    
            System.out.println(c);
            
            int z;
         z=c.charAt(0);
         
       
         System.out.println("hiiiiiiiiiiiii"+z);
	    System.out.println("Upper case  format of Reversed string entered is "+c.toUpperCase());
	    c=c.toUpperCase();
	    
	    System.out.println(c);
	    b=new StringBuffer(c);
	    System.out.println("Enter:");
	    StringBuffer d=new StringBuffer(s.next());
	    b=b.append(d);
	    d=b;
	    System.out.println("String after appending the Upper case  formated of Reversed string is "+d);
	    System.out.println(d.length());
	    
	    char result[]=new char[d.length()];
	    char temp;
	    int k,i;
	    for(i=0;i<(d.length());i++){
	    	result[i]=d.charAt(i);
	    	System.out.print(result[i]);
	    }
	    	
	    for(i=0;i<(d.length()-1);i++)
	    {
	    	for(k=i+1;k<d.length();k++)
	    	{
	    		if(result[i]>result[k])
	    		{
                     temp=result[i];
                     result[i]=result[k];
                     result[k]=temp;     
	    		}
	    	}
	    
	    }
	    System.out.println("\n\n\nAfter sorting:");
	    for(i=0;i<(d.length());i++)
	    	System.out.print(result[i]);		

	}

}
