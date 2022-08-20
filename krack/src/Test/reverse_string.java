package Test;

public class reverse_string {
	
	//In:  I Am Not String
	///Out: g ni rtS toNmAI
	public static void main(String[] args) {
		
		String str = "I Am Not String";
		StringBuilder sb = new StringBuilder(str);
		//System.out.println(sb.reverse().toString());
		String str2 = sb.reverse().toString().replace(" ", "");
		System.out.println(str2);
		int count  = 0;
		//for(int i = 0; i<)
	}

}
