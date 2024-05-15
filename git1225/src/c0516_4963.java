import java.util.*;

public class c0516_4963 {

	static int[][] arr;
	static boolean[][] check;

	static int h, w;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		while (true) {

			w = sc.nextInt();
			h = sc.nextInt();

			if (w == 0 && h == 0) {
				break;
			}

			arr = new int[h][w];
			check = new boolean[h][w];
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {

					arr[i][j] = sc.nextInt();

				}
			}

			int count=0;
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {

					if (arr[i][j] == 1 && !check[i][j]) {
						dfs(i, j);
						count++;
					}

				}
			}

			System.out.println(count);
		}
	}

	private static void dfs(int startX, int startY) {
		// TODO Auto-generated method stub
		if (startX < 0 || startX >= h || startY < 0 || startY >= w
				||check[startX][startY] ||arr[startX][startY]==0) {
			return;
		}

		check[startX][startY] = true;
		
        int move[][] = {{0,-1},{0,1},{1,0},{-1,0}, {-1,-1}, {-1,1}, {1,-1}, {1,1}}; // 대각선 이동 추가
        
        
        for (int i =0; i<8; i++) {
        	int nextX=startX-move[i][0];
        	int nextY=startY-move[i][1];
        	
        	dfs(nextX,nextY);
        	
        	
        	
        }
		
		
		

	}

}
