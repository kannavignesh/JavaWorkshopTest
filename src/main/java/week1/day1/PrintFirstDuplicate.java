package week1.day1;

public class PrintFirstDuplicate {
	/*
	 * given string find first duplicat.
	 * 
	 * input: "testleaf"
	 * output: t
	 * 
	 * input: queen
	 * output: e
	 * 
	 * input helo
	 * output: no dupliate
	 * 
	 * algorithm
	 * 1.string to char
	 * 2.loop outer 0->length-1
	 * 3. loop inner i+1 -> length-1
	 * 4. compare
	 * 5. if matches print the char and break
	 * 6. Print no dupes!
	 * 
	 */
	
	public static char[] findDupes(String input) {
		char[] dupe;
		String noDupe = "No dupe";
		char[] inputChar = input.toCharArray();
		int duplicate = 0;
		boolean dupeFound = false;
		for (int i=0;i<inputChar.length;i++) {
			for (int j=i+1;j<inputChar.length; j++) {
				if(inputChar[i] == inputChar[j]) {
					dupe = new char[inputChar.length];
					dupe[duplicate++] =inputChar[i];
					dupeFound = true;
					return dupe;
				}
			}
		}
		//if(!dupeFound)
		return noDupe.toCharArray();
	}
	public static void main(String[] args) {
		String input= "amma";
		System.out.println(findDupes(input));

	}

}
