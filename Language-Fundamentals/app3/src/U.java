class U
{
	public static void main(String[] args)
	{
		int i = 0;
		int j = ++i + i + ++i + i;
		System.out.println(i);//2
		System.out.println(j);//6
		i = 0;
		System.out.println(i);//0
		int k = --i + i + --i + i;
		System.out.println(i);//-2
		System.out.println(k);//-6
	}
}