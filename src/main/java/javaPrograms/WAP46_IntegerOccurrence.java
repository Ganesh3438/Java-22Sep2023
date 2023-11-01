package javaPrograms;

import java.util.HashMap;
import java.util.Map;

public class WAP46_IntegerOccurrence {

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 2, 2,1,9};
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i=0; i<arr.length; i++) {
			
			Integer count = map.get(arr[i]);
			if(count==null) {
				map.put(arr[i], 1);
			}else {
				count = count + 1;
				map.put(arr[i], count);
			}
		}
        System.out.println(map);
	}

}
