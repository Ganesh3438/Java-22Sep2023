package duplicateJavaPrograms;

public class TC01_CheckNumberIsPrime {

	public static void main(String[] args) {
		
		int number = 13;
		int count = 0;
		for(int i=1; i<=number; i++) {
			if(number%i==0) {
				count++;
			}
		}

		if(count==2) {
			System.out.println("It is a prime number");
		}else {
			System.out.println("It is not a prime number");
		}
		
	}

}
