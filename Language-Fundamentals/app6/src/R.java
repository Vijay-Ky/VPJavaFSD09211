class R
{
	public static void main(String[] args)
	{
		for(int i = 0; i < 10; i++)
		{
			System.out.println("loop begin");
			if(i > 5)
			{
				break;
			}
			System.out.println("loop end");
		}
		System.out.println("main end");
	}
}
/*
loop begin
loop end
loop begin
loop end
loop begin
loop end
loop begin
loop end
loop begin
loop end
loop begin
loop end
loop begin
main end
*/