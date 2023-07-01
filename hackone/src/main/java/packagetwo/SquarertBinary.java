package packagetwo;

public class SquarertBinary {

	public static int sqrt(int beg, int last, int num) {
		int temp = num;
		while(beg<=last) {
			int mid = beg + (last-beg)/2;
			if(mid*mid==mid) {
				return mid;
			}
			else if(mid*mid>num) {
				last = mid-1;
			}
			else {
				 temp = mid;
				beg = mid +1;
			}
		}
		return temp;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=100;
		int sqrt = sqrt(1,n,n);
		System.out.println(sqrt);
	}

}
