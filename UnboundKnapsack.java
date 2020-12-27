
public class UnboundKnapsack {

	public static int findMaxProfit(int pr[], int wt[], int c) {

		if (pr.length == 0 || wt.length == 0 || c < 0) {
			System.out.println("Enter Valid Input");
		}
		int ans[][] = new int[wt.length][c + 1];

		for (int i = 0; i < wt.length; i++) {
			for (int j = 1; j <= c; j++) {
				int includingProfit = 0;
				int excludingProfit = 0;
				if (wt[i] <= j) {
					includingProfit = pr[i] + ans[i][j - wt[i]];
				}
				if (i > 0) {
					excludingProfit = ans[i - 1][j];
				}
				ans[i][j] = Math.max(includingProfit, excludingProfit);
			}
		}

		return ans[wt.length - 1][c];
	}

	public static void main(String[] args) {

		double start = System.currentTimeMillis();
		int wt[] = { 1, 3, 5, 4, 1, 3, 2 };
		int pr[] = { 5, 10, 15, 7, 8, 9, 4 };
		int totalCapacity = 8;
//will return maximum profit
		int max = findMaxProfit(pr, wt, totalCapacity);

		System.out.println("The Maximum Profit is : " + max);
		double end = System.currentTimeMillis();
//Total time required to execute 
		System.out.println("Total time is : " + (end - start) / 1000 + "Sec");
	}
}
