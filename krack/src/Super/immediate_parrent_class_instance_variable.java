package Super;

class Animal{
	//define one variable
	String color = "Red";
}
class Dog extends Animal
{
	String color = "Black";
	void print_color()
	{
		System.out.println("without super keyword color is : "+color);	
		System.out.println("with super keyword color is : "+super.color);
	}
}

public class immediate_parrent_class_instance_variable {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.print_color();
	}
}
