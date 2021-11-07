class M2
{
	public static void main(String[] args) 
	{
		test();
	}
	static void test() 
	{
		try
		{
			Class.forName("");
		}
		catch (ClassNotFoundException ex)
		{
		}
	}
}
