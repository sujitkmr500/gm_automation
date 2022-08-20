package Strings;

public class Charcter_count_of_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Avul Pakir Jainulabdeen Abdul Kalam was an Indian aerospace scientist who served as the 11th president of India from 2002 "
				+ "to 2007. He was born and raised in Rameswaram, Tamil Nadu and studied physics and aerospace engineering";
		int count = 0;
		
		for(int i =0;i< input.length()-1;i++)
		{
			if(input.charAt(i) != ' ')
			{
				count++;
			}
		}
		System.out.println(count);
	}

}
