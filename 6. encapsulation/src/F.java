class E
{
	private String name = "vijay";
	private int id = 101;
	private int age = 100;

	//read-only
	public String getName()
	{
		return this.name;
	}

	public int getId()
	{
		return this.id;
	}

	public int getAge()
	{
		return this.age;
	}

}
class F extends E
{
	public static void main(String[] args)
	{
		F f1 = new F();
		System.out.println(f1.getName());
		System.out.println(f1.getId());
		System.out.println(f1.getAge());
	}
}




















