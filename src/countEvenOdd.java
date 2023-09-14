
public class countEvenOdd {

	public static void countDigits(int n) {
		int countEven = 0;
		int countOdd = 0;
		while (n != 0) {
			int r = n % 10;
			if (r % 2 == 0) {
				countEven++;
			} else {
				countOdd++;
			}
			n = n / 10;
		}
		System.out.println("The even digits are : " + countEven);
		System.out.println("The odd digits are : " + countOdd);
	}

	public static void main(String[] args) {
		countDigits(123);
		countDigits(111110111);
		countDigits(123456789);

	}

}
