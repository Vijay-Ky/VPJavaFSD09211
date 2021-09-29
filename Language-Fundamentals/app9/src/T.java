class T 
{
	public static void main(String[] args) 
	{
		System.out.println("from main begin");
		int result = add1() + add2();
		System.out.println("Result is: " + result);
		System.out.println("from main end");
	}
	public static int add1()
	{
		System.out.println("from add1");
		return 10;
	}
	public static int add2()
	{
		System.out.println("from add2");
		return 20;
	}
}
