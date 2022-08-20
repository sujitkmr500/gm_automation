package headoutarraytriplet;

public class Arraytriplet 
{
	public static int triplet(int arr[], int n)
	{
		int count = 0;
		for(int i = 0;i<n;i++)
		{
			for (int j = i+1;j<n;j++)
			{
				for(int k = j+1;k<n;k++)
				{
					if(arr[i]<arr[j] && arr[j]<arr[k])
					{
						count = count+1;
					}
				}
			}
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[] {1,3,2,4,5};
		int n = arr.length;
		System.out.println(triplet(arr, n));
	}

}
