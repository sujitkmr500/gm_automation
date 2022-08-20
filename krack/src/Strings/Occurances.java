package Strings;

public class Occurances {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// EXTRACTED WORD FROM THE SENTENCE
//		String input_str ="red Apple red is in red color red";
//		String word_match = "red";
//		int count = 0;
//		
//		String[] split_sentence = input_str.split(" ");
//		for(int i = 0;i<= split_sentence.length-1;i++)
//		{
//			if(word_match.equals(split_sentence[i]))
//			{
//				count++;
//			}
//			else {}
//		}
//		System.out.println(count);
		
	
		// EXTRACR CHARACTER FROM THE STRINGS
		String str = "apapale";
		System.out.println(str);
		// count occurrence 
		int count = str.length() - str.replace("a", "").length();
		System.out.println("occurrence of a: "+count);
		
		String str_sentence = "this is a man is";
		System.out.println(str_sentence);
		//count occurance
		System.out.println(str_sentence.length());
		System.out.println(str_sentence.replace("is", " ").length());
		int counter = str_sentence.length() - str_sentence.replace("is", " ").length();
		System.out.println("occurance : "+counter);
	}
}
