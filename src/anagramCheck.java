import java.util.HashMap;
import java.util.Map;

public class anagramCheck {

	public static boolean checkAnagram(String s, String m) {
		boolean status = false;
		Map<Character, Integer> map1 = new HashMap<>();
		Map<Character, Integer> map2 = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			if (!map1.containsKey(s.charAt(i))) {
				map1.put(s.charAt(i), 1);
			} else {
				map1.put(s.charAt(i), map1.get(s.charAt(i)) + 1);
			}
		}
		for (int i = 0; i < m.length(); i++) {
			if (!map2.containsKey(m.charAt(i))) {
				map2.put(m.charAt(i), 1);
			} else {
				map2.put(m.charAt(i), map2.get(m.charAt(i)) + 1);
			}
		}
		if (map1.equals(map2)) {
			status = true;
		} else {
			status = false;
		}
		return status;
	}

	public static void main(String[] args) {
		String s1 = "listen";
		String s2 = "silent";
		String s3 = "gram";
		String s4 = "arm";
		System.out.println(checkAnagram(s1, s2));
		System.out.println(checkAnagram(s3, s4));

	}

}
