package hackone;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class MinAndMax {


    public static void main(String args[]) throws IOException{

BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

//2
//4 5 3 7 8 
//5 38 79 53 41 36
//output:
//3 8 11
//36 79 115
int N=Integer.parseInt(br.readLine());

while(N-->0){
   // int n = Integer.parseInt(br.readLine());
  
   StringTokenizer str=new StringTokenizer(br.readLine()," ");
   //System.out.println(
   int size=str.countTokens();
   int[] arr=new int[size];
   System.out.println("size"+size);
   for(int i=0;i< size;i++) {
	   arr[i]=Integer.parseInt(str.nextToken());
   }
   int min=arr[0];
   int max=arr[0];
   for(int i=0;i< size;i++) {
	   System.out.println(arr[i]);
   }
   for(int i=1;i<arr.length;i++) {
	   if(min>arr[i]) {
		   min=arr[i];
	   }
	   if(max<arr[i]) {
		   max=arr[i];
	   }
   }
   System.out.println(min+" "+max+" "+ (min+max));

}

    }

    
}