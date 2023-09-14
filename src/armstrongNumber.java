
public class armstrongNumber {
	
	public static boolean armstrong(int n) {
		int temp = n;
		boolean value = false;
		int sum = 0;
		while(n != 0) {
			int rem = n % 10;
			sum = sum + (rem * rem * rem);
			n = n / 10;
		}
		if( sum == temp) {
			value = true;
		}
		else {
			value = false;
		}
		return value;
		
	}

	public static void main(String[] args) {
		System.out.println(armstrong(371));

	}

}
