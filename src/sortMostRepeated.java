import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class sortMostRepeated {

	public static void main(String[] args) {
//		int[] arr = { 3, 7, 6, 1, 1, 7, 7, 1, 6, 1 }; 
		int[] a = { 2, 1, 4, 1, 3, 4, 5, 1, 1, 3, 4, 4, 4, 3, 4 };

		/*
		 * Output: [1, 1, 1, 1, 7, 7, 7, 6, 6, 3] [4, 4, 4, 4, 4, 4, 1, 1, 1, 1, 3, 3,
		 * 3, 2, 2]
		 */

		// int[] a = { 3, 7, 6, 1, 1, 7, 7, 1, 6, 1 };
		Map<Integer, Integer> m = new HashMap<Integer, Integer>();
		for (int i = 0; i < a.length; i++) {
			if (!m.containsKey(a[i])) {
				m.put(a[i], 1);
			} else {
				m.put(a[i], m.get(a[i]) + 1);
			}
		}

		List<Integer> li = new ArrayList<Integer>();
		List<Integer> op = new ArrayList<Integer>();
		for (Map.Entry<Integer, Integer> map : m.entrySet()) {
			li.add(map.getValue());
		}
		Collections.sort(li);
		Collections.reverse(li);

		for (int k : li) {
			for (Map.Entry<Integer, Integer> map : m.entrySet()) {
				if (map.getValue() == k) {
					while (k != 0) {
						op.add(map.getKey());
						k--;
					}
				}
			}
		}
		System.out.println(op.toString());
	}

}
