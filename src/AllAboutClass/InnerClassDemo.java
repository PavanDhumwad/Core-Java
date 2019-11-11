package AllAboutClass;

class OuterClass
{
	int outer_x = 100;
	static int sOuter_x = 30;

	class InnerClass
	{
		//Inner class, 'InnerClass' can access both static and non-static members of AllAboutClass.OuterClass
		public int inner_x = 20;//inner_x can be accessed only using object of inner class
		void display()
		{
			outer_x++;
			sOuter_x++;
			System.out.println("display: outer_x = " + outer_x);
			System.out.println("display: outer_x = " + sOuter_x);
		}
	}

	static class StaticNestedClass
	{
		//Nested static class 'StaticNestedClass' class can access only static member of AllAboutClass.OuterClass
		void display()
		{
			//You can't do this-> outer_x++;
			System.out.println("display: sOuter_x = " + sOuter_x);
		}
	}

	void test()
	{
		int notFinal = 10;
		final int FINAL = 8;
		class LocalInnerClass
		{
			void display()
			{
				outer_x++;
				//LocalInnerClass can access method variables but can't modify them. You can't do this-> notFinal++;
				System.out.println("display: notFinal = "+notFinal);
				System.out.println("display: outer_x = " + outer_x);
				System.out.println("display: FINAL = "+FINAL);//But you can access
			}
		}
		System.out.println("Outside the LocalInnerClass");
		//This is only area of instatation of LocalInnerClass
		LocalInnerClass localInner = new LocalInnerClass();
		localInner.display();
		InnerClass inner = new InnerClass();
		inner.display();
	}
}

class InnerClassDemo
{
	public static void main(String args[])
	{
		OuterClass outer = new OuterClass();
		OuterClass.InnerClass inner = outer.new InnerClass();
		inner.display();
		outer.test();
		System.out.println("Main: outer_x = "+outer.outer_x);
		OuterClass.StaticNestedClass snc = new OuterClass.StaticNestedClass();
		snc.display();
	}
}