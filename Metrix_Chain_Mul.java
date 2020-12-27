
public class Metrix_Chain_Mul {

	public static int findMul(int d1[], int i, int j) {
		if (i == j) {
			return 0;
		}
		int min = Integer.MAX_VALUE;

		for (int k = i; k < j; k++) {
			int count = findMul(d1, i, k) + findMul(d1, k + 1, j) + d1[i - 1] * d1[k] * d1[j];
			if (count < min) {
				min = count;
			}
		}
		return min;
	}

	public static void main(String[] args) {
		double start = System.currentTimeMillis();

		int d1[] = { 3, 2, 4, 2, 5 };

		int n = d1.length;
		int min = findMul(d1, 1, n - 1);
		System.out.println("THe Minimum Required Multiplication is : " + min);

		double end = System.currentTimeMillis();
		System.out.println("Total Time :" + (end - start) + " ms");
	}
}
