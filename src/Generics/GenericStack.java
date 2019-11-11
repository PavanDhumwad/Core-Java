package Generics;

//Both the program behave same.First prg is hard coded implem of STK but second one is using in-built STK class
class GenStack<T>
{
	T[] arr;
	int size,top;
	
	@SuppressWarnings("unchecked")
	public GenStack(int s) 
	{
		size=s;
		this.arr = (T[]) new Object[size];
		top=-1;
		
	}
	
	void push(T a)
	{
		if(top==size-1)
		{
			System.out.println("Stack is full   "+arr.getClass().getName());
			return;
		}	
		this.arr[++top] = a;
	}
	
	void pop()
	{
		if(top==-1)
		{
			System.out.println("Stack is empty   "+arr.getClass().getName());
			return;
		}
		System.out.println("Popped element is "+arr[top--]);
	}
	
	void display()
	{
		int k=top;
		if(top==-1)
		{
			System.out.println("Stack is empty   "+arr.getClass().getName());
			return;
		}
		for(int i=k;i>=0;i--)
			System.out.println(arr[i]);
		System.out.println();
		
	}
}
public class GenericStack
{

	public static void main(String[] args) 
	{
		GenStack<Integer> GSInt = new GenStack<Integer>(5);
		GSInt.push(new Integer(10));
		GSInt.push(9);
		GSInt.push(8);

		GenStack<String> GSStr = new GenStack<String>(5);
		GSStr.push("Pavan");
		GSStr.push("G");
		GSStr.push("Dhumwad");
		
		GenStack<Object> GSObj = new GenStack<Object>(5);
		GSObj.push(5);
		GSObj.push("Object");
		GSObj.push(45.5F);
		
		GSInt.display();
		GSStr.display();
		GSObj.display();
		
	}

}


/*
 import java.util.Stack;
public class Generics.GenericStack
{

	public static void main(String[] args) 
	{
		Stack<Integer> GSInt = new Stack<Integer>();
		Stack<String> GSStr = new Stack<String>();
		Stack<Object> GSObj = new Stack<Object>();
		
		GSInt.push(new Integer(10));
		GSInt.push(9);
		GSInt.push(8);
		
		GSStr.push("Pavan");
		GSStr.push("G");
		GSStr.push("Dhumwad");
	
		GSObj.push(5);
		GSObj.push("Object");
		GSObj.push(45.5F);
		
		GSInt.pop();
		
		GSStr.pop();
		GSStr.pop();
		
		GSObj.pop();
		GSObj.pop();
		GSObj.pop();
			
		System.out.println(GSInt);
		System.out.println(GSStr);
		System.out.println(GSObj);
			
	}
}
*/
