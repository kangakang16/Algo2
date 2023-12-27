import java.util.Scanner;

public class B1227 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		
	
		int count =0; // 사이클 수를 계산
		
		int inputData = sc.nextInt(); //26
		
		// 십의 자리는 일의 자리 , 일의 자리는 양 옆을 더한 값,
		// 사이클 적립
		// 그리고 마지막엔 동일 판정.
		int checkData=inputData; 
		int result=99999;
		while(checkData!=result) {
			
			
			
			int ten= inputData%10; // 6 
			int one= (inputData/10)+(inputData%10); // 2+ 6
			if (one>=10) one=one%10;
			
			result=(ten*10)+one; //60+8
			count++;
			inputData = result;
			
		}
		System.out.println(count);
	}

}
