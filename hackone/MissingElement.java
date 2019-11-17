package hackone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class MissingElement {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//int[] arr= new arr;
		//System.out.println("missing " + getMissing(a));
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));				//2, 5 , 1 2 3 4 5
		int N = Integer.parseInt(br.readLine());
		
		while(N-- > 0) {
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		
		StringTokenizer str = new StringTokenizer(br.readLine(), " ");
		for(int i=0; i<n-1;i++) {
			arr[i]=Integer.parseInt(str.nextToken());
		 }
		System.out.println(getMissing(arr,n));
		}
		//System.out.println(arr[2]);
		
		
		
	}

	 static int getMissing(int[] a, int incsize) {
		// TODO Auto-generated method stub
		 
		 int size=a.length -1;
		 System.out.println("length" + size);
		 Arrays.sort(a);
		 System.out.println("inclength" + incsize);
		 System.out.println("size" + size);
		 int intrnal_sum=0;
		 int first_element=a[0];
		 int last_elemet=a[size];
		 int sum_natural = incsize * (incsize+1) /2;
		 System.out.println("natural" + sum_natural);
		 
		 
		 //int sum = first_element + last_elemet;
		 for(int i=0;i<size;i++) {
			 intrnal_sum = intrnal_sum + a[i];
		 }
		 /*System.out.println("internal" + intrnal_sum);
		 System.out.println("first"+first_element);
		 System.out.println("last" + last_elemet);*/
		 /*if(size==2) {
			 return last_elemet + 1;
		 }
		 else {*/
			 return sum_natural-intrnal_sum;
		 //}
	}

}
