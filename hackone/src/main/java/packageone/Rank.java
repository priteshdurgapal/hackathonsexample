package packageone;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

public class Rank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ranks = {3,4,3,0,2,2,3,0,0};
		//int[] ranks = {4,4,3,3,1,0};
		//int[] ranks = {4,2,0};
		Rank r = new Rank();
		System.out.println(r.solution(ranks));

	}

	 public int solution(int[] ranks) {
		 
		 int rank = 0;
		 
		 Map<Integer,Integer> mp = new TreeMap<Integer,Integer>();
		// mp.put(13, 5555);
		 
		 for(Integer i:ranks) {
			 if(mp.containsKey(i)) {
				 mp.put(i, mp.get(i)+1);
			 }
			 else {
				 mp.put(i,1);
			 }
		 }
		 int[] keyss = new int[mp.size()];
		 int i=0;
		 for(Map.Entry<Integer, Integer> m : mp.entrySet()) {
				//System.out.println(m.getKey() +"-" + m.getValue());
				keyss[i++]=m.getKey();
				
			}
		 for(int k=0;k<keyss.length-1;k++) {
			//System.out.println(keyss[k]);
			//System.out.println(keyss[k]-keyss[k+1]);
			 if(keyss[k]-keyss[k+1]==-1) {
				//System.out.println("====="+mp.get(keyss[k]));
				rank = rank + mp.get(keyss[k]);
			 }
		 }
		
		
		 
		
	 
		 return rank;
		 
	 }
}

