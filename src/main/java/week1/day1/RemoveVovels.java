package week1.day1;

public class RemoveVovels {
	/*
	 * given string remove vovels and return new string input: testleaf output:
	 * tstlf input: aeiou output:
	 * 
	 * Pesudocode: 1. string to char[] and vovels char[] 2.for loop 3.if condition
	 * equal to char[] 4.replace
	 */

	 public static StringBuilder replaceVovels(String input) { 
		 char[] output = new char[input.length()]; 
		 StringBuilder result = new StringBuilder(); 
		 char[] inputChar = input.toCharArray(); 
		 char[] vovels = {'a','e','i','o','u'}; 
		 for(int i = 0; i < inputChar.length; i++) { 
			 boolean isVovel = false; 
			 for (int j = 0; j < vovels.length; j++) { 
				 if(vovels[j]==inputChar[i]) { 
					 isVovel = true;
					 break; 
					 } 
				 } 
			 if(!isVovel) { 
				 result.append(i); 
				 } 
			 } 
		 return result;
		 }
	 
	public static String removeVowels(String input) {
		return input.replaceAll("[aeiouAEIOU]", "");
	}

	public static void main(String[] args) {

		String inputText = "testleaf";
		System.out.println(replaceVovels(inputText));
		System.out.println(removeVowels(inputText));

	}

}
