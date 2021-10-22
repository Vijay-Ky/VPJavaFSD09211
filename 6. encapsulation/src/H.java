class G
{
	private String name = "vijay";
	private int id = 101;
	private int age = 100;

	//write-only
	public void setName(String name)
	{
		this.name = name;
		//System.out.println(this.name);
	}

	public void setId(int id)
	{
		this.id = id;
		//System.out.println(this.id);
	}

	public void setAge(int age)
	{
		this.age = age;
		//System.out.println(this.age);
	}

}
class H extends G
{
	public static void main(String[] args)
	{
		H h1 = new H();
		h1.setName("adam");
		h1.setId(201);
		h1.setAge(80);
	}
}




















