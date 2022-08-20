package Array;

public class Array {

	public static void main(String[] args) 
	{
		//Java Program to illustrate how to declare, instantiate, initialize  
		//and traverse the Java array.  
		
		int a[] = new int[4];//declaration and instantiation  
		a[0] = 0;//initialization  
		a[1] = 1;
		a[2] = 2;
		a[3] = 3;
		//traversing array 
		for (int i  = 0;i<=a.length-1;i++)//length is the property of array  
		{
			System.out.println("value of a : ["+i+"] : "+a[i]);
		}

		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~s");
		int c[] = {11,12,13,14,15};
		for(int i = 0;i<=c.length-1;i++)
		{
			System.out.println("value of c : "+c[i]);
		}
		System.out.println("~~~~~~for each loop~~~~~~~~~~~~");
		{
			for(int i:c)
			{
				System.out.println("for each value of i : "+i);
			}
		}
	}
}
