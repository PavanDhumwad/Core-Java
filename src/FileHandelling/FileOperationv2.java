package FileHandelling;

import java.io.*;
public class FileOperationv2 
{
	public static void main(String args[]) throws IOException
	{
		String input = "InputData.txt";
		String output = "OutputData.txt";
		
		File fIn = null;
		File fOut = null;
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		int i, word=0, line=0;
		
		try 
		{
			fIn = new File(input);
			fOut = new File(output);
		
			fis = new FileInputStream(fIn);
			fos = new FileOutputStream(fOut);
			 
			
			do
			{
				i = fis.read();
				if(i!=-1)
				{
					if((char)i == ' ')
						word++;
					else if((char)i == '\n'){
						line++;word++;}
					
					fos.write((char)i);
				}	
				
			}while(i!=-1);
			
			System.out.println("Words= "+word+" Lines= "+line);
			System.out.println("Executed successfully\nGo and check @ path\n"+
				 "P:->Eclipse Standard 431->Eclipse Standard 431->java_lab->src->My_java_programs");
		}
		catch(FileNotFoundException e)
		{
			System.out.println("FNF\n"+e);
		}
		finally
		{
			fis.close();
			fos.close();
		}
	}
}
