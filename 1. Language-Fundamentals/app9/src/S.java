class S
{
	public static void main(String[] args)
	{
		System.out.println("main begin");
		System.out.println(test());
		System.out.println("main end");
	}
	public static boolean test()
	{
		System.out.println("from test");
		return false;
	}
}