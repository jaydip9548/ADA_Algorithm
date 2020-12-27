
public class Multiplication {

	public static int Metrix_chain(int p[],int i,int j) {
		
		if (i == j) 
		{
			return 0;
		}
  
        int min = Integer.MAX_VALUE; 
  
        // place parenthesis at different places between first 
        // and last matrix, recursively calculate count of 
        // multiplications for each parenthesis placement and 
        // return the minimum count 
        for (int k = i; k < j; k++) { 
            int count = Metrix_chain(p, i, k) +  
                        Metrix_chain(p, k + 1, j) +  
                        p[i - 1] * p[k] * p[j]; 
  
            if (count < min) 
                min = count; 
        } 
        return min;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int d[] = {3,223,4,2,5};
int n = d.length;

int count = Metrix_chain(d,1,n-1);
System.out.println(count);
	}

}
