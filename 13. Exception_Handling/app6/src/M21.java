class B
{
	B() throws InterruptedException
	{
		Thread.sleep(10000);
	}
}
class C extends B
{
	C() throws InterruptedException
	{
		super();
	}
}
class M21 
{
}
