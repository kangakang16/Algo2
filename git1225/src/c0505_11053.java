import java.util.*;


public class c0505_11053 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int arr[]= new int [N];
		int dp[]= new int [N];
		
		for (int i =0; i<N; i++) {
			
			arr[i]=sc.nextInt();
		}
		for( int i =0; i<N; i++) {
			dp[i]=1; //기본값을 1로 할당하여 0으로 배정되지 않은 수를 배정하기 위함
	
			for(int j=0; j<i;j++) {
				
				if(arr[j]<arr[i]&&dp[i]<dp[j]+1) { //뒤에 나오는 수가 크고, dp배열에서 0일 경우
					dp[i]=dp[j]+1;
				}
			}
			
		}
		
	
		int max=-1;
		
		for( int i =0; i<N; i++) {
			
			max=Math.max(max, dp[i]);
		}
		
		System.out.println(max);

	}

}
