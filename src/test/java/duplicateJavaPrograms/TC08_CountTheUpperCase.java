package duplicateJavaPrograms;

public class TC08_CountTheUpperCase {

	public static void main(String[] args) {

		String name = "He did an Excellent job";
		int count = 0;
		
		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			if (ch >= 'A' && ch <= 'Z') {
				count++;
				System.out.println(ch);
			}
		}
		System.out.println(count);
	}

}
