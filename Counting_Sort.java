import java.util.*;

public class Counting_Sort {
	public static void Counting(int a[],int n) {
		int count[] = new int[10];
		int b[] = new int[n];
		
		for(int i=0;i<n;i++) {
			++count[a[i]];
		}
		
		for(int i=1; i<=n;i++) { //Update Count array
			
			
			count[i] += count[i-1];
		}
		
		for(int i=n-1; i>=0;i--) {
			b[--count[a[i]]]= a[i];
		}
		
		for(int i : b) {
			System.out.print(" "+i);
		}
		
	}
	
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Total number : ");
	int n = sc.nextInt();
	int a[] = new int[n];
	for(int i=0;i<n;i++) {
		a[i] = sc.nextInt();	}

Counting(a,n);
}
}
