
public class sortNamesInArray {

	public static void main(String[] args) {
		String a[] = {"Sourabh","Anoop", "Harsh", "Alok", "Tanuj"};
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if(a[i].compareTo(a[j]) > 1) {
					String temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
				
			}
		}
		for(String m : a) {
			System.out.println(m);
		}

	}
}
