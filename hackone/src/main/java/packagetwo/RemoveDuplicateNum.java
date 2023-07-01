package packagetwo;

public class RemoveDuplicateNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {4,4,5,5,6,6,7,7,8,9,9,9};
		removeMethodOne(arr);
		removeMethodTwo(arr);

	}
	
	static void removeMethodTwo(int[] arr) {
		//int[] temp = new int[arr.length];
		//temp[0] = arr[0];
		//int newidx = 0;
		int newtemp = arr[0]; 
		int N = arr.length;
		for(int i=1;i<N;i++) {
			if(newtemp!=arr[i]) {
				temp[newidx] = arr[i];
				newtemp=arr[i];
				
			}
			
		}
		
		for(int i=0;i<newidx;i++) {
			System.out.println(temp[i]);
		}
		
	}
	
	static void removeMethodOne(int[] arr) {
		int[] temp = new int[arr.length];
		temp[0] = arr[0];
		int newidx = 0;
		int newtemp = arr[0]; 
		int N = arr.length;
		for(int i=1;i<N;i++) {
			if(newtemp!=arr[i]) {
				newidx+=1;
				temp[newidx] = arr[i];
				newtemp=arr[i];
				
			}
			
		}
		
		for(int i=0;i<newidx;i++) {
			System.out.println(temp[i]);
		}
		
	}

}
