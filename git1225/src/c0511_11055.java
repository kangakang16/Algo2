import java.util.*;

public class c0511_11055 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int N =sc.nextInt();
		
		int [] arr= new int [N+1];
		int [] dp= new int [N+1];
		
		for ( int i =1; i<=N;i++) {
			arr[i]=sc.nextInt();
		}
		

		dp[1]=arr[1];

		for (int i =1; i<=N;i++) {
			dp[i]=arr[i]; //1. 오답나왔던 부분
			for( int j=1;j<i; j++) {
				if(arr[i]>arr[j]) {//탐색하는 수가 증가 수열에 충족할때
					dp[i]=Math.max(dp[i], dp[j]+arr[i]);
					// 현재 i의 dp 배열에 큰 수를 집어넣음
					// 여기서 dp[j]들과 비교한 가장 큰수
					// 그 수열들보다 내 수가 크면 내 수가 들어감
					// 내 수열이 되는 애들 중에서 가장 큰게 채택됨
					
					
					// 가장 큰 실수 
					
					// 이전까지의 갱신 했던 dp i들을 무시하고 arr i 와 비교했음
					
				}
				
			}
			
		}
		
		int max=0;
		for(int i=0; i<=N;i++) {
			max=Math.max(max, dp[i]);
		}
		System.out.println(max);
	}

}
