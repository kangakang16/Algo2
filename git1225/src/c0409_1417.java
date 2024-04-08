import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class c0409_1417 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		
		int n = sc.nextInt()-1;// 후보의 수 ,3
		
		int dasom = sc.nextInt(); // 다솜이의 첫번째
		
	
		int nswer =0;
		
		
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		
		for (int i =0; i<n; i++) { // 다른 후보 투표수
			
			pq.add(sc.nextInt());
			
		} 
		
	
		while(!pq.isEmpty() && pq.peek()>=dasom) { //다솜이의 투표수가 현재 큐에서 꺼내는 수보다 크거나 같을때
			
			int cur = pq.poll();
			cur--; // 가장 큰 후보 투표수 -1
			dasom++; // 다솜이 투표수 +1
			nswer++;// 매수 횟수 +1
			pq.add(cur);

		}

		System.out.println(nswer);
	}

}
