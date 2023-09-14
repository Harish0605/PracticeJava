
public class countDigits {

	public static int digitsCount(int num) {
		int sum = 0;
		while (num != 0) {
			int r = num % 10;
			sum = sum + r;
			num = num / 10;
		}

		return sum;
	}

	public static void main(String[] args) {
		
		System.out.println(digitsCount(454));
		System.out.println(digitsCount(1097));
		System.out.println(digitsCount(1123));

	}

}
