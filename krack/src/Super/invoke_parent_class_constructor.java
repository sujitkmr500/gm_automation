package Super;


class wild { 
	wild()//parent constructor
	{
		System.out.println("invoking parent class constructor : ");
	}
}
class Domestic extends wild{
	public Domestic() {
		super();// sub class constructor
		System.out.println("invoking sub class constructor");
	}
}
public class invoke_parent_class_constructor {

	public static void main(String[] args) {
		Domestic dom  = new Domestic();
	}
}
