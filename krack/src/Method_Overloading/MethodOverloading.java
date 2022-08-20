package Method_Overloading;



//2) Method Overloading: changing data type of arguments
class Adder
{
	static int add(int a,int b)
	{
		return a+b;
	}
	
	static double add(double a, double b)
	{
		return a+b;
	}
}
public class MethodOverloading {

	public static void main(String[] args) 
	{
		System.out.println(Adder.add(10, 20));
		System.out.println(Adder.add(1111.000, 2222.000));
	}
}
