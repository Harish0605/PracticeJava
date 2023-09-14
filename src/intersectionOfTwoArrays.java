import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class intersectionOfTwoArrays {
	public static void checkIntersection(int[] a, int[] b) {
		List<Integer> li = new ArrayList<>();
		for (int i = 0; i < a.length; i++) {
			li.add(a[i]);
		}
		for (int j = 0; j < b.length; j++) {
			li.add(b[j]);
		}
		Map<Integer, Integer> map = new LinkedHashMap<>();
		for (int k : li) {
			if (!map.containsKey(k)) {
				map.put(k, 1);
			} else {
				map.put(k, map.get(k) + 1);
			}
		}
		List<Integer> op = new ArrayList<>();
		for (Map.Entry<Integer, Integer> m : map.entrySet()) {
			if (m.getValue() == 2) {
				op.add(m.getKey());
			}
		}
		System.out.println(op);
	}

	public static void main(String[] args) {
		int[] x = { 3, 4, 6, 2, 8, 5, 9 };
		int[] y = { 6, 3, 2, 7, 5, 1 };
		int[] z = { 3, 4, 6, 7, 10, 12, 5 };
		int[] w = { 7, 11, 18, 15, 12 };
		int[] a = { 3, 4, 6, 10, 5 };
		int[] b = { 7, 11, 18, 15, 12 };
		checkIntersection(x, y);
		checkIntersection(z, w);

	}

}
