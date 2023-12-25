import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class B1226 {

	public static void main(String args[]) throws Exception
	{	
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int T=sc.nextInt(); //10


		for(int test_case = 1; test_case <= 10; test_case++)
		{ 
			String input = sc.next().replace("#", ""); // #1

			int n = sc.nextInt(); // 7041
			sc.nextLine(); // 줄바꿈 문자 소비
			
			String input2 = sc.nextLine(); // 문자열
			String[] a = input2.split(" "); // 공백을 기준으로 스플릿한 문자열
			
			sb.append("#"+test_case+"\n");
			
			int [] arrNum = new int[a.length]; 
			for (int i =0; i<a.length ; i++) { // 처음에 들어온 배열을 숫자로 변환
				
				switch (a[i]) {
				case "ZRO": {
					arrNum[i]=0;
					break;
					}
				case "ONE": {
					arrNum[i]=1;
					break;
					}
				case "TWO": {
					arrNum[i]=2;
					break;
					}
				case "THR": {
					arrNum[i]=3;
					break;
					}
				case "FOR": {
					arrNum[i]=4;
					break;
					}
				case "FIV": {
					arrNum[i]=5;
					break;
					}
				case "SIX": {
					arrNum[i]=6;
					break;
					}
				case "SVN": {
					arrNum[i]=7;
					break;
					}
				case "EGT": {
					arrNum[i]=8;
					break;
					}
				case "NIN": {
					arrNum[i]=9;
					break;
					}
				}
				
			}
			Arrays.sort(arrNum); // 숫자로 변환된 배열을 정렬
			for (int i =0; i<arrNum.length ; i++) { // 다시 문자열로 출력함
				
				switch (arrNum[i]) {

				case 0: {
					
					sb.append("ZRO ");
					break;	
					}
				case 1: {
					
					sb.append("ONE ");
					break;	
					}
				case 2: {
					
					sb.append("TWO ");
					break;	
					}
				case 3: {
					
					sb.append("THR ");
					break;	
					}
				case 4: {
					
					sb.append("FOR ");
					break;	
					}
				case 5: {
					
					sb.append("FIV ");
					break;	
					}
				case 6: {
					
					sb.append("SIX ");
					break;	
					}
				case 7: {
					
					sb.append("SVN ");
					break;	
					}
				case 8: {
					
					sb.append("EGT ");
					break;	
					}
				case 9: {
					
					sb.append("NIN ");
					break;	
					}
				}
				
			}
			sb.append("\n");
		}
		
		System.out.println(sb);
	}
	
	
}


