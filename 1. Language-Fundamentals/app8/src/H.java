class H
{
	public static void main(String[] args) 
	{
		int i = 2;
		switch(i)
		{
			case 2:
				System.out.println("from case 2");
			default:
				System.out.println("from default");
			case 20:
				System.out.println("from case 20");
				break;
			case 5:
				System.out.println("from case 5");
				break;
		}
		System.out.println("main end");
	}
}
