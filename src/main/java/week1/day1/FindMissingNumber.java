package week1.day1;

import java.util.Arrays;

import org.testng.annotations.Test;

/*
 * Find missing Number
 * input ={8,7,6,3,5,4,11,9}
 * 
 * sort the array
 * loop
 * if input[i]+1 =! input[i+1]
 * return input[i]+1
 */
public class FindMissingNumber {
	
	private static int FindtheMissingNumber(int[] input) {
		
		 Arrays.sort(input);
		 int missingNumber = 0;
		 for (int i = 0; i < input.length-1; i++) {
			if(input[i]+1 != input[i+1]) {
				missingNumber= input[i]+1;
			}
		}
		
		return missingNumber;
	}
	@Test
	public static void TestOne() {
		int[]input= {8,7,6,3,5,4,11,9};
		System.out.println(FindtheMissingNumber(input));
	}



}
