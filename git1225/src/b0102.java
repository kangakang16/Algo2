import java.util.Scanner;

public class b0102 {

	public static void main(String[] args) {
	
		
		Scanner sc= new Scanner(System.in);
		
		int N = sc.nextInt(); //3
		
		String seat = sc.next();
		
		int cupHolder = 1;

		for(int i =0; i <seat.length(); i++) {
			
			if (seat.charAt(i)=='S') {
				cupHolder+=1;
				
			}
			else if (seat.charAt(i)=='L') {
				i++;
				cupHolder+=1;
			}
			
			
		}
		
		System.out.println(N> cupHolder? cupHolder: N);
	}

}
