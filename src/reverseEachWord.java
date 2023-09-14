
public class reverseEachWord {

	public static String eachWordReverse(String s) {
		String temp = "";
		String[] a = s.split(" ");
		for (int i = 0; i < a.length; i++) {
			String samp = a[i];
			for (int j = samp.length() - 1; j >= 0; j--) {
				temp = temp + samp.charAt(j);
			}
			temp = temp + " ";
		}
		temp.trim();
		return temp;
	}

	public static void main(String[] args) {
		String s = "my name is khan";
		String k = "I am sonoo jaiswal";
		System.out.println(eachWordReverse(s));
		System.out.println(eachWordReverse(k));

	}

}
