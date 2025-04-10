package week2.day1;

public abstract class SmartTv implements AndroidTvDesign{

	
	public void changeChannel() {
		
	}

	
	public boolean changeVolume() {
		return false;
	}
	
	
	// abstract class do not need to implement all the methods from an interface
	// here we have implemented two methods from the interface.
	// abstract class can have abstract methods without implementation.
	// can have implementations of methods from interface and builtin method implementations
	
	public abstract void enableWifi();
	
	public void enableBluetooth() {
		
	}

}
