import java.util.Scanner;

public class primeNumbers {

	public static int checkPrime(int n) {
		int output = 0;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				output = 0;
				break;
			} else {
				output = n;
			}
		}

		return output;

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the range");
		int range = scan.nextInt();
		for (int i = 2; i < range; i++) {
			int prime = checkPrime(i);
			if (prime != 0) {
				System.out.println(prime);
			}
		}
		System.out.println("**********************************");
		System.out.println("Enter the count of prime numbers");
		int max = scan.nextInt();
		int count = 0;
		int i = 2;
		while (count != max) {
			int prime = checkPrime(i);
			if (prime != 0) {
				System.out.println(prime);
				count++;
			}
			i++;
		}
	}

}
