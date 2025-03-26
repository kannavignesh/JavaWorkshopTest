package week1.day1;

public class Methods {
	/*
	 * Method Signature:
	 * 1. Acess Modifier
	 * 2. return type
	 * method name
	 * Input arguments
	 * 
	 * 1. Access Modefiers: 
	 * Public: Anyone can access.
	 * Private: Only menbers of the class can access.
	 * Protected: Accessed by same package and inherited class.
	 * Default: Only classes that are from same package.
	 * 
	 * 2.Return type:(Can be only one type)
	 * Primitive data type or non-primitive data type(Class) or void(no return)
	 * 
	 * 3. Name of the method:
	 * Meaningfull-> Start with lowercase and then Uppercase firstletter
	 * 
	 * 4.Input Arguement(Zero to more) Best practice: not more than three
	 * Number of input
	 * Datatype
	 * 
	 * example:
	 * 
	 *Switch on or off
	 *public void switchOnOff(boolean bOff){
	 *logic
	 *if(bOff == true){
	 *syso(" off")
	 *}else{
	 *syso("on")
	 *}
	 *}
	 * 
	 */
	//Switch on or off
	 public void switchOnOff(boolean bOff){
	 //logic
	 if(bOff == true){
	 System.out.println(" off");
	 }else{
	 System.out.println("on");
	 }
	 }
	 
	 public String getPhoneBrand(String phoneType) {
		 if(phoneType.equals("Android") ) {
			 return "One Pluse 7Pro";
		 }
		 else
			 return "iPhone 6S";
	 }

     
     private short getBatteryPercentage() {
    	 return 45;
     }
     //Entry
     public static void main(String[] args) {
    	 //calling methods
    	 //Step 1-> Create a object of the class
    	 // ClassName ref = new ClassNAme();
        Methods phone = new Methods();
        //Calling using that reference
        //Step2-> ref.methodname()
        phone.switchOnOff(false);
        int percentage = phone.getBatteryPercentage();
        System.out.println(percentage);
     }
}
     
