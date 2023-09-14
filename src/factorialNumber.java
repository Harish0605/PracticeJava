
public class factorialNumber {

	public static int printFactorial(int n) {
		int sum = 1;
		while (n != 0) {
			sum = sum * n;
			n--;
		}

		return sum;
	}

	public static void main(String[] args) {
		System.out.println(printFactorial(4));

	}

}
