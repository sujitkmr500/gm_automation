package Array;

public class multidimensional_array {

	public static void main(String[] args) 
	{
		//declaring and initializing 2D array 
		int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
		//printing 2D array  
		for(int i = 0;i<3;i++)
		{
			for(int j = 0;j<3;j++)
			{
				System.out.print(a[i][j]+"");
			}
			System.out.println();
		}
	}

}
