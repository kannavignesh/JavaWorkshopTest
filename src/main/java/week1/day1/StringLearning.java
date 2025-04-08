package week1.day1;

public class StringLearning {

	public static void main(String[] args) {
		
		//Approach 1
		//String Literal-> Better Memory management
		String company = "Bank of America";
		//Approach 2 
		//String Object-> More memory - every object
		String str = new String("Bank of America");
		
		//String methods -> variablename/obj reference
		
		//1. How many char?
		int length = company.length();
		System.out.println(length);
		
		//2. string to individual char
		char[] charArray = company.toCharArray();
		System.out.println(charArray);
		
		//3. convert to lower or upper case
		String lowerCase = company.toLowerCase();
		System.out.println(lowerCase);
		System.out.println(company.toUpperCase());
		
		//4. Check sub string exist- return boolean
		System.out.println(company.contains("Bank"));
		
		//5. Check start with/ end with string exist- return boolean
		System.out.println(company.startsWith("Bank"));
		System.out.println(company.endsWith("rika"));
		
		//6. position/ index of the char
		System.out.println(company.indexOf('k'));
		System.out.println(company.lastIndexOf('a'));
		System.out.println(company.indexOf('K')); //returns -1
		
		//7. Matches
		boolean equals = company.equals("Bank of America");
		System.out.println(equals);
		
		boolean equalIgnoreCase = company.equalsIgnoreCase("bank of america");
		System.out.println(equalIgnoreCase);
		
		// 8. Char at index
		System.out.println(company.charAt(0));
		//last index
		System.out.println(company.charAt(company.length()-1));
		
				
		

	}

}
