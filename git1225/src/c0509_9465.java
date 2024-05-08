import java.util.*;

public class c0509_9465 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int tc=sc.nextInt();
		
		for ( int i=0; i<tc; i++) {
			
			int N =sc.nextInt();
			
			int [][] arr= new int [2][N+1] ;
			int [][] dp= new int [2][N+1] ;
					
			for ( int j =0; j <=1; j++) {
				for ( int k =1; k <=N; k++) {
					arr[j][k]=sc.nextInt();	
				}
			}


			dp[0][1]=arr[0][1];
			dp[1][1]=arr[1][1];
			int result=Math.max(dp[0][1], dp[1][1]);
			
			for ( int j = 2; j<=N; j++) {
				dp[0][j]=Math.max(dp[1][j-1], dp[1][j-2])+arr[0][j];
				dp[1][j]=Math.max(dp[0][j-1], dp[0][j-2])+arr[1][j];
				result=Math.max(result, dp[0][j]);
				result=Math.max(result, dp[1][j]);
			}

			System.out.println(result);
			
		}
		
		
		
	}

}
