package java01_constructor;

public class Employee {

	String name;
	int age;
	float salary;

	public Employee() {
		System.out.println("default constructor");
	}
	
	public Employee(int i) {  // const with single parameter
		System.out.println("Constructor with single parameter: "+ i );
	}
	
	public Employee(String s, int i) {   // const with two parameter
		System.out.println("Constructor with two parameter: "+ s +" "+ i );
	}

	public static void main(String[] args) {

//1. Constructor name is as same as the class name
//2. Cannot have return value/void.
//3. constructor will be called when you create the object
//4. What is constructor? To restrict the unnecessary object creations. 

		//Employee obj = new Employee();
	    
//		obj.name = "Tom";
//	    obj.age = 26;
//	    obj.salary = 22000000;
	    
	    
	    // Calling single parameter constructor
	    //Employee obj1 = new Employee(10);  // o/p: default const and single param
	    
	 // Calling two parameter constructor
	    Employee obj2 = new Employee("Mohan", 26); // o/p: default const and two para will be called
	    
	    
	    
	}

}
