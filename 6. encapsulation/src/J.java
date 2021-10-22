class I
{
	private String name;
	private String idNum;
	private int age;

	public int getAge()
	{
		return age;
	}

	public String getName()
	{
		return name;
	}

	public String getIdnum()
	{
		return idNum;
	}

	public void setAge(int newAge)
	{
		if (newAge <= 0)
		{
			System.out.println("Invalid input");
			return;
		}
		this.age = newAge;
	}

	public void setName(String newName)
	{	
		if (newName == null)
		{
			System.out.println("Invalid input");
			return;
		}
		this.name =  newName;
	}

	public void setIdnum(String newId)
	{
		if (newId == null || newId == "0")
		{
			System.out.println("Invalid input");
			return;
		}
		this.idNum = newId;
	}
}
class J extends I
{
	public static void main(String[] args) 
	{
		J j1 = new J();
		j1.setName(null);
		j1.setAge(990);
		j1.setIdnum("A1420");
		System.out.println("Name: " + j1.getName() + " Age: " + j1.getAge() +
			" Idnum: " + j1.getIdnum());
	}
}