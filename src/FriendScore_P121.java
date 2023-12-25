

public class FriendScore_P121 {
	public static int highestScore(String[] friends) {
		
		int result = 0;
		int len = friends.length;
		int [] friends1 = new int [len];
		for(int i = 0 ; i < friends.length; i ++ ) {
			

			
			for (int j = 0; j < len; j++) {
				char c= friends[i].charAt(j); //첫 요쇼에서의 y찾기 
				if (c=='Y') { //y를 찾았을때  
					for (int k = 0 ; k <len ; k++) { //친구의 친구 찾기 
						if ((friends[j].charAt(k)=='Y')){ //친구의 친구를 찾았을때 , 더함
							friends1[i]++; //간접 친구 ++
						};
					}	
					
				}
				else {		
				}
			}
			System.out.println(friends1[i]);
			
		}
		
		for (int i = 0; i<len; i++) {
			result =  Math.max(result, friends1[i]);
		}
		System.out.println("최대값은 ? >> "+ result);
		
		return result ;
	}
	


	public static void main(String[] args) {
		
		String[] friends = {"NYNNN","YNYNN","NYNYN","NNYNY","NNNYN"};
		highestScore(friends);

	}

}
