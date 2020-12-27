import java.util.*;
public class LCS {

	public static void findLCS(char a[], char b[]) {
		int[][] ans = new int[a.length + 1][b.length + 1];

		for (int i = 1; i < ans.length; i++) {
			for (int j = 1; j < ans[i].length; j++) {

				if (a[i - 1] == b[j - 1]) {
					ans[i][j] = 1 + ans[i - 1][j - 1];
				} else {
					ans[i][j] = Math.max(ans[i - 1][j], ans[i][j - 1]);
				}

			}
		}
		System.out.println("The Maximum length of LCS  is :" + ans[a.length][b.length]);

	}
	public static void main(String[] args) {
		double start = System.currentTimeMillis();
		
		String s2 = "abbacdcba";
		char[]a = s2.toCharArray();
		
		String s1 = "bcdbbacaac";
		char []b = s1.toCharArray();
		
		findLCS(a,b);
		double end = System.currentTimeMillis();
		System.out.println("Total Time : "+(end - start)+"  ms");
	}

}
