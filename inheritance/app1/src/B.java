class A//base, super, parent class
{
	int i;
}
class B extends A//B class is derived class, sub, child class
{
	int j;
	public static void main(String[] args) 
	{
		B b1 = new B();
		System.out.println(b1.i);
		System.out.println(b1.j);
	}
}
//B IS-A A
