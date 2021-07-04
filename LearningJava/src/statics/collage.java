package statics;

public class collage {
	
	static String CollageName = "Standford";
	int id;
	String name;
	
	public collage(int i, String n) {
		id = i;
		name = n;
	}
	
	static void CollageChange(){
		CollageName = "Harvord";
	}
	
	 static void method(){
		 System.out.println(" static method");
	 }
	public void display(){
		System.out.println("id is " + id + " and name is " + name + "and collage name is " + CollageName);
	}
 
	static {
		System.out.println(" I am the first to excute");
	}

	public static void main(String[] args) {
		System.out.println("Main");
		collage c = new collage(1, "hari");
		c.display();
		collage.CollageChange();
		c.display();
		collage.method();

	}

}
