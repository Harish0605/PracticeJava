import java.util.Random;

public class generaterandomdigit_string {

	public static void main(String[] args) {
		int n = 123;
		Random rd = new Random();
		System.out.println(rd.nextInt(n)); //upperlimit is n
		System.out.println(rd.nextInt()); 
		String s ="harish";
		s=s+rd.nextInt(n);
		System.out.println(s);
		
	}

}
