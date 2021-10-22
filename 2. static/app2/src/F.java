class F
{
	static int i;
	public static void main(String[] args)
	{
		System.out.println("from F main: " + G.i);
	}
}
class G
{
	static int i;
	public static void main(String[] args)
	{
		System.out.println("from G main: " + F.i);
	}
}
