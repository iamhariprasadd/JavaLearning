package inheritence;

public class Bike extends Vehicle{
	
	String name;

	public Bike(int gear, int speed, String name) {
		super(gear, speed);
		this.name = name;
	}
	
	public String info(){
		return (super.info() + " , the name of the bike is " + name);
	}

}
