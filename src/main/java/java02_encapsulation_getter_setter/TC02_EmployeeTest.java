package java02_encapsulation_getter_setter;

public class TC02_EmployeeTest {

	public static void main(String[] args) {
		
		TC01_Employee e1 = new TC01_Employee();
		e1.setName("Bharagav");
		e1.setAge(26);
		e1.setSalary(220000000);
		e1.setCity("Vizag");
		
		String name = e1.getName();
		int age = e1.getAge();
		double sal = e1.getSalary();
		String city = e1.getCity();
		System.out.println(name + " " + age +" "+sal + " "+ city);

	}

}
