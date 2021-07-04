package inheritence;

public class Key {

	public static void main(String[] args) {
	
	Bicycle bc = new Bicycle(3, 40, 25);
	Bike b = new Bike(4, 100 , " haris bike");
	System.out.println("brand name : " + Vehicle.Brand);
	System.out.println(b.info());
	System.out.println(bc.info());

	}


}
