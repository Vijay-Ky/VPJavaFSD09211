class R
{
	static void test1()
	{
		System.out.println("from test1.R");
	}
}

class S extends R
{
	static void test1(int i)
	{
		System.out.println("from test1.S");
	}
	public static void main(String[] args) 
	{
		R r1 = new S();
		r1.test1();

		S s1 = new S();
		s1.test1();
		s1.test1(10);
		
	}
}
