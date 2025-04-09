package week1.day1;

import org.testng.annotations.Test;

/*
 * sum of two in the array
 * 
 * input {2,3,4,5}
 * k = 9
 * loop 
 * if input[i]+ input[i+1]=k
 * return true
 */


public class TwoSum {
	private static boolean TwoSumfinder(int[] input, int k) {
		boolean SumFound = false;
		for (int i = 0; i < input.length-1; i++) {
			if(input[i]+input[i+1]==k) {
				SumFound = true; 
			}
		}
		
		return SumFound;
	}
	@Test
	public static void TestOne() {
		int [] input= {2,3,4,5};
		int k = 7;
		System.out.println("After validation result of sum finder:" +" "+TwoSumfinder(input,k));
	}


}