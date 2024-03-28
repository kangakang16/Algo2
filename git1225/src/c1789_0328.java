import java.util.Scanner;

public class c1789_0328 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		long N = sc.nextLong();
		
		int count=0;
		long result=0; //
//		long [] arr = new long [(int) N];
		while(result<N) {
			count++; //1 ~20때 멈추나?
			result+=count; //1~20까지 차례대로 더함
		}
		
		if (result==N) { // 이부분 처리 미흡했음 넘어가는 경우만 생각했음
			System.out.println(count);
		}
		else {
			System.out.println(count-1);

		}
	}

}
