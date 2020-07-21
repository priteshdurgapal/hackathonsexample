package packageone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Duplicate {
	
	
		public static void main(String[] args) throws IOException {
			boolean flag = true;
			BufferedReader br= new BufferedReader(new InputStreamReader(System.in));				//2, 5 , 1 2 3 4 5
			int N = Integer.parseInt(br.readLine());
			while(N >= 1 && N<=200) {
			int n = Integer.parseInt(br.readLine());
			//System.out.println(n);
			if(n>=1 && n<= (10^7))
			{
			int[] arr = new int[n];
			
			StringTokenizer str = new StringTokenizer(br.readLine(), " ");
			while(str.hasMoreTokens()) {
			for(int i=0; i<n-1;i++) {
				arr[i]=Integer.parseInt(str.nextToken());
				if(arr[i]<=1 && arr[i]>=(10^7)) {
					flag=false;
				}
			 }
			}
			if(flag==true)
			System.out.println(getMissing(arr,n));
			N--;
			}
			}

			
	//1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 31 32 33 34 35 36 37 38 39 40 41 42		
			
		}

		 static int getMissing(int[] a, int incsize) { 
			 int intrnal_sum =0;
			 int sum_natural = (incsize * (incsize+1) )/2;
			 for(int i=0;i<incsize;i++) {
				 intrnal_sum = intrnal_sum + a[i];
			 }
				 return sum_natural-intrnal_sum;
			
		}

	}



