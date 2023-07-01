package packageone;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
	
	
	public static void main(String args[]) {
		long startTime = System.nanoTime();
		String A = "23A84Q";
		String B = "K2Q25J";
		//String[] arr = A.split("");
		//String ref="TJQKA";
		
		
		
		// sol = new Solution();
		int result = solution(A,B);
		System.out.println(result); //a k q j t
		/*for(int i=0; i<A.length();i++) {
			if(Integer.parseInt(A)
		}*/
		
		long endTime = System.nanoTime();
		long timeElapsed = endTime-startTime;
		System.out.println("time elapsed" + timeElapsed);
	}
	
	public static int solution(String A, String B) throws NumberFormatException {
		
		//String ref="AKQJT98765432";
		/*final int a = 14;
		final int k = 13;
		final int q = 12;
		final int j = 11;
		final int t = 10;
		
		/*String regx = "^[AQKJT2-9]";
		Pattern r = Pattern.compile(regx);
		Matcher matcher = r.matcher(A);
		boolean isMatched = matcher.matches();
		System.out.println(isMatched);*/
		int round = 0;
		int[] pOne = new int[A.length()];
		int[] pTwo = new int[B.length()];
		
				for(int i=0;i<A.length();i++) {
					
					if(A.charAt(i)=='A'||B.charAt(i)=='A') {
						pOne[i] = 14;
						pTwo[i] = 14;
						
					}
					
					else
						if(A.charAt(i)=='K' || B.charAt(i)=='K') {
							pOne[i] = 13;
							pTwo[i] = 13;
							
						}
						else
							if(A.charAt(i)=='Q' || B.charAt(i)=='Q') {
								pOne[i] = 12;
								pTwo[i] = 12;
								
							}
							else
								if(A.charAt(i)=='J' || B.charAt(i)=='J') {
									pOne[i] = 11;
									pTwo[i] = 11;
									
								}
							else
								if(A.charAt(i)=='T'|| B.charAt(i)=='T') {
									pOne[i] = 10;
									pTwo[i] = 10;
									
								}
								else {
									pOne[i]=  Integer.parseInt(Character.toString(A.charAt(i)));
									pTwo[i]=  Integer.parseInt(Character.toString(B.charAt(i)));
								}
					
				}
				
				
				for(int jj=0;jj<pOne.length;jj++) {
					System.out.println(pOne[jj]);	
					System.out.println("===");
					System.out.println(pTwo[jj]);
					if(pOne[jj]>pTwo[jj]) {
						round++;
					}
					}
				if(A.length()==B.length() ) {
					return round;
				}
				else
					return 0;
		
	}

}

