package java07_SuperKeyword;

public class BMW extends Car{
	
	private int min_speed = 200;
	
	
	public void speedCal() {
		System.out.println(min_speed);
		int carSpeed = super.min_speed;
		int diff = min_speed - carSpeed;
		System.out.println(diff);
	}
	
	public BMW() {
		super("BMW X1", 40);
		System.out.println("=======BMW const...===========");
	}
	
	
	public BMW(int price) {
		super("Audi", 50); 
		System.out.println("=======BMW const...===========");
	}
	
	
//	If you want to supply a values to the parent class constructor we can call parent 
//	class constructor. We can call default const and parameterized const. 
//	
//	Can we call two constructors back to back?
//  No
	
	

}
