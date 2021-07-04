package thiss;

public class Employee  
{  
    int id,age;   
    String name, address, gender;  
    public Employee (int age)  
    {  
        this.age = age;  
    }  
    public Employee(int id, int age)  
    {  
        this(age);  
        this.id = id;  
    }  
    public Employee(int id, int age, String name, String address)  
    {  
        this(id, age);  
        this.name = name;   
        this.address = address;   
    }  
    public Employee(int id, int age, String name, String address, String gender)  
    {  
        this(id, age, name , address);
        this.gender = gender;
  
    } 
    public static void main (String args[])  
    {  
        Employee emp = new Employee(105, 22, "Vikas", "Delhi", "Male");  
        System.out.println("ID: "+emp.id+" Name:"+emp.name+" age:"+emp.age+" address: "+emp.address + emp.gender);  
    }  
      
    
}