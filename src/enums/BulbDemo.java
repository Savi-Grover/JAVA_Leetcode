package enums;

//Enums restrict a variable to have one of the few predefined values.

class Bulb {
	
	//Enums
	enum BulbSize{ SMALL, MEDIUM, LARGE }
	BulbSize size;              //var size is of type enum
	//Other bulb class fields and methods.
	}


public class BulbDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bulb b = new Bulb();  //b is instance of class bulb
		b.size = Bulb.BulbSize.MEDIUM ;  //var state=classname.enum
		System.out.println("Bulb Size :" + b.size);

	}

}
