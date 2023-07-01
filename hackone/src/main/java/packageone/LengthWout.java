package packageone;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.print.attribute.HashAttributeSet;

public class LengthWout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//find length without any inbuilt function
		String s = "Pritesh";
		int len = 0;
		for(char c:s.toCharArray()) {
			len++;
		}
		System.out.println(len);
	
	int number = 17;
	boolean flag = false;
	boolean sflag = false;
	for(int i=0;i<=number/2;i++) {
		if(number%2==0) {
			flag = true;
		}
	}
	if(!flag) {
		System.out.println("prime");
	}
	else {
		System.out.println("not prime");
	}
	//palindrome
	String spalin = "nursesrun";
	int mid=spalin.length()/2;
	System.out.println(mid);
	for(int i=0;i<=mid;i++) {
		if(spalin.charAt(i)==spalin.charAt(spalin.length()-i-1)) {
			sflag=true;
		}
	}
	if(!sflag) {
		System.out.println("not palindrome");
	}
	else {
		System.out.println("palindrome");
	}
	//remove duplicates from array
	int[] arrdup = {1,2,1,3,4,5,6,3};
	Map<Integer,Integer> mp = new HashMap<Integer,Integer>();
	/*Set<Integer> arrset = new HashSet<Integer>();
	for(int i:arrdup) {
		arrset.add(i);
	}
	System.out.println(arrset);*/
	int palincheck = 121;
	int temp = palincheck;
	int rem = 0;
	int revnumber = 0;
	while(palincheck!=0) {
		rem = palincheck % 10;
		revnumber = revnumber*10 + rem;
		palincheck = palincheck/10;
		
	}
	if(revnumber==temp) {
		System.out.println("plaindrome");
	}
	else {
		System.out.println("not plaindrome");
	}
	
	
}
}
