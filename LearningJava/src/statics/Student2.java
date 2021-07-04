package statics;

public class Student2 {
	//Java static property is shared to all objects.

	static String collage = "Standford"; // static
	int id;
	String name;
	

	public Student2(int i, String n) {
		id = i;
		name = n;
	}
	
	public void displ() {
		System.out.println( id + " " + name + " " + collage );
	}

	public static void main(String[] args) {
		System.out.println("Main method");
		
		Student2 s1 = new Student2(1, " Hari");
		Student2 s2 = new Student2(3, " Prasad");
		
		s1.displ();
		s1.id = 2;
		s1.displ();
		s2.displ();
		Student2.collage = "harvad"; // static can be overwritten
		
		s1.displ();
		s1.id = 2;
		s1.displ();
		s2.displ();
		

		
		
	}

}
