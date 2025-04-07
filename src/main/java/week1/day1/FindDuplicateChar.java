package week1.day1;

public class FindDuplicateChar {

	/*
	 * Find the number of occurence of given char
	 * 
	 * Input: "Testleaf" 'e'
	 * output:2
	 * 1. string to char array
	 * 2. loop through the array
	 * 3.check if the char matches the input char
	 * 4.Match-> increment
	 * 5. print count
	 */

	public static int findOccurence(String input, char search ) {
		char[] charinput = input.toCharArray();
		int count = 0;
		for( int i=0; i< charinput.length; i++) {
			if(charinput[i]== search ) {
				count++;
			}
		}
		return count;
		
	}
	public static void main(String[] args) {
	String input = "testleaf";
	char search ='e';
	System.out.println(findOccurence(input,search));
	}

}
