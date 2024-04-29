import java.util.*;

public class c0430_2644 {
	
	static int n,find1,find2,m;
	
	static int [][] arr;
	
	static boolean [] check;
	

	
	static int result=-1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		n=sc.nextInt();
		
		find1=sc.nextInt();
		find2=sc.nextInt();
		
		m=sc.nextInt();
		
		arr = new int[n+1][n+1];
		check = new boolean[n+1];
		
		for(int i=0; i<m; i++) {
			int x=sc.nextInt();
			int y=sc.nextInt();
			
			arr[x][y]=arr[y][x]=1;
			
			
			
		}
		
		dfs(find1,0);

		System.out.println(result);
		
	}

	private static void dfs(int start,int count) {
		// TODO Auto-generated method stub
		
		
		if(start==find2) {
			result=count;
			
			return;
		}
		check[start]=true;
		
		//여기서 카운트 0을 가진 반복문이 진행됨
		//경로 탐색이 끝났을때
		for(int i =1; i<=n; i++) {
			
			
			if(arr[start][i]==1&&!check[i]) {
				
				dfs(i,count+1);
			}
			
			
			
		}
		
	}

}
