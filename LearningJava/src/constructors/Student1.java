package constructors;

// default , parameterised and overloading constructor

public class Student1 {
	
	int id;
	String name;
	int age;
	  String collage =  "DBIT";


	public Student1(int i, String n) {
	 id = i;
	 name = n;
	 int age;
	 
	}
	
	public Student1() {
	}
	
	public Student1(int i, String n, int a) {
		 id = i;
		 name = n;
		  age = a;
		  

		}
	
	

	void Display(){
		System.out.println( id + "   " + name + " " + age);
		System.out.println( id + "   " + name + " " + age + " " + collage);

		
	}

	public static void main(String[] args) {

		
		System.out.println("In main method");
		// creating the object
		Student1 s = new Student1(1, "name1");
		Student1 s1 = new Student1(2, "name2");
		Student1 s2 = new Student1();
		
		
		Student1 s3 = new Student1(3,"name3",25);
		
		s2 = s3;
		s.Display();
		s1.Display();
		s2.Display();
		s3.Display();
		
		

	}

}
