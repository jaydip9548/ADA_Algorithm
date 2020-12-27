import java.util.*;

class CRC {
	public static void main(String sap[]) {
		Scanner sc = new Scanner(System.in);
		int i, j, flag = 0;

		// string input of dividend...
		System.out.print("\nEnter dividend: ");
		String dividend = sc.next();

		// string input for divisor...
		System.out.print("\nEnter divisor: ");
		String divisor = sc.next();

		// length of dividend and divisor...
		int dividend_length = dividend.length();
		int divisor_length = divisor.length();

		// array for dividend, divisor and send _array...
		int dividend_array[] = new int[dividend_length + divisor_length - 1];
		int send_arr[] = new int[dividend_length + divisor_length - 1];
		int divisor_array[] = new int[divisor_length];

		// loading dividend values into dividend array...
		for (i = 0; i < dividend_length; i++) {
			dividend_array[i] = Integer.parseInt("" + dividend.charAt(i));
			send_arr[i] = dividend_array[i];
		}

		// padding '0' to dividend array...
		for (i = dividend_length; i < dividend_array.length; i++) {
			dividend_array[i] = 0;
		}

		// loading divisor values into divisor array...
		for (i = 0; i < divisor_length; i++) {
			divisor_array[i] = Integer.parseInt("" + divisor.charAt(i));
		}

		// temp array would hold temp dividend...
		int temp[] = new int[divisor_length];
		for (i = 0; i < dividend_array.length; i++) {
			/*
			 * it would work only for '1' and for '0' it would do nothing just increment the
			 * index...
			 */
			if (dividend_array[i] == 1) {
				// loading temp dividend to temp array...
				for (j = 0; j < divisor_length; j++) {
					if (i + j > dividend_array.length - 1) {
						// flag = 1 dividend < divisor
						flag = 1;
						break;
					} else {
						temp[j] = dividend_array[i + j];
					}
				}

				// flag = 0 means divison is possible...
				if (flag == 0) {
					for (j = 0; j < divisor_length; j++) {
						if (temp[j] == divisor_array[j]) {
							dividend_array[i + j] = 0;
						} else {
							dividend_array[i + j] = 1;
						}
					}
				}
			}
		}

		// loading send_arr with value generated...
		for (i = dividend_length; i < dividend_array.length; i++) {
			send_arr[i] = dividend_array[i];
		}

		// displaying message to be transmitted...
		System.out.print("\nMessage to be transmitted is: ");
		for (i = 0; i < send_arr.length; i++) {
			System.out.print(send_arr[i]);
		}
	}
}