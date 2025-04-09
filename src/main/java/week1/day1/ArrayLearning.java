package week1.day1;

import java.util.Arrays;

import org.testng.annotations.Test;

public class ArrayLearning {
	/*
	 * Find duplicate number
	 * 
	 */

	public static int[] duplicateFinder(int [] inputArray) {


       int [] inputA= inputArray;
		  if (inputArray == null || inputArray.length < 2) {
	            return new int[0]; // Return empty array for invalid input
	        }
		//int[] output=new int[inputArray.length];
		int[] sorted= Arrays.copyOf(inputArray,inputArray.length );
		 Arrays.sort(sorted);
		 int duplicate =0;
		 for (int i = 0; i < sorted.length-1; i++) {
			 if(sorted[i]== sorted[i+1]) {
				 //output = inputA[i];
				 duplicate++;
				 while(i < sorted.length-1 && sorted[i]== sorted[i+1]) {
					 i++;
				 }
			 }
			
		}
		 int[] output = new int[duplicate];
		 int index =0;
		 for (int i = 0; i < sorted.length-1; i++) {
			if(sorted[i]== sorted[i+1]) {
				output[index++] = sorted[i];
				while(i<sorted.length-1 && sorted[i]== sorted[i+1]) {
					i++;
				}
			}
		}
		return output;
	}
	@Test
	public void TestOne() {
		int [] input = {23,36,23,45,67,26,45,41,36};
		int duplicates[] = duplicateFinder(input);
	    System.out.println(Arrays.toString(duplicates));
	}
	@Test
	public void Testtwo() {
		int [] input = {36};
		int duplicates[] = duplicateFinder(input);
	    System.out.println(Arrays.toString(duplicates));
	}
}
