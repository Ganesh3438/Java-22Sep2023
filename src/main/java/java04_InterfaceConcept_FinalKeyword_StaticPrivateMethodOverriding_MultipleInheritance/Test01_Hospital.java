package java04_InterfaceConcept_FinalKeyword_StaticPrivateMethodOverriding_MultipleInheritance;

public class Test01_Hospital {

	public static void main(String[] args) {
		
		FortisHospial fh = new FortisHospial();
		
		fh.cardioService();
		fh.dentalService();
		fh.emergencyService();
		fh.pediaServices();
		fh.neuroService();
		fh.medicalClaim();
		fh.medicalTraining();
		
		fh.medicalRD();
		
// top casting means child class object can be referred by parent interface ref variable.
		Interface01_USMedical us = new FortisHospial();
		us.physioService();
		us.dentalService();
		us.cardioService();
		us.emergencyService();
		
		
		

	}

}
