class T 
{
	int test()
	{
		try
		{
			//code
			return 0;
		}
		catch (ArithmeticException ex)
		{
			return 1;
		}
		finally 
		{	
			return 200;
		}
	}
	public static void main(String[] args)
	{
		T t1 = new T();
		System.out.println(t1.test());
	}
}

