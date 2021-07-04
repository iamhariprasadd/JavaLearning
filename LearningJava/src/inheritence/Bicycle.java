package inheritence;

public class Bicycle extends Vehicle {
	
	public int seatHeight;

	public Bicycle(int gear, int speed, int seatHeight) {
	 super(gear,speed);
	 this.seatHeight = seatHeight;
	}
	
	public void setHeight(int newValue){
		seatHeight = newValue;
		
	}
	
	@Override
	public String info(){
		return(super.info() + "\n seatHeight is " + seatHeight);
	}

}
