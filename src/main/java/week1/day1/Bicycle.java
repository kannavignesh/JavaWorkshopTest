package week1.day1;

public class Bicycle {
	public String getCycleColor(String color) {
		return color;
	}
	/*
	 * public void isPuncture(boolean tyreCheck) { if(tyreCheck) {
	 * System.out.println("Tyre is puncture"); }else {
	 * System.out.println("Tyre is not puncture"); } }
	 */
	public boolean isPuncture() {
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bicycle bike1 =new Bicycle();
		String cycleColor = bike1.getCycleColor("Red and Silver"); 
		System.out.println(cycleColor);
		 boolean puncture = bike1.isPuncture();
		System.out.println(puncture);
	}

}
