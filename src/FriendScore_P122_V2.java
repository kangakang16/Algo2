

public class FriendScore_P122_V2 {
	public static int highestScore(String[] friends) {
		
		int result = 0;
		int len = friends.length;

		for(int i = 0 ; i < friends.length; i ++ ) {
			int ans= 0;
			
			for (int j = 0; j < len; j++) {
				if (i ==j) continue;
				if (friends[i].charAt(j)=='Y') { //y를 찾았을때 
					ans++;
				}
				else {
					
					for (int k = 0 ; k <len ; k++) { //친구의 친구 찾기 
						if ((friends[j].charAt(k)=='Y' && friends[k].charAt(i) == 'Y')){ //친구의 친구를 찾았을때 , 더함
							ans++; //간접 친구 ++
							break;
						};
					}	
					
				}
			}
			System.out.println(ans);
			result =  Math.max(result, ans);
		}
		System.out.println("최대값은 ? >> "+ result );
		
		return result ;
	}
	


	public static void main(String[] args) {
		
		String[] friends = {"NYNNN","YNYNN","NYNYN","NNYNY","NNNYN"};
		highestScore(friends);

	}

}
