package constructor;

class Demo{
	int number;
	String name;

//	Demo() {
//		number = 100;
//		name = "sujit";
//	}

	void show() {
		System.out.println(number + name);
	}
}

class Demo_constructor
{
	public static void main(String args[])
		{
			System.out.println("inside main method");
			Demo_constructor ref_var = new Demo_constructor();
			System.out.println(ref_var.getClass());
			Demo ref_variable = new Demo();
			ref_variable.show();
			System.out.println(ref_variable);
		}
}