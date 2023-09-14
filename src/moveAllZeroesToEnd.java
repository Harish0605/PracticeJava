
public class moveAllZeroesToEnd {

	public static void moveAllZeroes(int[] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
                  if(a[i]==0 && a[j]!=0) {
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
		int arr[] = {1, 2, 0, 4, 3, 0, 5, 0};
		moveAllZeroes(arr);
		System.out.println("***********");
		int brr[]  = {1, 2, 0, 0, 0, 3, 6};
		moveAllZeroes(brr);

	}

}
