package duplicateJavaPrograms;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		int n = 153;
		int temp = n;
		int sum = 0;
		
    for(; n>0; n=n/10) {
    	int rem = n%10;
    	sum = sum + rem*rem*rem;
    }
    
    if(temp == sum) {
    	System.out.println("It is a armstrong number");
    }else {
    	System.out.println("It is not a armstrong number");
    }
    
	}

}
