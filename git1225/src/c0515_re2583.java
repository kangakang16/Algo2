import java.util.*;

public class c0515_re2583 {
	
	static int M,N,count=0;
	
	static boolean [][] check;
	
	static int [][] arr;
	
	static ArrayList<Integer> S= new ArrayList<>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		M = sc.nextInt();
		N = sc.nextInt();

		arr = new int[M][N];
		check = new boolean[M][N];
		int K = sc.nextInt();

		for (int i = 0; i < K; i++) {
			int startX = sc.nextInt();
			int startY = sc.nextInt();
			int endX = sc.nextInt();
			int endY = sc.nextInt();
			for (int j = startY; j < endY; j++) {

				for (int k = startX; k < endX; k++) {

					arr[M-j-1][k] = 1;

				}

			}

		}
		
		
		for (int i = 0; i < M; i++) {
			
			for (int j = 0; j < N; j++) {
				
				
				if(arr[i][j]==0&&!check[i][j]) {
					
					dfs(i,j);
					S.add(count);
					count=0;
					
				}
				
				
				
			}
			
		}
		
		
		
		Collections.sort(S);
		System.out.println(S.size());
		for( int i =0; i<S.size();i++) {
			System.out.print(S.get(i)+" ");
		}
		
		
		
		
		

	}

	private static void dfs(int startX, int startY) {
		// TODO Auto-generated method stub
		if(startX<0||startX>=M||startY<0||startY>=N||check[startX][startY]||arr[startX][startY]!=0) {
			
			return;
			
		}
	
		count++;
		check[startX][startY]=true;
		
		dfs(startX+1,startY);
		dfs(startX-1,startY);
		dfs(startX,startY+1);
		dfs(startX,startY-1);
		
		
		
		
		
		
		
		
		
		
	}

}
