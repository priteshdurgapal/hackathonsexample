package packageone;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        boolean result = false;
        char[] arr = A.toCharArray();
        int size = arr.length;
        if(A==null){
             result = false;
        } 
        if(A.length()==1) {
            result = true;
        }
        for(int i=0;i<arr.length/2;i++) {
        	
            if(arr[i]==arr[size-i-1]) {
                result = true;
            }
            else {
            	result = false;
            }
        }
        if(result) {
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        
    }
	

}
