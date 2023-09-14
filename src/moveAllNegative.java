
public class moveAllNegative {

	public static void moveAllNegatives(int[] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
                  if(a[i]>0 && a[j]<0) {
                	  int temp = a[j];
                	  a[j] = a[i];
                	  a[i] = temp;
                  }
			}
		}
		for(int k=0;k<a.length;k++) {
			System.out.println(a[k]);
		}
	}

	public static void main(String[] args) {
		int arr[] = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
		moveAllNegatives(arr);
		

	}


}
