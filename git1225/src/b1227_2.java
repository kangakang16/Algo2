
import java.util.Arrays;

import java.util.Scanner;

public class b1227_2 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		int s = 0;
		for (int i = 0; i<n; i++) {
			
			a[i] = sc.nextInt();

		}
		
		
		Arrays.sort(a);
		for (int i = 0; i<n; i++) {
			
			b[i] = sc.nextInt();

		}
		Arrays.sort(b);
		
		
		for (int i = 0; i<n; i++) {
			
			s+=(a[i]*b[(n-1)-i]);
			
		}
		
		System.out.println(s);
	}

}
