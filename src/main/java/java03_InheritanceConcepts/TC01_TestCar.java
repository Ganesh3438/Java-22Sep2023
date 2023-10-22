package java03_InheritanceConcepts;

public class TC01_TestCar {

	public static void main(String[] args) {
		
// Note: start method is available in both MV01_Car class and MV02_BMW class but
//		start method will call from BMW class	
		
//		Scenario 1: Child class ref and child class obj will give us both parent 
//		and child properties
		MV02_BMW b = new MV02_BMW();
		b.start(); // Comes from BMW class
		b.stop(); // Inherits from car class
		b.refuel(); // Inherits from car class
		b.autoParking(); // Comes from BMW class
		
		b.engine(); // Inherited-Comes from vechile class
		
		System.out.println("----------Scenario 2-----------------------");
		
//		Scenario 2: Parent class ref and parent class obj will give us only parent
//		class properties
		MV01_Car a = new MV01_Car();
		a.start();
		a.stop();
		a.refuel();
		
		a.engine(); // Inherited-Comes from vechile class
		
		System.out.println("-----------Scenario 3-----------------------");
		
//		Scenario 3: Only parent class ref and child class obj
//		will give us only parent class properties
		MV01_Car ref = new MV02_BMW();
		ref.start(); // Coming from BMW class 
		ref.stop();
		
		ref.engine(); // Inherited-comes from vechile class
		
		System.out.println("------------Scenario 4-----------------------");
		
//		Scenario 4: parent class object can be referred by child class ref variable
//		MV02_BMW obj = MV01_Car();


	}

}
