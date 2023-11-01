package javaPrograms;

import java.util.HashMap;
import java.util.Map;

public class WAP45_FindOccurenceOfSentence {

	public static void main(String[] args) {
		
		String name = "Hi Hi how are !!! hi you Hi Hi";
		String[] words = name.split(" ");
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		for(int i=0; i<words.length; i++) {
			    Integer count = map.get(words[i]);
			    if(count == null) {
			    	map.put(words[i], 1);
			    }else {
			    	count = count + 1;
			    	map.put(words[i], count);
			    }
		}
   System.out.println(map);
	}

}
