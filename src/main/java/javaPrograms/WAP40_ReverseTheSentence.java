package javaPrograms;

public class WAP40_ReverseTheSentence {

	public static void main(String[] args) {
		
		String name = "Powerful is java";
		String[] words = name.split(" ");
		String temp = "";
		
		for(int i=words.length-1; i>=0; i--) {
			
			if(i==0) {
				temp = temp + words[i];
			}else {
				temp = temp + words[i] + " ";
			}
		}
		

	}

}
