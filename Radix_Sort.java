import java.util.Arrays;
import java.util.Scanner;

public class Radix_Sort {
	public static void Radix(int a[],int n) {
		int max = findMax(a);
		for(int pos=1; max/pos > 0;pos*=10) {
			Counting(a,a.length,pos);
		}
		
		for(int i: a) {
			System.out.println(i);
		}
	}
	public static void Counting(int a[],int n,int pos) {
		int count[] = new int[10];
		int b[] = new int[n];
		
		Arrays.fill(count, 0);
		
		 for (int i = 0; i < n; i++) {
	            ++count[ (a[i]/pos)%10 ];}
		 
		for(int i=1; i<count.length;i++) {
			count[i] += count[i-1];
		}
		
		
		
		for(int i=n-1; i>=0;i--) {
			 b[count[ (a[i]/pos)%10 ] - 1] = a[i]; 
	            count[ (a[i]/pos)%10 ]--;
			
		}
	
	
		
		for(int i=0; i<n;i++) {
			a[i] = b[i];
			//System.out.print(" "+a[i]);
		}
		
	
		
		
		
	}
	
	public static int findMax(int a[]) {
		int max=a[0];
		for(int i=1; i<a.length;i++) {
			if(max < a[i]) {
				max = a[i];
			}
		}
		return max;
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Number You Want to Insert:");
	int n = sc.nextInt();
	int a[] = new int [n];
	for(int i=0; i<n;i++) {
		a[i] = sc.nextInt();
	}
	
	Radix(a,n);
}
}
