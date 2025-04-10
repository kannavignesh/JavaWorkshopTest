package week2.day1;

public class MyPhone {

	public static void main(String[] args) {
		//WE can not create object for interface
		//AndroidDesign phone = new AndroidDesign();
		
		SamsungClass phone = new SamsungClass();
		
		//or
		// interface name object = new class name()
		
		AndroidDesign phone2 = new SamsungClass();
		

	}

}
