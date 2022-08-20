package Array;



public class Reverse_the_elements {

	public static void main(String[] args) 
	{
		int[] int_array = {1,2,3,4,5,6,7,8,9};
		//reverse the element
		for(int i = int_array.length-1;i>=0;i--)
		{
			System.out.print(int_array[i]+",");
		
		}
		//copy the elemets from one aray to another array
		int[] copied_array = new int[15];
		//copied_array = int_array;
		//System.out.println("Data of copied array : "+copied_array.length);
		System.arraycopy(int_array, 0, copied_array, 0, 9);
		System.out.println("copied array : "+copied_array.length);
		for(int b = 0;b<=int_array.length-1;b++)
		{
			copied_array[b] = int_array[b];
		}
		for(int i = copied_array.length-1;i>=0;i--)
		{
			System.out.println("value of copied array : "+copied_array[i]+",");
		
		}
	}
}
