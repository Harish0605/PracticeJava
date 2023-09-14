
public class printFirstCharacter {

	public static void main(String[] args) {
		String s = "geeks for geeks";
		String op = "";
		String[] arr = s.split(" ");
		for (int i = 0; i < arr.length; i++) {
			op = op + arr[i].charAt(0);
		}
		System.out.println(op);
	}

}
