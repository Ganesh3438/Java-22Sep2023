package javaPrograms;

import java.util.HashSet;
import java.util.Set;

public class WAP43_RemoveDuplicatesInString {

	public static void main(String[] args) {

		String name = "Java";
		Set<Character> set = new HashSet<Character>();
		StringBuffer sb = new StringBuffer();

		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);

			if (!set.contains(ch)) {
				set.add(ch);
				sb.append(ch);
			}
		}
		System.out.println(sb);
		
//		for(int i=0; i<name.length(); i++) {
//			char ch = name.charAt(i);
//			char temp = ch;
//			int freq = 0;
//			for(int j=0; j<name.length(); j++) {
//				char ch1 = name.charAt(j);
//				if(temp == ch1 ) {
//					freq++;
//				}
//				
//				
//			}
//			
//		}
		
	}

}
