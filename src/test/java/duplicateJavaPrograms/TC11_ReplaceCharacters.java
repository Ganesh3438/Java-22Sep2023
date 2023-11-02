package duplicateJavaPrograms;

public class TC11_ReplaceCharacters {

	public static void main(String[] args) {
		
		String name = "Apple";
		String temp = "";
		for(int i=0; i<name.length(); i++) {
			char ch = name.charAt(i);
			if(ch=='p') {
				temp = temp + '$';
			}else {
				temp = temp + ch;
			}
		}
		
		System.out.println(temp);
       
	}

}
