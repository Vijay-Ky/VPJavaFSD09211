package pack1;
class J
{
	private int x;
	//default or package or friendly
	int y;
}
class K extends J 
{
	public static void main(String[] args) 
	{
		J j1 = new J();
		//K k1 = new K();
		System.out.println(j1.x);
		System.out.println(j1.y);
	}
}
