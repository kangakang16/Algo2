import java.util.*;


public class c0505_1932 {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int [][]tri= new int [n][n];
		
		int [][]dp= new int [n][n];
		
		
		for(int i =0; i<n; i++) {
			for(int j=0; j<=i; j++) {
				tri[i][j]=sc.nextInt();
			}
		}
		
		dp[0][0]=tri[0][0];
		
		for(int i =1; i<n; i++) {
			for(int j=0; j<=i; j++) {
				if(j==0) { //왼쪽 끝인 경우
					dp[i][j]=dp[i-1][j]+tri[i][j];
				}
				else if(j==i) { //오른쪽 끝인 경우
					dp[i][j]=dp[i-1][j-1]+tri[i][j];
				}
				
				else {
					dp[i][j]=tri[i][j]+Math.max(dp[i-1][j-1],dp[i-1][j]);
				}
				
				
			}
		}
		
		int maxSum=0;
		
		for(int i =0; i<n;i++) {
			
			maxSum=Math.max(maxSum, dp[n-1][i]);
		}
	
		System.out.println(maxSum);
	}

}
