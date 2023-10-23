package java04_InterfaceConcept_FinalKeyword_StaticPrivateMethodOverriding_MultipleInheritance;

public class FortisHospial extends Medical implements Interface01_USMedical, Interface02_UKMedical, Interface03_IndianMedical {

	// Coming from US
	@Override
	public void physioService() {

		System.out.println("Fortis hospital ---- physioService");
	}

	@Override
	public void cardioService() {

		System.out.println("Fortis hospital ---- cardioService");
	}

	@Override
	public void dentalService() {

		System.out.println("Fortis hospital ---- dentalService");

	}

	// Coming from UK
	@Override
	public void neuroService() {

		System.out.println("Fortis hospital ---- neuroService");

	}

	@Override
	public void pediaServices() {

		System.out.println("Fortis hospital ---- pediaServices");

	}

	@Override
	public void oncologyService() {

		System.out.println("Fortis hospital ---- oncologyService");
	}

	@Override
	public void orthoService() {

		System.out.println("Fortis hospital ---- orthoService");

	}

	// Common in all three interfaces
	@Override
	public void emergencyService() {

		System.out.println("Fortis hospital ---- emergencyService");
	}

	// Individual method for fortis hospital
	public void medicalTraining() {

		System.out.println("Fortis hospital ---- medicalTraining");
	}

	public void medicalClaim() {

		System.out.println("Fortis hospital ---- medicalClaim");
	}

	@Override
	public void covidVaccination() {
		
		System.out.println("Fortis hospital ---- covidVaccination");
	}

}
