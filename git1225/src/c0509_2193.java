import java.util.*;

public class c0509_2193 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		long arr[] = new long [90+1];
		long dp[] = new long [90+1];
		dp[0]=1;
		dp[1]=1;
		arr[0]=1;
		arr[1]=1;
//		if(N>1) {
//			arr[2]=1;
//			arr[3]=2;
//			arr[4]=3;
//			dp[2]=2;
//			dp[3]=3;
//			dp[4]=5;
//		}	
		
	
		

		
		for (int i=2; i<=N; i++) {
			dp[i]=dp[i-2]+dp[i-1];
			arr[i]=dp[i]-dp[i-2];
		}
		
		System.out.println(arr[N]);

	}

}
