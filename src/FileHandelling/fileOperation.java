package FileHandelling;

import java.io.*;
public class fileOperation 
{

	public static void main(String[] args) throws IOException
	{
		int i;
		String s1;
		//Run this prg and read o/p.
		FileInputStream fin;
		try 
		{
			fin=new FileInputStream("\\P:\\Study Material\\pavan.txt");
		} 
		catch(FileNotFoundException e) 
		{
			System.out.println("File Not Found in reading\n"+e);
			return;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Usage: ShowFile File");
			return;
		}
		
		// read characters until EOF is encountered
		do
		{
			i = fin.read();
			if(i != -1)
			    System.out.print((char) i);
		} while(i != -1);
		
		System.out.println("Reading content of file line by line\n");
		FileReader fr=new FileReader("\\P:\\Study Material\\pavan.txt");
		BufferedReader br=new BufferedReader(fr);
		
		
		while((s1=br.readLine())!=null)
			System.out.println(s1);
		//If you remove s1 from above lines then o/p will contain all lines expect first and last lines. 
		br.close();
		
		fin.close();
	}
}