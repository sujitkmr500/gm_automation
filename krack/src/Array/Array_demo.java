package Array;

public class Array_demo {

	public static void main(String[] args) {
		//decleration of an array
		String[] stringarray;
		//Instantiation of an array
		stringarray = new String[10];
		//Declare, Instantiate and Initialize an array
		String[] stringArray = {"Str1","Str2","Str3","Str4","Str5"};
		//Initialize the elements of array by its index position 
		stringArray[4]="Test String";
		System.out.println(stringArray[4]);
		System.out.println("length of the array : "+stringArray.length);
		for(int i = 0;i<=stringArray.length-1;i++)
		{
			System.out.println(stringArray[i]);
		}
	}
}
