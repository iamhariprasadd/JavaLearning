/**
 * 
 */
package constructors;

/**
 * @author hariprasadd
 *
 */
public class Student {

	/**
	 *  declaring variables , trying to display its default values , as the purpose 
	 *  of the constructor is to provide the default values to the object like
	 *   0, null, etc., depending on the type.
	 */
	
	int id;
	String name;
	
   void Display() {
   System.out.println(id + " " + name);
}
	 
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println(" Main method " );
		Student s = new Student(); // creating objects
		s.Display();

	}

}
