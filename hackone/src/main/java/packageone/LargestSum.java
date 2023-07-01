package packageone;

public class LargestSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {15,14,7,1,3,9,10,11};
		int a_max = arr[0];
		int a_minmax = arr[0];
		int a_min = arr[0];
		for(int i=1;i<arr.length;i++) {
			if(a_max<arr[i]) {
				a_max=arr[i];
			}
			
			if(arr[i]<a_max && a_minmax<arr[i]) {
				a_minmax=arr[i];
				
			}
			
			if(a_min>arr[i]) {
				a_min=arr[i];
			}
		}
		System.out.println(a_max + "-" +a_minmax + "-"+a_min);
		System.out.println(a_max +a_minmax);
		

	}

}
