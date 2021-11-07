class R7 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		try
		{
		}
		catch (ArithmeticException ex)
		{
			try
			{
			}
			catch (ArithmeticException ex1)
			{
				try
				{
					
				}
				catch (ArithmeticException ex2)
				{
				}
			}
		}
		System.out.println("main end");
	}
}
