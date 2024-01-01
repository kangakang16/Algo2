import java.util.Scanner;

public class b0102_2 {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int T = sc.nextInt(); // 요리시간 100
		int result300=0,result60=0,result10=0;
		
		if ((T%10)!=0) { // 버튼으로 맞출수 없을 T
	
			System.out.println(-1);			
		}
		
		else {
			while (T!=0) {
				
				if(T>=300) {
					result300+=(T/300); //결과값 누적
					T%=300; //나누고 나머지값을 돌림 
				}
				else if(T>=60){
					result60+=(T/60); //결과값 누적
					T%=60; //나누고 나머지값을 돌림 
				}
				else if(T>=10){
					result10+=(T/10); //결과값 누적
					T%=10; //나누고 나머지값을 돌림 
				}
				
			}
			
			
			System.out.println(result300+" "+result60+" "+result10);
		}

	}

}
