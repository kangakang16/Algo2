import java.util.*;

public class c0507_1912 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int [ ] arr= new int [N];
		int [ ] dp= new int [N];
		
		

		dp[0]=arr[0];
		for (int i = 1; i<N; i++) {
			
			arr[i]=sc.nextInt();
			
		}
		
		int max=0;
		for(int i =1; i<N; i++) {
			
			dp[i]=(Math.max(dp[i-1]+arr[i],arr[i]));
			
			
			max=Math.max(dp[i], max);
		}
		
		System.out.println(max);
		
	}

}
