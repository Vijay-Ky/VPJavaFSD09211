class L
{
	public static void main(String[] args)
	{
		int i, j;
		for(i = 0, j = 10; j > 2; i++, j--)
		{
			System.out.println(i + ":" + j);
		}
		System.out.println(i + ":" + j);
	}
}
/*
i = 0,
j = 10,
-----------
0:10
1:9
2:8
3:7
4:6
5:5
6:4
7:3

*/