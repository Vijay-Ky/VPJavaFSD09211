class X
{
	public static void main(String[] args) 
	{
		System.out.println("from main begin");
		test("abc");
		System.out.println("from main end");
	}
	public static void test(int i)//argument/parameter/signature
	{
		System.out.println("from test(int)");
	}
}