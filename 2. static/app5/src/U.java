class U
{
	static int i = test1();
	static int j = test2();
	
	static 
	{
		System.out.println("SIB:" + "i:" + i + ", " + "j:" + j);
		i += 1;
		j += i;
		main(null);
		System.out.println("SIBAgain:" + "i:" + i + "," + "j:" + j);
		i += 2;
		j += i;
	}

	public static int test1()
	{
		System.out.println("test1:" + "i:" + i + "," + "j:" + j);
		i += 3;//i = i + 3
		j += i;//j = j + i
		main(null);
		System.out.println("test1Again:" + "i:" + i + "," + "j:" + j);
		i += 4;
		j += i;
		return i + j + 5;
	}

	public static int test2()
	{
		System.out.println("test2:" + "i:" + i + "," + "j:" + j);
		i += 6;
		j += i;
		main(null);
		System.out.println("test2Again:" + "i:" + i + "," + "j:" + j);
		i += 7;
		j += i;
		return i + j + 8;
	}

	public static void main(String[] args)
	{
		System.out.println("main:" + i);
		i += 9;
		j += i;
		System.out.println("main end:" + "i:" + i + "," + "j:" + j);
	}
}
/*
i = 3,12,16,52,58,67,74,75,84,86,95
j = 3,15,31,89,156,230,312,387,471,557,652

test1:i:0,j:0
main:3
main end:i:12,j:15
test1Again:i:12,j:15
test2:i:52,j:31
main:58
main end:i:67,j:156
test2Again:i:67,j:156
SIB:i:74,j:312
main:75
main end:i:84,j:471
SIBAgain:i:84,j:471
main:86
main end:i:95,j:652
*/