package week1.day1;

import org.testng.annotations.Test;

/*
 * input changeme
 * output chAnGeMe
 * 
 * string to char array
 * loop
 * if(i/2)
 * break
 * else
 * input[i]= replace
 */

public class ChangeOddIndexToUpperCase {

	private static char[] AfterChangeIndexoddToCapital(String input) {
		char[] inputChar = input.toCharArray();
		for (int i = 0; i < inputChar.length; i++) {
			
			  if(i%2 != 1) { 
				  
				  inputChar[i]= Character.toUpperCase(inputChar[i]); }
			 
			//inputChar[i]= Character.toUpperCase(inputChar[i]);
		}
		
	
		return inputChar;
	}
	@Test
	public static void TestOne() {
		String input = "changeme";
		System.out.println(AfterChangeIndexoddToCapital(input));
	}


}
