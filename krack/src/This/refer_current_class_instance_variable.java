package This;

class Student
{
	int Roll_No;
	String Name;
	
	Student(int r, String n)
	{
		this.Roll_No = r; // its is called implicitly also
		this.Name = n;
	}
	public void display() {
		System.out.println("Roll no : "+Roll_No+" Name : "+Name);
	}
}
public class refer_current_class_instance_variable 
{
	public static void main(String args[])
	{
		Student std = new Student(111, "Sujit");
		std.display();
		Student std2 = new Student(112, "Kumar");
		std2.display();
	}
}
