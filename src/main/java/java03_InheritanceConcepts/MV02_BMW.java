package java03_InheritanceConcepts;

public class MV02_BMW extends MV01_Car{
	
// Method Overriding: means when you have a method in parent class and the same 
// method in child class with the same name with the same number of parameters
// and with the same sequence of parameters.
// We can call as Runtime polymorphism or dynamic polymorphism.
	
	@Override
	public void start() {
		System.out.println("Start method from BMW class");
	}
	
	public void autoParking() {
		System.out.println("AutoParking method is from BMW class");
	}
	
	@Override
	public void petrolEngine() {
		System.out.println("PetrolEngine method from BMW class");
	}

}
