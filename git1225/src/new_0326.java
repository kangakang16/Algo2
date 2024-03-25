import java.util.Arrays;
import java.util.Scanner;

public class new_0326 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int N= sc.nextInt();
		int w[]= new int [N];
		
		for (int i =0; i <N; i++) {
			
			w[i]= sc.nextInt();
			
		}
		
		Arrays.sort(w); // 정렬
		int max=0;
		for (int i =0; i <N; i++) {
			
			max=Math.max(max, w[i]*(N-i));
		}
		
		System.out.println(max);
	}
	

}
