package duplicateJavaPrograms;

import java.util.HashSet;
import java.util.Set;

public class TC12_RemoveDuplicateInAString {

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
	}

}
