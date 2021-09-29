class Z
{
	public static void main(String[] args) 
	{
		System.out.println("from main begin");
		double i = test(10, 20.0);
		System.out.println("from main end: " + i);
	}
	public static double test(int i, double j)//argument/parameter/signature
	{
		System.out.println("from test(int, double)");
		return j;
	}
}