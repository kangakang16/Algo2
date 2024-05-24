import java.util.Arrays;
import java.util.Scanner;

public class c0524_1940 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int [ ] arr = new int [N];
		
		for(int i =0; i<N; i++) {
			
			arr[i]=sc.nextInt();
			
		}
		
		Arrays.sort(arr);
		int count=0;
		int startIndex=0; //a[0]
		int endIndex=N-1;//a[n-1]
	

		
		while(startIndex<endIndex) {
			if((arr[startIndex]+arr[endIndex])<M) startIndex++;
			
			else if((arr[startIndex]+arr[endIndex])>M) endIndex--;
			
			else { //같은 경우				
				count++;
				startIndex++;
				endIndex--;
			}
			
			
		}
		
		System.out.println(count);

	}

}
