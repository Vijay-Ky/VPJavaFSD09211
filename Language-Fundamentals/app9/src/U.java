class U 
{
	public static void main(String[] args) 
	{
		System.out.println("from main begin");
		double result = add1() + add2();
		System.out.println("Result is: " + result);
		System.out.println("from main end");
	}
	public static double add1()
	{
		System.out.println("from add1");
		return 10.20;
	}
	public static double add2()
	{
		System.out.println("from add2");
		return 20.40;
	}
}
