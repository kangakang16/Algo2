import java.util.Arrays;
import java.util.Scanner;

public class c0414_2437 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int C [] = new int [N];
		
		
		for (int i =0; i < N; i++) {
			
			C[i]=sc.nextInt();
			
		}
		
		Arrays.sort(C);

		int result=0;
		
		for (int i =0; i<N; i++) {
			
			if((result+1)<C[i]) { //다음에 오는 수가 만약 잴 수 있는 최대값 +1보다 클 때
				
				result++;
				
			
				break;
			}
		
			result+=C[i];
			
		}
		
		System.out.println(result);
	}

}
