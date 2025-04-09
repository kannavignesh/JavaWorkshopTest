package week1.day1;
public class ReverseWord {
	/*
	 * reverse word
	 * psudo:
	 * string-> split
	 * loop revers
	 * syso
	 */
	public static String reversedData(String input) {
		String[] splitData = input.split(" ");
		String [] reveredData = new String[splitData.length];
		for (int i = splitData.length-1,j=0; i >=0 ; i--,j++) {
			
			reveredData[j] = splitData[i];
		}
		return String.join(" ", reveredData);
	}
	public static void main(String[] args) {
		String data ="Today is a beautiful day";
		System.out.println(reversedData(data));
	}
}