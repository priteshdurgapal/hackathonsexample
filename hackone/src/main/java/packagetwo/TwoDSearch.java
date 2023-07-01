package packagetwo;

public class TwoDSearch {
	
	public static void main(String[] args) {

	int[][] arr= { {1,4,7,11,15},
			       {2,5,8,12,19},
			       {3,6,9,16,22},
			       {10,13,14,17,24},
			       {18,21,23,26,30} };
	int target = 99;
	
	int row = 0;
	int col = arr[0].length-1;
	boolean result = false;
	
	while(row<arr.length && col>=0) {
		if(arr[row][col]==target) {
			result = true;
			break;
		}
		else if (arr[row][col]<target){
			row++;
		}
		else {
			col--;
		}
	}
	
	System.out.println(result);
	
}
}
