package Strings;

public class Palindrome {

	public static void main(String[] args) {
		String word = "ABCD";
		StringBuilder sb = new StringBuilder(word);
		String rev = sb.reverse().toString();
		if(word.equals(rev))
		{
			System.out.println("yes it is palindrome :)");
		}
		else{
			System.out.println("not a palindrome :(");
		}
	}
}
