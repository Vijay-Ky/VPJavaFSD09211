class E
{
	public static void main(String[] args) 
	{
		boolean[] x = {true, false, false, false};
		boolean i;
		for(i : x)
		{
			System.out.println(i);
		}
	}
}
/*
1. you must declare variable inside for-each loop
2. in case of normal for loop we can start iteration from anywhere we want
   but in for-each iteration will from begginning only
3. in case of normal for we can increment by any no. of steps
   ex. i++ or i += 2 but this feature not availble in for each i,e we dont have
   increment or decrement part.
4. in case of for-each we can only iterate in the increment order not possible
   in decrement order.
5. for-each loop we dont have control over index by default index will be starting
   from 0th
*/