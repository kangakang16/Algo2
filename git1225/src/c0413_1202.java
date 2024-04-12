import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class c0413_1202 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		
		int N = sc.nextInt(); // 훔칠 보석의 개수 3
		
		int K = sc.nextInt(); // 담을 수 있는 가방의 수 2
		
		int [][] jewel = new int[N][2]; // 훔칠 보석 정보가 있는 배열
		
		int [] bag = new int[K]; // 담을 가방의 공간 배열
		
		
	//입력 받음
		for(int i =0; i<N; i++) {
			jewel[i][0]=sc.nextInt(); //1
			jewel[i][1]=sc.nextInt(); //65
		}
		
		for(int i =0; i<K; i++) {
			bag[i]=sc.nextInt(); //10
		}
		
		Arrays.sort(jewel,(a,b)->{
			
			if(a[0]==b[0]) { //만약 보석 무게가 같다면 가격이 많이 나가는 순서대로 정렬
				return b[1]-a[1];
			}
			
			else { //보통일 때는 무게 순서대로 정렬됨.
				return a[0]-b[0];
			}
			
		}
		);
		
		Arrays.sort(bag); // 오답1. 정렬을 안했음
		
		PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder()); //내림 차순 정렬되게하여 가장 큰수가 앞으로 나오게함.
		
		long result=0;
		
		int j=0;
		for (int i =0; i<K; i++) { //가방 무게에 맞는 보석들을 우선순위 큐에 삽입할 반복문
			
			
			
//			for(j; j<N; j++) { //k[i]를 기준으로 N이 넘어가면 리턴, 안 넘어가는건 pq에 삽입
//				if(bag[i]<jewel[j][0]) { //만약 무게가 가방을 넘어갈 경우 반복문 종료		
//					break; //오답 4. 리턴문을 사용해서 모든 반복문을 빠져나오는 오류 발생
//				}
//				
//				// 오답2.2중 포문안에 j를 i로 씀 	
//				pq.add(jewel[j][1]); // 아닐 경우 pq에 보석 가격을 삽입함.
//			}
			
			while(j<N&& jewel[j][0] <=bag[i]) { //보석 무게가 가방 무게보다 작으며 j가 N의 배열보다 작을때까지 반복함 시간복잡도 n
				//j를 따로 구성해서 체크포인트 형식으로 이용이 가능함.
				pq.add(jewel[j][1]);
				
				j++;
				
			}
			
			if(!pq.isEmpty()) {
				result+=pq.poll(); // 내림차순 정렬이 되어있어 가장 큰 수가 바로 앞에 있으므로 결과에 누적함.
			}
			
			
			//오답3. 우선순위큐를 비울 필요 없음
		}
		
		
		System.out.println(result);
	}

}
