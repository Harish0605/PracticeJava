package algorithms;

/*
 * Notes:
 * Here we know 2 loops - one for incremental till length of array and second for decremental in Sorted Sublist
 * take first element as sorted by default and start loop from 1 not 0
 * take a[i] = temp and j=i-1;
 * j>=0 and a[j] > temp
 * if yes then shift right a[j+1] = a[j] and j--;
 * if not then a[j+1]=temp;
 */

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {5,4,10,1,6,2};
		for(int i=1;i<a.length;i++) {
			int temp = a[i];
			int j=i-1;
			while(j>=0 && a[j]>temp) {
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=temp;
		}
		for(int k=0;k<a.length;k++) {
			System.out.println(a[k]);
		}

	}

}
