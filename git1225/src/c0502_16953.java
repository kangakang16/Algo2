import java.util.*;


public class c0502_16953 {
	
	static int arr[];
	

	static boolean check[];
	
	static int A,B;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		A=sc.nextInt();
		B=sc.nextInt();
		
		long result=bfs(A);
		
		System.out.println(result);
	}


	private static long bfs(int n) {
		
		Queue<long[]> q = new LinkedList<>();
		
		

		q.add(new long []{n,0});
		while(!q.isEmpty()) { //B를 찾지 못했을 때 나오는 조건. 포문에서 초과했을때 나오도록.
			long [] currentN=q.poll();
			
			long count=currentN[1];
			
			if(currentN[0]==B) { // 같으면 카운트 반환
				return count+1;
			}
			
			long nextN=currentN[0]*2;
			if(nextN<=B) {
				q.add(new long[] {nextN,count+1});
			}
			
			nextN=currentN[0]*10+1;
			if(nextN<=B) {
				q.add(new long[] {nextN,count+1});
			}
			
			
			
		}

		return -1;
		
		
	}

}
