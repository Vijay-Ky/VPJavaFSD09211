class C
{
	public String nationality = "Indian";
	String city = "Bangalore";
}
class D extends C
{
	public static void main(String[] args)
	{
		D b1 = new D();
		System.out.println(b1.nationality);
		System.out.println(b1.city);

	}
}
























/*
1. Encapsulation in Java is a process of wrapping code and data together 
into a single unit, for example, a capsule which is mixed of several medicines.
2. We can create a fully encapsulated class in Java by making all the data 
   members of the class private.
3. By providing only a setter or getter method, you can make the class read-only
   or write-only. In other words, you can skip the getter or setter methods.
4. It provides you the control over the data. Suppose you want to set the value 
   of id which should be greater than 100 only, you can write the logic inside the setter method.
   You can write the logic not to store the negative numbers in the setter methods.
5. It is a way to achieve data hiding in Java because other class will not be able 
   to access the data through the private data members.
*/