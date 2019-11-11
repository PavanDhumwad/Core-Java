class UasgeOfStatic
{
	private UasgeOfStatic(P ob)//Catching reference variable of class P in ob
	{
		System.out.println("In UasgeOfStatic's parameterized constructor="+ob.b);
	}
	
	static
	{
		System.out.println("Static block executed only ONCE"); 
		System.out.println("In main-static block-The VERY FIRST one to be executed,irrestive of any thing.Because JVM itsef calls UasgeOfStatic class for the first time");
	}
	
	static void abc()
	{
		System.out.println("In 'AllAboutClass.abc' static method");
	}
	
	public static void main(String args[])
	{
	
		abc();
//Since AllAboutClass.abc(a static method) is present in the same class in which calling method is present(i.e,, main method)
//no need to refer to class name
		P.pqr();
//Since pqr method(a static method) IS NOT present in the same class in which calling method is present(i.e,, main method)
//WE need to refer to class name
		P p=new P();
		p.b=9;
		System.out.println("Object:"+p);
		//UasgeOfStatic a=
		new UasgeOfStatic(p);//Passing reference variable,p of class P
		//P q=
		new P(5);
	}

}

class P
{
	int b;
	P()  //If you make this constructor as private then CTE will occur @ line "P p=new P();";
	{
		System.out.println("In P constructor");
	}
	 P(int a)   //If you make this constructor as private then CTE will occur @ line "P q=new P(5);";
	 {
			System.out.println("In P's parameterized constructor="+a);
	 }
	 static 
	 {
		System.out.println("Static block executed only ONCE");   
		System.out.println("In P static block-The very first to be executed whenever controll comes inside P class for the first time.");
	 }
	 static void pqr()
	 {
			System.out.println("In 'pqr' static method");
	 }
	 public String toString()
	 {
		 return "MultiThreading.B="+b;
	 }		
}
	
