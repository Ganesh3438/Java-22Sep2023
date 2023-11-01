package javaPrograms;

import java.util.HashMap;
import java.util.Map;

public class WAP44_StringOccurence {

	public static void main(String[] args) {
		
		String name = "Java is powerful langauge";
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		
		for(int i=0; i<name.length(); i++) {
			char ch = name.charAt(i);
			Integer count = map.get(ch);
			if(count == null) {
				map.put(ch, 1);
			}else {
				count = count + 1;
				map.put(ch, count);
				
			}
		}
		
         System.out.println(map);
	}

}
