package Generics;

import java.util.Vector;

class StudentInfo
{
	String name;
	int age;
	public StudentInfo(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
}
public class IA_2_Q3b_GenericVersionOfVector 
{

	public static void main(String[] args)
	{
		StudentInfo s1 = new StudentInfo("Pavan", 21);
		
		Vector<StudentInfo> vec = new Vector<StudentInfo>();
		vec.add(s1);
		s1.name="Kumar"; //Pavan is replaced by Kumar
		vec.add(new StudentInfo("Raj", 25));
		vec.add(new StudentInfo("Raj", 25));
		
		java.util.Iterator<StudentInfo> itr =  vec.iterator();
		while(itr.hasNext())
		{
			StudentInfo std = (StudentInfo)itr.next();
			System.out.println("Name:  "+std.name+"\tAge:   "+std.age);
		}
		
		vec.remove(0);
		System.out.println("\nAfter removing first element");
		java.util.Iterator<StudentInfo> it =  vec.iterator();
		while(it.hasNext())
		{
			StudentInfo std = (StudentInfo)it.next();
			System.out.println("Name:  "+std.name+"\tAge:   "+std.age);
		}

	}

}
