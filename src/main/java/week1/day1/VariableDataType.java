package week1.day1;

import java.lang.reflect.Array;
import java.util.Iterator;

public class VariableDataType{
	public static void main(String[] args) {
		// Premetive data type
		System.out.println("Welcome");
		int rollno = 1001;
		System.out.println(rollno);
		short age =25;
		System.out.println(age);
		char initial = 'A';
		System.out.println(initial);
		boolean maritalstate = true;
		System.out.println(maritalstate);
		long mobile = 642108696754l;
		System.out.println(mobile);
		
	
		
		// decimal
		float weight = 110.9f;
		System.out.println(weight);
		double height = 175;
		System.out.println(height);
	
		// Non premetive data type string and array
		String name = "Vickey Rick";
		System.out.println(name);
	    //Array a[]= {1,2,3,4,5};		
	
		//----------------------------------------------------------------------------------//
		//Control flow ststements: IF, ElseIf, Switch
		if (age <18) {
			System.out.println("Eligible to vote");
		}else if(age <0) {
			System.out.println("Not a valid age");
		}
		else {
			System.out.println("not eligible to vote");
		}
		
		// Control flow sytstement: Switch case
		
		//--------------------------------------------------------------------------------------//
		// Iteration ststement: For, For each, While and do while
		// for loop
		// Print numbers from 1 to 10
//		for (int i = 0; i < 11; i++) {
//			System.out.println(i);
//			
//		}
		System.out.println("For loop printing 10 to 0");
		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
		}
		// print from 10 to 0
		System.out.println("For loop printing 10 to 0");
		for (int i = 10; i >=0; i--) {
			System.out.println(i);
		}
		// While loop
		System.out.println("While loop from 0 to 10");
		int i=0;
		while (i<=10) {
			
			System.out.println(i);
			i++;
		}
		// do while
		int dowhile = 1;
		System.out.println("Do while printing 0 to 10");
		do {
			System.out.println(dowhile);
			dowhile++;
		}
		while (dowhile<= 0);
	//foreach
		System.out.println("For each loop printing from 0 to 10");
		int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

		for (int num : numbers) {
		    System.out.println(num);
		}
		
	//----------------------------------------------------------------------------------------//
		//Jump statements- break, continue
		// break
		System.out.println("Break statement stoping iteration when 5");
		for (int j = 0; j <= 10; j++) {
			System.out.println(j);
			if(j==5) {
				break;
			}
			
		}
	
		// continue
		System.out.println("Continue statement stoping iteration till 5");
		for (int j = 0; j <= 10; j++) {
			
			if(j<=5) {
				continue;
			}
			System.out.println(j);
		}
	}

}
