import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class sortArrayRemoveDuplicates {

	public static void main(String[] args) {
		int[] a = { 2, 1, 3, 4, 2, 4, 5, 6, 7, 8, 4 };
		List<Integer> li = new ArrayList<Integer>();
		TreeMap<Integer, Integer> tmap = new TreeMap<>();
		for (int i = 0; i < a.length; i++) {
			if (!tmap.containsKey(a[i])) {
				tmap.put(a[i], 1);
			} else {
				tmap.put(a[i], tmap.get(a[i]) + 1);
			}
		}
		
		for (Map.Entry<Integer, Integer> map : tmap.entrySet()) {
			if (map.getValue() == 1) {
                li.add(map.getKey());
			}
		}
		System.out.println(li.toString());
	}

}
