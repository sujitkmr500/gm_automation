package constructor;

class A 
{
	
	int a; String b;
	A() //default constructor
	{
		a = 1010101;
		b = "lalu";
		
	}
	void display() //method
	{
		System.out.println(a+b);
	}
}

class Default_constructor_example
{
	public static void main(String args[]) {
		A rv = new A();
		rv.display();
	}
}