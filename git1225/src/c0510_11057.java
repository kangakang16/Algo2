import java.util.*;


public class c0510_11057 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		long [][] dp = new long [N+1][10];
		
		
		for (int i =0; i<10; i++) {
			dp[1][i]=1;
		}
		
		for (int i =2; i<N+1;i++) {
			
			for (int j=0; j<10;j++) {
				for(int k=0; k<=j ;k++) {
					dp[i][j]+=dp[i-1][k];
				}
				dp[i][j]%=10007;
				
				
			}
			
		}
		
		long result=0;
		for(int i =0; i<10;i++) {
			
			result+=dp[N][i];
		}

		System.out.println(result);
	}

}
