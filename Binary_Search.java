import java.util.*;
public class Binary_Search {
	public static void search(int a[], int n,int item) {
		int mid=0,first=0,last=n-1;
		boolean t=false;
        while(first <= last) {
        	
        	mid = (first+last)/2 ;
        	
        	if(a[mid] == item) {
        		System.out.println(" Element Found");
        		t = true;
        		break;
        	}
        	else if(a[mid] < item) {
        		first = mid + 1;
        		
        	}
        	else if(a[mid] > item) {
        		last = mid - 1;
        	}
		}
		// System.out.println(mid-1);
		
 if(t == false) {
	 System.out.println("Element Not Found");
 }
}
	
public static void main(String[] args) {
	long start = System.currentTimeMillis();
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Total number of Element:");
	int n = sc.nextInt();
	int a[] = new int[n];
	for(int i=0; i<n;i++) {
		a[i] = sc.nextInt();
	}
	System.out.println("Enter Element you want to search:");
	int n1 = sc.nextInt();
	search(a,n,n1);
	
	long end = System.currentTimeMillis();
	
	System.out.println("Total time:"+ (end - start)/1000 +" Second");
}
}
