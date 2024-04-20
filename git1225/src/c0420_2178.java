import java.util.*;

public class c0420_2178 {

	static int[][] map;

	static boolean[][] check;

	static int N, M;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		M = sc.nextInt();
		sc.nextLine();

		map = new int[N][M]; // 4 ,6
		check = new boolean[N][M];
		for (int i = 0; i < N; i++) { // 4

			String mapLine = sc.nextLine(); // 6개
			for (int j = 0; j < M; j++) {
				map[i][j] = mapLine.charAt(j) - '0';
			}

		}

		bfs(0, 0);

		System.out.println(map[N - 1][M - 1]);
	}

	private static void bfs(int x, int y) {

		// BFS 구현
		int[] dx = { -1, 1, 0, 0 };
		int[] dy = { 0, 0, -1, 1 };

		Queue<int[]> q = new LinkedList<>();
		q.add(new int[] { x, y });
		check[x][y] = true;

		while (!q.isEmpty()) {
			int[] pos = q.poll(); // 들어있는 걸 꺼내서 pos에 전달

			int currentX = pos[0];
			int currentY = pos[1];

			for (int i = 0; i < 4; i++) { // 상하 좌우 로직
				int nx = currentX + dx[i];
				int ny = currentY + dy[i];

				if (nx >= 0 && nx < N && ny >= 0 && ny < M) {
					if (map[nx][ny] == 1 && !check[nx][ny]) {
						q.add(new int[] { nx, ny });

						map[nx][ny] = map[currentX][currentY] + 1; // 이동거리 계산
						check[nx][ny] = true;

					}
				}

			}

		}

	}

}
