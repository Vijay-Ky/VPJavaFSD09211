class Y 
{
	public static void main(String[] args) 
	{
		for(int i = 0; i < 10; i++)
		{
			System.out.println("for loop begin: " + i);
			if(i > 5)
			{
				break;
			}
			System.out.println("for loop end: " + i);
		}
	}
}
//continue - skip to next iteration
//break - terminate entire loop (not skipping to next iteration)