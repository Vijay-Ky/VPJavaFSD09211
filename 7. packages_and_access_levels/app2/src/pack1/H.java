package pack1;
class H 
{
	private int i;
	public void set(int k)
	{
		if(k <= 0)
		{
			System.out.println("Pls enter non-zero non-negative value");
			//emergency exit
			//exit code
			System.exit(-100);
		}
		this.i = k;
	}
	public int get()
	{
		return i;
	}
}
class I
{
	public static void main(String[] args) 
	{
		H h1 = new H();
		System.out.println(h1.get());//
		h1.set(-1);
		System.out.println(h1.get());//
	}
}
