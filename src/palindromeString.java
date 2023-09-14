
public class palindromeString {
	public static void palindromeCheck(String s) {
		String temp = "";
		for(int i=s.length()-1;i>=0;i--) {
			temp=temp+s.charAt(i);
		}
		if(temp.equals(s)) {
			System.out.println("Palindrome String");
		}else {
			System.out.println("Not Palindrome");
		}
	}

	public static void main(String[] args) {
		String s1 = "bod";
		String s2 = "madam";
		palindromeCheck(s1);
		palindromeCheck(s2);
		

	}

}
