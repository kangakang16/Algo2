import java.util.*;

public class c0419_2606 {
	
	static int N,M;
	
	static ArrayList<Integer> arr[];
	
	static boolean [] check;
	
	static int count=0;
	static int count2=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		
		N = sc.nextInt();
		M = sc.nextInt();
		
		
		arr = new ArrayList[N+1];
		
		check= new boolean[N+1];
		
		for (int i =0; i<arr.length; i++) { //N+1의 개수대로 어레이 리스트 생성 
			arr[i] = new ArrayList<>();
		}
		
		for(int i=0; i<M; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			arr[a].add(b); //a번째 배열에 b요소를 넣음
			arr[b].add(a); //b번째 배열에 a요소를 넣음
		}
		
		for (int i =0; i<arr.length; i++) {
			Collections.sort(arr[i]);// 각각의 배열을 정렬 해줌
		}
		
		dfs(1);
		
		System.out.println(count-1);
		Arrays.fill(check, false);
		
//		bfs(1);
//		System.out.println(count2);
	}



	private static void bfs(int index) {
		check[index] = true;
		
		Queue<Integer> q = new LinkedList<>();
		q.add(index);
		
		while(!q.isEmpty()) {
			int cur = q.poll();
			for(int i :arr[cur]) {
				if(!check[i]) {
					q.add(i);
					check[i]=true;
					count2++;
				}
			}
			
		}
		
	}



	private static void dfs(int index) {
		
		check[index]=true;
		
		count++;
		for(int i: arr[index]) {
			
			{
				if(!check[i]) {
					dfs(i);
				}
			}
		}
		
		
		
	}

}
