package inheritence;

public class Vehicle {
	
	static String Brand = "Boss";
	public int gear;
	public int speed;

	public Vehicle(int gear,int speed) {
		this.gear = gear;
		this.speed = speed;
	}
	
	public void speedup(int increase){
		speed =+increase;
		
	}
	public void applybreak(int decrease){
		speed =-decrease;
		
	}
	
	public String info(){
		return ("Brand name is  :: " + Vehicle.Brand +  ", No. of gears are " + gear + " , Speed of the vehicle " + speed);
		
	}


}
