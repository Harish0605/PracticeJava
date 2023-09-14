import java.util.LinkedHashMap;
import java.util.Map;

public class duplicateWordsInAString {

	public static void main(String[] args) {
		String s = "my name is my name is name harish";
		LinkedHashMap<String,Integer> hmap = new LinkedHashMap<>();
		String[] arr = s.split(" ");
		for(String k : arr) {
			if(!hmap.containsKey(k)) {
				hmap.put(k,1);
			}else {
				hmap.put(k, hmap.get(k)+1);
			}
		}
		//System.out.println(hmap.toString());
		for(Map.Entry<String, Integer> map : hmap.entrySet()) {
			if(map.getValue()!=1) {
				System.out.println(map.getKey()+" is repeated "+map.getValue());
			}
		}

	}

}
