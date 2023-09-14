import java.util.LinkedHashMap;
import java.util.Map;

public class longestSubStringWithoutRepeating {
	
	public static void lengthOfLongestSubString(String s) {
		String longSubstr = null;
		int longestSubStrlength = 0;
		Map<Character,Integer> map = new LinkedHashMap<>();
		for(int i=0;i<s.length();i++) {
			if(!map.containsKey(s.charAt(i))) {
				map.put(s.charAt(i), i);
				
			}else {
				i=map.get(s.charAt(i));
				map.clear();
			}
			if(map.size()>longestSubStrlength) {
				longestSubStrlength = map.size();
				longSubstr = map.keySet().toString();
			}
		}
		System.out.println(longSubstr);
		System.out.println(longestSubStrlength);
	}

	public static void main(String[] args) {
		String s = "ABDEFGABEF";
		lengthOfLongestSubString(s);

	}

}
