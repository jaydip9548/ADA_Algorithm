
public class Insertion_Sort {

	public static void sort(int arr[]) {
		int n = arr.length;
		int key = 0;
		int j = 0;

		for (int i = 1; i < n; i++) {
			key = arr[i];
			j = i - 1;
			while (j >= 0 && key < arr[j]) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;
		}

		for (int i : arr) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		int arr[] = { 8, 7, 6, 5, 4, 3, 2, 1 };

		sort(arr);
	}
}
