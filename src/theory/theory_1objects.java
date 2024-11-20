package theory;

//OBJ, CLASS, VARIABLES, FUNCTIONS, ENCAPSULATION

public class theory_1objects {
	
	//data or variable or states
	static boolean isOn=false;
			
    //function or beviour
	public static void turnOn() {
	isOn = true;
	System.out.println("Bulb is ON");
			}
	
	public static void turnOff() {
	isOn = false;
	System.out.println("Bulb is OFF");
			}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		// object= entity with state & behaviour ( ie variable & properties/functions  )
		// software obj are like real world obj- ex- baby; car; dog - where states= cry,happy,sleep ; behviour= feed, play
		// data-encapsulation = ability of objecs to hide states or data but perform functions /actions.
		
		
		//class= prototype of object
		//obj= instance of class
		
		
		//runnnng function here for encapsulation
		turnOn();
		
		turnOff();

		
	}

}
