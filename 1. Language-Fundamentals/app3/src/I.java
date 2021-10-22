class I
{
	public static void main(String[] args)
	{
		int x = 0;
		int	y = x++ + x++ + x++ + x;
		System.out.println(x);
		System.out.println(y);
	}
}
/*
x = 0; 
y = x++ + x++ + x++ + x;

keep track x value = 0, 1, 2, 3

x++ = 0 + x++ = 1 + x++ = 2, x = 3
*/