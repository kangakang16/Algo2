import java.util.*;


public class c0424_7562 {
	
	static int tc,I;
	
	static int startN;
	static int endN;
	static int [][] map;
	static boolean [][] check;
	static int[][] time;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		

		tc=sc.nextInt();
		
		
		for(int i =0; i<tc; i++) {
			
			
			I=sc.nextInt();//8
			map=new int[I][I];
			time=new int[I][I];
			check=new boolean[I][I];
			
			
			int startX=sc.nextInt();
			int startY=sc.nextInt();
			
			
			int endX=sc.nextInt();
			int endY=sc.nextInt();
			
			map[endX][endY]=1000;
			
			bfs(startX,startY);
			
		}
	}

	private static void bfs(int startX, int startY) {
		Queue<int[]> q = new LinkedList<>();
		
		
		q.add(new int []{startX,startY});
		int[][] Move = {
			    {-2, -1}, {-2, 1},  // 위로 두 칸, 좌/우로 한 칸
			    {-1, -2}, {-1, 2},  // 왼쪽으로 두 칸, 위/아래로 한 칸
			    {1, -2}, {1, 2},    // 오른쪽으로 두 칸, 위/아래로 한 칸
			    {2, -1}, {2, 1}     // 아래로 두 칸, 좌/우로 한 칸
			};
		check[startX][startY]=true;
		
		time[startX][startY]=0;
		
		
		while(!q.isEmpty()) {
			
			int []currentXY=q.poll();
			
			int currentX=currentXY[0];
			int currentY=currentXY[1];
			
			if(map[currentX][currentY]==1000) {
				System.out.println(time[currentX][currentY]);				
				break;
			}
			

			
			for(int i=0; i<8;i++) {
				int nextX = currentX+Move[i][0];
				int nextY = currentY+Move[i][1];
				
				
				if(nextX >= 0 && nextX < I && nextY >= 0 && nextY < I&&!check[nextX][nextY]) {
					q.add(new int[] {nextX,nextY});
					check[nextX][nextY]=true;
					time[nextX][nextY]=time[currentX][currentY]+1;
					
				}
				
				
			}
			
			
			
		}
		
		
		
		
		
	}

}
