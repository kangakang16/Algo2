import java.util.*;

public class c0421_1012 {

	static boolean check[][];

	static int map[][];

	static int tc, count;

	static int M, N, K;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		tc = sc.nextInt();
		
	

		for (int i = 0; i < tc; i++) {// tc

			count=0;
			N = sc.nextInt();// 세로길이
			M = sc.nextInt();// 가로길이
			K = sc.nextInt();// 배추 개수

			map = new int[N][M];
			check = new boolean[N][M];
			for (int j = 0; j < map.length; j++) {
				Arrays.fill(map[i], 0); // 전부 0으로 채우기
			}
			// 이 다음 입력값을 받음 , 배추 개수
			for (int j = 0; j < K; j++) {
				int x = sc.nextInt();
				int y = sc.nextInt();

				map[x][y] = 1; // 배추 위치에 1 기입
			}

			for (int j = 0; j < N; j++) {
				for (int k = 0; k < M; k++) {
                    if (map[j][k] == 1 && !check[j][k]) {
                        dfs(j, k);
                        count++; // 밀집구역 찾을 때마다 count 증가
                    }
					
					
				}

			}
			
			System.out.println(count);

		}

	}

	private static void dfs(int x, int y) {
		// TODO Auto-generated method stub
	    if (x < 0 || y < 0 || x >= N || y >= M || check[x][y] || map[x][y] == 0) {
	        return;
	    }
		check[x][y] = true;
		// 상하좌우 탐색
		dfs(x - 1, y);
		dfs(x, y - 1);
		dfs(x + 1, y);
		dfs(x, y + 1);
		
		
	}

}
