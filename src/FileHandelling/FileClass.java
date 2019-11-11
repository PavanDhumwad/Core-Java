package FileHandelling;

import java.io.*;
public class FileClass 
{
	public static void main(String[] args) throws IOException
	{
	    File f1=new File("\\P:\\Study Material\\pavan1.txt");
		f1.createNewFile();
		//f1.delete() is used to delete file
		System.out.print("Name of file="+f1.getName()+" ");
		System.out.println(f1.exists() ? "exists" : "does not exist");
		//Here you CANNOT write/read file.You can just know characteristics of file  like its size and etc.
	}

}
