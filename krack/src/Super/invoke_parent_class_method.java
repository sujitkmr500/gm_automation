package Super;


class Animals
{
	void eating()
	{
		System.out.println("I called by super key word");
	}
}
class Lion extends Animals
{
	void eating()
	{
		System.out.println("EATING");
	}
	void roar()
	{
		System.out.println("ROARING");
	}
	void work()
	{
		super.eating();
		roar();
	}
}
public class invoke_parent_class_method {
	public static void main(String[] args) {
		Lion lion = new Lion();
		lion.work();
	}

}
