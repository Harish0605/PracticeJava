
public class largest_Smallest_Array {

	public static void main(String[] args) {
		int[] a = { 3, 7, 1, 2, 8, 4 };
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}
		}
		int largest = a[a.length-1];
		int smallest = a[0];
		System.out.println(largest+" and "+smallest);

	}

}
