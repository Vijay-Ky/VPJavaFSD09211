interface MyInterface
{
	int i = 100;
	//from JDK1.8
	default void test1()
	{
		System.out.println("from test1() of MyInterface");
	}
	static void test2()
	{
		System.out.println("from test2() of MyInterface");
	}
	default void test3()
	{
		System.out.println("from test3() of MyInterface");
	}
	static void test4()
	{
		System.out.println("from test4() of MyInterface");
	}


	void test5();
	//abstract static void test6();
}

class MyClass implements MyInterface 
{
	public void test5()
	{
		System.out.println("from test5() of MyClass");
	}
	
	public static void main(String[] args) 
	{

		MyClass mc = new MyClass();
		MyInterface.test2();
		MyInterface.test4();
		mc.test1();
		mc.test3();

		
		
		
		//MyInterface obj = new MyClass();
		//obj.test1();
		//MyInterface.test2();
		//obj.test3();
		//MyInterface.test4();
		
		//static members are not involving in polymorphism
		//test2();
		//MyInterface.test2();
		//mc.test3();
		//MyInterface.test3();
		// MyInterface obj2 = new MyClass();
		 //obj2.test3();
		//MyInterface.test4();
		//obj2.test4();
	}
}