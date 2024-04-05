import java.util.Arrays;
import java.util.Scanner;

public class c18310_0406 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();//4 집의 개수
		int [] home = new int [N];
		
		
		for (int i =0; i<N; i++) {
			
			home[i]=sc.nextInt();
		}
		
		Arrays.sort(home);// 정렬
		// 중위값 구하기
		
		if(N%2==0) { //짝수 일때
			System.out.println(home[(N/2-1)]); //배열은 0부터 시작하므로 주의
		}
		
		else {// 홀수 일때
			System.out.println(home[(N/2)]);
		}
		
		
	}

}
