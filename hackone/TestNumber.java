package hackone;

	import java.io.BufferedReader;
	import java.io.InputStreamReader;
	import java.util.*;
	//import for Scanner and other utility classes


	// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

	class TestNumber {
	    public static void main(String args[] ) throws Exception {
	        /* Sample code to perform I/O:
	         * Use either of these methods for input*/

	        //BufferedReader
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        int N =Integer.parseInt( br.readLine());                // Reading input from STDIN
	       //System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
	       int temp=0;
	        /*Scanner
	        Scanner s = new Scanner(System.in);
	        String name = s.nextLine();                 // Reading input from STDIN
	        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
	        
	        //while(N-->0){
	            //int size = Integer.parseInt(br.readLine());
	            
	            String str = br.readLine();
	            //System.out.println(str);
	            String[] arr = str.split(" ");
	            System.out.println(arr[0]);
	           for(String bound: arr){
	               int num = Integer.parseInt(bound);
	               for(int i=1;i<=num;i++){
	                  if(i%3==0){
	                    System.out.println("Fizz");
	                }
	                else if(i%5==0){
	                     System.out.println("Buzz");
	                }
	                else
	                {
	                    System.out.println(i);
	                } 
	               }
	           }*/
	         //   System.out.println(arr[0]);
	       		
	       		String str = br.readLine();
	       		while(N-->0) {
	       		String[] arr = str.split(" ");
	            int arraycount = Integer.parseInt(arr[temp]);
	             //System.out.println(arraycount);
	             //System.out.println("temp" +temp);
	            for(int i=1;i<=arraycount;i++){
	                if(i%3==0 && i%5==0) {
	                	System.out.println("FizzBuzz");
	                }
	                else if(i%3==0){
	                    System.out.println("Fizz");
	                }
	                else if(i%5==0){
	                     System.out.println("Buzz");
	                }
	                else
	                {
	                    System.out.println(i);
	                }
	               
	            }
	            temp++;
	       		}
	       // }

	        

	    }
	}

