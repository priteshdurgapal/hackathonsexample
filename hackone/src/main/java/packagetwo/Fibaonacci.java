package packagetwo;

public class Fibaonacci {
	
	static int n=4;
	static int[] mem = new int[100];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		//int n = 50;
		int a = 0, b=1;
		//int c = 0;
		//for n series
		for(int i=0 ; i<n; i++) {
			
			//System.out.print( a + ",");
		   int c = a +b;
			a=b;
			b=c;
			
		}
		
		// for upto nth number
		int a1 = 0, b1=1;
		for(int i=0 ; i<n; i++) {
			if(a1<n) {
			//System.out.print( a1 + ",");
			int c = a1 +b1;
			a1=b1;
			b1=c;
			}
			
		}
		//using recursion
		for(int i = 0; i<n; i++) {
		//	System.out.println(fib(i) + ",");
		}
		
		//using memoization
		//int[] mem = new int[n+1];
		for(int i=0;i<mem.length;i++) {
			mem[i] = -1;
		}
		
		for(int i = 0; i<n; i++) {
			System.out.println(fib2(i) + ",");
		}
		
		System.out.println(fib(n));
	}
	
	static long fib(long n) {
		
		if(n==0 || n==1) {
			return n;
		}
		else {
			return fib(n-1) + fib(n-2);
		}
	}

	static int fib2(int n) {
		
		if(mem[n]==-1) {
			int res;
		
		if(n==0 || n==1) {
			res = n;
		}
		else {
			res =  fib2(n-1) + fib2(n-2);
		}
		mem[n] = res;
		}
		return mem[n];
	}
}
