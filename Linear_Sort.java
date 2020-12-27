import java.util.Scanner;

public class Linear_Sort {

	public static void  search(int a[],int n, int item){
		
		boolean t = false;
		
		  for(int i=0; i<n;i++) {
			  if(a[i] == item) {
				  System.out.println(" Element Found");
				  t = true;
				  break;
			  }
			  
		  }
		  if(t == false) {
			  System.out.println("Element not Found");
		  }
		
	  }
	
	public static void main(String[] args) {
		long start = System.currentTimeMillis(); //start counting 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Total number of Element:");
		int n = sc.nextInt();
		int a[] = new int[n];
		
		for(int i=0; i<n;i++) {  //take element from user
			a[i] = sc.nextInt();
		}
		
		System.out.println("Enter Element you want to search:");
		int n1 = sc.nextInt();
		search(a,n,n1);
		
       long end = System.currentTimeMillis(); //end counting
       
       System.out.println("Total Time : "+(end-start)/1000 +" second");
	}

}
