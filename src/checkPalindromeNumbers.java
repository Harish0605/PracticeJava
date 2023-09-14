import java.util.Scanner;

//Program to check palindrome numbers
public class checkPalindromeNumbers {
	
	public static int checkInput(int n) {
		int sum =0;
		while(n!=0) {
			int rem = n%10;
			sum = sum * 10 + rem;
			n = n / 10;
		}
				
		return sum;
	}

	public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the Number");
    int input = scan.nextInt();
    int output = checkInput(input);
    if(input == output) {
    	System.out.println("Palindrome Number");
    }else {
    	System.out.println("Not a Palindrome Number");
    }

	}

}
