package theory;
/*
 * Objects define their interface as the interaction with the outside world. For example, in the bulb
case switch is the interface between you and the bulb. You press the button turn on and the bulb
start glowing.


interfsce provides skelton of a class. to use an interfcae , we need to inplmenet to a class, we can override methods 7 veriables of interfcae
 */
public interface theory_9InterfacesBulb {
	public void turnOn();
	public void turnOff();
	public boolean isOnFun();
}

class Bulb implements theory_9InterfacesBulb {
	private boolean isOn=false;
		@Override
		public void turnOn() {
		isOn = true;
	}
		@Override
		public void turnOff() {
		isOn = false;
		}
		
		@Override
		public boolean isOnFun() {
		return isOn;
	}
}
	/*public class BulbDemo {
			public static void main(String[] args) {
			Bulb b = new Bulb();
			System.out.println("bulb is on return : " + b.isOnFun());
			b.turnOn();
			System.out.println("bulb is on return : " + b.isOnFun());
			}*/


