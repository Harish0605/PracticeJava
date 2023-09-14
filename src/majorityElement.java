
public class majorityElement {

	public static int checkMajority(int[] A) {
		int output = 0;
		int size = A.length;
		int max = size / 2;
		for (int i = 0; i < size; i++) {
			int count = 1;
			for (int j = i + 1; j < size; j++) {
				if (A[i] == A[j]) {
					count++;
				}
				if (count > max) {
					output = A[i];
				}

			}
		}

		return output;
	}

	public static void main(String[] args) {
		int A[] = { 3, 3, 4, 2, 4, 4, 2, 4, 4 };
		int B[] = { 3, 3, 4, 2, 4, 4, 2, 4 };
		System.out.println(checkMajority(A));
		System.out.println(checkMajority(B));

	}

}
