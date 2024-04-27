import java.util.*;

public class c0426_2583 {
	
	static int N,M,K; // x, y, 영역의 개수
	
	static int [][] map;
	
	static boolean [][] check;
	
	static ArrayList<Integer> count; // 우선순위 큐 대신 ArrayList 사용
	static int countNumber=1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		M=sc.nextInt(); // 0 4 1 2 4 6
		N=sc.nextInt();
		K=sc.nextInt();
		map=new int[M][N];
		check=new boolean[M][N];
		for(int i=0; i<K; i++) { // K번 반복해야 하는데, 잘못된 값(3)이 있었습니다.
			int leftDownX=sc.nextInt(); // 
			int leftDownY=sc.nextInt();
			
			int rightUpX=sc.nextInt();
			int rightUpY=sc.nextInt();
			
			for(int x=leftDownX; x<rightUpX; x++) { // 0~4
				for(int y=leftDownY; y<rightUpY; y++) { // 2~4
					map[y][x]=1;
	
				}
			}
		}
		
		count = new ArrayList<>(); // 우선순위 큐 대신 ArrayList 사용
		
		for(int i=0; i<M; i++) {
			for(int j=0; j<N; j++) {
				if(map[i][j] != 1 && !check[i][j]) {
					countNumber=1;
					bfs(i,j);
				}
				
			}
		}
		
		Collections.sort(count); // ArrayList를 오름차순으로 정렬
		
		System.out.println(count.size());
		for(int result : count) { // for-each 루프를 사용하여 출력
			System.out.print(result + " ");
		}

	}

	private static void bfs(int startX, int startY) {
		
		check[startX][startY]=true;
		
		Queue<int[]> q = new LinkedList<>();
		
		q.add(new int[] {startX,startY});
		
		while(!q.isEmpty()) {
			
			int [] cur=q.poll();
			
			int curX=cur[0];
			int curY=cur[1];
			
			int [][]move = {{0,1},{0,-1},{1,0},{-1,0}};
			
			for(int i =0; i<4; i++) {
				int nextX=curX+move[i][0];
				int nextY=curY+move[i][1];
				
				if(nextX>=0 && nextX<M && nextY>=0 && nextY<N && !check[nextX][nextY] && map[nextX][nextY]==0) {
					q.add(new int[] {nextX,nextY});
					check[nextX][nextY]=true;
					countNumber++;
				}
				
			}
								
		}
		
		count.add(countNumber);
		
		
	}

}
