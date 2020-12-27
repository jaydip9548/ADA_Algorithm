import java.util.Arrays;

public class KMP {

	//This Program is not Working For Worst Case
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "AAAAAAAAAAAAAAAAAB";
		char[] str = str1.toCharArray();

		// Patten Must be contain repeated Character
		String patten = "AAAAB";
		char ptn[] = patten.toCharArray();

		int[] pi = new int[ptn.length];

		Arrays.fill(pi, -1);

		for (int i = 1; i < ptn.length; i++) {
			int j = i - 1;
			while (j >= 0) {
				if (ptn[j] == ptn[i]) {
					pi[i] = j;
					break;
				}
				j--;
			}
		}

		int j = -1;
		for (int i = 0; i < str.length; i++) {

			if (str[i] == ptn[j + 1]) {

				j++;
				if (j == ptn.length - 1) {
					System.out.println("Present is available");
					System.out.println("Starting From " + (i - (ptn.length - 1)));
					break;
				}

			} else {
				if (j < 0) {
					j = pi[j + 1];
				} else {
					j = pi[j];
				}

			}

		}

	}

}
