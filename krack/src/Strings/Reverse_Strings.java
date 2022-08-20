package Strings;


public class Reverse_Strings {
	
	//INPUT => "APPLE" OUTPUT => "ELPPA"

	public static void main(String[] args) {
		//		By method
		
//		StringBuilder sb = new StringBuilder("Apple");
//		sb.reverse();
//		System.out.println(sb);
		
		
		//INPUT = > "I AM GOOD" , OUTPUT => "DOOG MA I"
		
		// convert String to character array by using toCharArray
		
//		String input_str = "I am Sujit";
//		char[] char1 = input_str.toCharArray();
//		System.out.println(char1.length);
//		for(int i = char1.length-1;i>=0;i--)
//		{
//			System.out.print(char1[i]);
//		}
 		
		
		//INPUT = > "THIS IS INDIA", OUTPUT = > "INDIA IS THIS"
		//INPUT = > "MY NAME IS KHAN", OUTPUT = > "YM EMAN SI NAHK"
		
		//String input = "MY NAME IS KHAN";
	    //System.out.println(StringFormatter.reverseWord("my name is khan"));
		
		// REVERSE SENTENCE WORD BY WORD
//		String str = "India is my country";
//		String[] split = str.split(" ");
//		String result = "";
//		for(int i = split.length-1;i>=0;i--)
//		{
//			result +=(split[i]+ " ");
//		}
//		System.out.println(result.trim());
		
		// INPUT  = TIK TAK TAE Out PUT : KIT KAT EAT
		
		String input  = "TIK TAK TAE";
		System.out.println(input);
		String result = "";
		char[] ip_char = input.toCharArray();
		for(int i = input.length()-1;i>=0;i--)
		{
			result += ip_char[i];
		}
		System.out.println(result);
		String[] split = result.split(" ");
		String result2 = "";
		for(int i = split.length-1;i>=0;i--)
		{
			result2 += split[i]+" ";
		}
		System.out.println(result2);
		
	}
}


