package method_Overridding;

//creating a parent class
class Vhecile{
	void run()
	{
		System.out.println("Vhecile is running");
	}
}
//creating child class
class Bike extends Vhecile{
	public static void main(String args[])
	{
		 //creating an instance of child class  
		Bike bike = new Bike();
		//calling the method with child class instance 
		bike.run();		
	}
}
