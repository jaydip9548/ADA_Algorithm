import java.util.Scanner;

class U_Knapsack_Greedy {
	public static void main(String[] args) {
		double start = System.currentTimeMillis();
		int object, m;

		object = 7;
		int profit[] = { 5, 10, 15, 7, 8, 9, 4 };
		int weight[] = { 1, 3, 5, 4, 1, 3, 2 };
		m = 15;

		double p_w[] = new double[object];

		for (int i = 0; i < object; i++) {
			p_w[i] = (double) profit[i] / (double) weight[i];
		}

		for (int i = 0; i < object - 1; i++) {
			for (int j = i + 1; j < object; j++) {
				if (p_w[i] < p_w[j]) {
					double temp = p_w[j];
					p_w[j] = p_w[i];
					p_w[i] = temp;
					int temp1 = profit[j];
					profit[j] = profit[i];
					profit[i] = temp1;
					int temp2 = weight[j];
					weight[j] = weight[i];
					weight[i] = temp2;
				}
			}
		}
		System.out.println("");
		System.out.println("-------------------");
		System.out.println("--After Arranging--");
		System.out.print("-------------------");
		System.out.println("");
		System.out.print("Objects");
		for (int i = 1; i <= object; i++) {
			System.out.print(i + "    ");
		}
		System.out.println();
		System.out.print("Profit ");
		for (int i = 0; i < object; i++) {
			System.out.print(profit[i] + "    ");
		}
		System.out.println();
		System.out.print("Weight ");
		for (int i = 0; i < object; i++) {
			System.out.print(weight[i] + "    ");
		}
		System.out.println();
		System.out.print("P/W    ");
		for (int i = 0; i < object; i++) {
			System.out.print(p_w[i] + "  ");
		}
		int k = 0;
		double sum = 0;
		System.out.println();
		while (m > 0) {
			if (weight[k] < m) {
				sum += 1 * profit[k];
				m = m - weight[k];
			} else {
				double x4 = m * profit[k];
				double x5 = weight[k];
				double x6 = x4 / x5;
				sum = sum + x6;
				m = 0;
			}
			k++;
		}
		System.out.println("------------------------------------");
		System.out.println("Final Profit is=" + sum);
		double end = System.currentTimeMillis();
		System.out.println("Total Time : " + (end - start) + "  ms");
	}
}