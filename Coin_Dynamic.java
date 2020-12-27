import java.util.Arrays;

public class Coin_Dynamic {

	public static void coinChange(int[] coins, int amount) {
		if (amount == 0) {
			return;
		}
		int i = coins.length - 1;
		System.out.println("Required coins are : ");
		while (i >= 0) {
			if (amount >= coins[i]) {
				amount -= coins[i];
				System.out.println(" " + coins[i]);
			} else {
				i--;
			}
		}
	}

	public static void main(String[] args) {
		double start = System.currentTimeMillis();
		int a[] = {  2, 5, 10 };
		int n = 20;
		coinChange(a, n);
		double end = System.currentTimeMillis();

		System.out.println("Total Times :" + (end - start) + " MilliSec");
	}
}
