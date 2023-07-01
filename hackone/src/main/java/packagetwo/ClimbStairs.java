package packagetwo;

public class ClimbStairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		
		int numberOfWays = calClimb(n);
		System.out.println(numberOfWays);
		
		int dpWays = calClimbDp(n);
		System.out.println(dpWays);
	}
	
	static int calClimb(int n) {
		
		if(n<2) {
			return 1;
		}
		
		int result = calClimb(n-1) + calClimb(n-2);  //1,1,1,1 -- 1,2,1 -- 1,1,2 -- 2,1,1
		
		return result;
	}
	
	static int calClimbDp(int n) {
		int[] dp = new int[n+1];
		
		dp[0] = 1;
		dp[1] = 1;
		for(int i=2;i<=n;i++) { //1,1,2,3,     //3-> 1,2;1,1,1;2,1
			dp[i] = dp[i-1] + dp[i-2];
		}
		
		return dp[n];
	}
	
	

}
