import java.util.*;
public class nCr {
           
	public static int Answer(int n,int k) {
		
		if(k==n) {
			return 1;
		}
		else if(k == 1) {
			return n;
		}
		else {
			return (Answer(n-1,k) + Answer(n-1,k-1));
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N and  K :");
		int n = sc.nextInt();
		int k = sc.nextInt();
		
	int ans = 	Answer(n,k);
	System.out.println(ans);
		
		
	}
}

//nCr = (n-1)C k  + (n-1) C (k-1)
//if(k==n) ---> 1 else if(k=1) --> n