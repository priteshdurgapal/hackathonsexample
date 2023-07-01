package packageone;

public class SubContiguous {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {-2, -3, 4, -1, -2, 1, 5, -3};
		System.out.println("sum of max subcontiguous array" + getSum(a));

	}

	 static int getSum(int[] a) {
		// TODO Auto-generated method stub
		 
		 int size=a.length;
		 int max_so_far = 0;
		 int max_here = 0;
		 for (int i = 0; i < size; i++) {
			
			 max_here = max_here + a[i];
			 if(max_here < 0)
				 max_here = 0;
			 else if(max_so_far < max_here)
				 max_so_far = max_here;
		}
		return max_so_far;
	}

}
