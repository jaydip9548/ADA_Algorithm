import java.util.*;

public class Shell_Sort {
	
	public static void Sort(int a[],int n) {
	
		int gap = n;
		int j=0;
		int temp=0;
		while((gap/=2 )>0) {
			
		for(j=gap;j<n;j++) {
			for(int i=j-gap; i>=0;i=i-gap) {
				if(a[i] < a[i+gap]) {
					break;
				}
				else {
					temp = a[i];
					a[i] = a[i+gap];
					a[i+gap] = temp;
				}
			}
		}
		}
	for(int i : a) {
			System.out.print(" "+i);
		}
		
	}
	
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Number You Want to Insert:");
	int n = sc.nextInt();
	int a[] = new int [n];
	for(int i=0; i<n;i++) {
		a[i] = sc.nextInt();
	}
	
	Sort(a,n);
	
	
}
}
