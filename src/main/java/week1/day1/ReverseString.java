package week1.day1;

public class ReverseString {
	/*
	 * Reverse a string
	 * 
	 * in: tester
	 * ot: retset
	 * 
	 * psudo:
	 * 1. string-> char array
	 * for loop
	 * syso print index
	 */
	
	  public static char[] reversrString(char[] input) { 
      char[] inputChar = input;
	  char [] reversedChar= new char[inputChar.length]; for (int i =
	  inputChar.length-1, j=0; i >=0 ; i--,j++) { reversedChar[j]=inputChar[i]; }
	  return reversedChar; 
	  }
	public static String reverString(String input) {
		String reversedString="";
		
		  for(int i=input.length()-1;i>=0;i--) { reversedString +=input.charAt(i); }
		 
		return reversedString;
	}
	public static void main(String[] args) {
		String input = "Tester";
		System.out.println(reverString(input));
	}
}
