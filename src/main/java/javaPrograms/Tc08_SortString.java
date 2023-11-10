package javaPrograms;

public class Tc08_SortString {

	public static void main(String[] args) {
		
		
		String name = "ganesh";
		char[] ch = name.toCharArray();
		
		
		for(int i=0; i<ch.length; i++) {
			for(int j=i+1; j<ch.length; j++) {
				char temp = 0;
				if(ch[i]> ch[j]) {
					temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;
				}
				
			}
			System.out.println(ch[i]);
			
		}
	    
		
	}

}
