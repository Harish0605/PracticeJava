package algorithms;

public class BinarySearch {

	public static void binarySearch(int arr[], int first, int last, int key) {
		int mid = (first + last) / 2;
		while (first <= last) {
			if (arr[mid] < key) {
				first = mid + 1;
			} else if (arr[mid] == key) {
				System.out.println("Element is found at index: " + mid);
				break;
			} else {
				last = mid - 1;
			}
			mid = (first + last) / 2;
		}
		if (first > last) {
			System.out.println("Element is not found!");
			
		}
	}

	public static void main(String[] args) {
		int[] arr = { 5, 9, 17, 23, 25, 45, 59, 63, 71, 89 };
		int key = 69;
		int first = 0;
		int last = arr.length - 1;
		binarySearch(arr, first, last, key);

	}
}
