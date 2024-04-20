import java.util.*;

public class c0419_2667 {
	
	static boolean check [][] ;
	
	static int N;
	
	static int map[][] ;

	static int count =0;
	
	static int houseNum=1;
	
	static ArrayList<Integer> a = new ArrayList<>();
	
	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		N=sc.nextInt();//7
        sc.nextLine(); // 개행문자 소비
		map= new int[N][N];
        check = new boolean[N][N]; // check 배열 초기화
		for(int i =0; i<N; i++) {
			String mapLine = sc.nextLine();
			for(int j =0; j<N; j++) {
				map[i][j]=mapLine.charAt(j)-'0';
			}
		}
		
        int houseNum = 0; // 단지 수 초기화
        
		for(int i =0; i<N; i++) {

			for(int j =0; j<N; j++) {
				if(map[i][j]==1&&!check[i][j]) {
					count=0;
					dfs(i,j);
					a.add(count); 
					houseNum++;//단지 수 카운트
				}
				
			}
			
		}
		Collections.sort(a);
		System.out.println(houseNum);// 단지 수 입력
		for(int i = 0; i < a.size(); i++) {
		    System.out.println(a.get(i));
		}
		
		
		
		
		

	}

	private static void dfs(int x, int y) {
		
        if (x < 0 || y < 0 || x >= N || y >= N || map[x][y] == 0 || check[x][y]) { // 조건 추가, 이미 방문했거나 집이 없는 경우 바로 반환
            return;
        }
        check[x][y]=true;
        // 상하좌우 탐색
        count++; // 집의 수 증가
        dfs(x - 1, y);
        dfs(x, y - 1);
        dfs(x + 1, y);
        dfs(x, y + 1);
		
		//다 끝내고 나오면 집의 카운트 수가 측정됨.
		//이것을 a에 넣음


		
		
	}

}
