package duplicateJavaPrograms;

public class TC09_ReverseString {

	public static void main(String[] args) {
		
		String name = "Java";
		String temp = "";
		
		for(int i=name.length()-1; i>=0; i--) {
			char ch = name.charAt(i);
			temp = temp + ch;
		}

		System.out.println(temp);
	}

}
