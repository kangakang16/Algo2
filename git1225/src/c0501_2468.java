import java.util.*;

public class c0501_2468 {

	static int arr[][];

	static boolean check[][];

	static int N;
	
	static int result=0;

	static int arrMax = 0;
	static int arrMin = 101;
	static int count = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();

		arr = new int[N][N];
		check = new boolean[N][N];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				arr[i][j] = sc.nextInt();
				arrMax = Math.max(arrMax, arr[i][j]);
				arrMin = Math.min(arrMin, arr[i][j]);
			}
		}

		for(int water=0;water<=arrMax;water++) { // 물의 수위
			count=0;
			check = new boolean[N][N];
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {

					if (arr[i][j] > water && !check[i][j]) {
						dfs(i, j, water);
						count++;

					}
				}
			}
			result=Math.max(result, count);
		}

		

//		for(int i=arrMin;i<=arrMax;i++) {
//			
//		}
		
		System.out.println(result);

	}

	private static void dfs(int startX, int startY, int ix) {// 좌표 , 물의 수위
		// TODO Auto-generated method stub

		if (startX < 0 || startX >= N || startY < 0 || startY >= N || check[startX][startY]
				|| arr[startX][startY] <= ix) { // 물의 수위가 작은것들
			return;

		}

		check[startX][startY] = true;

		dfs(startX - 1, startY, ix);
		dfs(startX, startY - 1, ix);
		dfs(startX + 1, startY, ix);
		dfs(startX, startY + 1, ix);

	}

}
