class Y
{
	public static void main(String[] args) 
	{
		System.out.println("from main begin");
		test(10);
		System.out.println("from main end");
	}
	public static void test(int i, double j)//argument/parameter/signature
	{
		System.out.println("from test(int)");
	}
}