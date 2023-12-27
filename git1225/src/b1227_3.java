import java.util.Scanner;

public class b1227_3 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int N  = sc.nextInt(); //10
		int K  = sc.nextInt(); //4200
		
		int [] coin = new int [N];
 		
		int result =0;
		for(int i = 0; i<N; i++) {
			coin[i] = sc.nextInt(); //5~50000
		}

		for(int j=N-1; 0<=j; j--) {

			if(K>=coin[j]) {
				
				result+=(K/coin[j]); // 나누게 된 수를 누적
				K%=coin[j]; // 동전 수를 뺴고 남은 잔액을 계속 포문
			}
		}
		
		System.out.println(result);
	}

}
