package javaPrograms;

public class WAP39_CountOfUpperCase {

	public static void main(String[] args) {
		
		String text = "He did an Excellent job";
		int count = 0;
		for(int i=0; i<text.length(); i++) {
			
			char ch = text.charAt(i);
			
			if(ch>='A' && ch<='Z') {
				count++;
			}
		}
		
		System.out.println(count);

	}

}
