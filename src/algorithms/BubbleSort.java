package algorithms;

/* Notes:
 * passes = elements-1
 * Here n-1 is number of passes
 * n-1-i is for comparisons
 * flag concept is for swapping, if no swapping then array is sorted 
 */

public class BubbleSort {

	public static int[] sortBubble(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			int flag = 0;
			for (int j = 0; j < a.length - 1 - i; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
					flag = 1;
				}
			}
			if (flag == 0)
				break;
		}
		return a;
	}

	public static void main(String[] args) {
		int[] a = { 15, 16, 6, 8, 5 };
		int[] b = { 16, 14, 5, 6, 8 };
		int[] op = sortBubble(a);
		for (int i = 0; i < op.length; i++) {
			System.out.println(op[i]);
		}
		System.out.println("*********");
		int[] op2 = sortBubble(b);
		for (int i = 0; i < op2.length; i++) {
			System.out.println(op2[i]);
		}

	}

}
