package packageone;

import java.util.HashMap;
import java.util.Map;

public class TestScOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "abbcedddeef";
		
		char[] arr = test.toCharArray();
		String str = "";
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		for(int i=0; i<arr.length;i++) {
			//int count = 0;
			char c = arr[i];
			if(map.containsKey(c)) {
			    str += c;
			//	map.put(c, 1);
				//System.out.println(c);
			}
			else {
				map.put(c,1);
			}
			//else {
			//	map.put(c,1);
		//	}
		}
		
		System.out.println(str);
	}

}
