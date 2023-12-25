
public class CrazyBot_P149 {
	static double [] prob = new double[4]; //확률을 저장하는 배열
	static boolean[][] map = new boolean[100][100];
	static int rx[] = {1,-1,0,0}; 
	static int ry[] = {0,0,1,-1}; //동서 남북의 방향
	static int n =1;
	static int east=25;
	static int west=25;
	static int south=25;
	static int north=25;
	
	public static double getProbability(int n , int east, int west , int south, int north) {
		prob[0] = east /100.0;
		prob[1] = west /100.0;
		prob[2] = south /100.0;
		prob[3] = north /100.0;
	
		return dfs(50,50,n);
		
		
	}
	
	static double dfs(int x , int y , int n) {
		if(map[x][y]) //다시 방문하는것을 막는 , 정중앙에 올 시 종료
			return 0;
		if (n ==0) return 1; // n은 이동할수 있는 횟수이기 떄문에 0이 되면 종료
		
		map[x][y] = true; //방문한 곳을 트루로 
		double ret =0; //다시 돌아오지 않을 확률
		for(int i =0; i<4; i++) { // 동 서 남 북 순서로 로봇을 움직임
			
			ret += dfs(x + rx[i], y + ry[i], n - 1 ) *prob[i]; // 재귀함수
			
			// 렛에 확률을 더함 , 
			
		}
		
		map[x][y] = false;	//방문한 표시를 지움 , 포문을 빠져나와서 지움 
		
		return ret;
		
	}
	

	public static void main(String[] args) {
		System.out.println(getProbability(n ,east,west ,south,north)*100 + "퍼센트입니다.");
	}

}
