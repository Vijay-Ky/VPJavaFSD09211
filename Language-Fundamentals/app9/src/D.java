class D
{
	public static void test()
	{
		System.out.println("from test");
	}
	public static void main(String[] args)
	{
		System.out.println("from main begin");
		test();//calling statement
		System.out.println("from main end");
	}
}