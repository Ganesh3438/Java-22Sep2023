package java06_thisKeyword;

public class Employee {
	
	String name;
	int age;
	String city;
	
	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Employee(String name, int age, String city) {
		this.name = name;
		this.age = age;
		this.city = city;
	}
	
	public Employee(String name) {
		this("Naveen", 26, "Banglore" );
		this.name = name;
	}

}
