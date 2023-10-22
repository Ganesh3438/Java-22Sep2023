package java01_constructor;

public class EmployeeTest {

	// Note: When you don't create a constructor a hidden constructor will be created

	String name;
	int age;
	float salary;

	// Custom constructor
	public EmployeeTest(String name) {
		this.name= name;
	}
	
	public EmployeeTest(String name, int age) {
		this.name= name;
		this.age = age;
	}
	
	public EmployeeTest(String name, int age, float sal) {
		this.name= name;
		this.age = age;
		salary = sal;
	}
	
	

	public static void main(String[] args) {

		// Note: We don't have constructor but we are calling the object what will be
		// the o/p?
		// It will be blank. Internally it will hidden/default constructor

		// Note: If you have your own/custom constructors then default constructor will
		// be not called.

		// Calling single parameter constructor
		EmployeeTest obj = new EmployeeTest("Mohan");
		System.out.println(obj.name);
		System.out.println(obj.age);
		System.out.println(obj.salary);
		
		System.out.println();
		
		// Calling two parameter constructor
		EmployeeTest obj1 = new EmployeeTest("Mohan", 26);
		System.out.println(obj1.name);
		System.out.println(obj1.age);
		System.out.println(obj1.salary);
		
		System.out.println();
		
		// Calling two parameter constructor
		EmployeeTest obj2 = new EmployeeTest("Mohan", 26, 220000000);
		System.out.println(obj2.name);
		System.out.println(obj2.age);
		System.out.println(obj2.salary);
				
		
		
		
		
	}

}
