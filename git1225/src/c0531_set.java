import java.util.ArrayList;
import java.util.Collections;

public class c0531_set {
	
    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = {};
        
        ArrayList<Integer> resultArr = new ArrayList<>();
        
        for(int i =0; i<commands.length; i++) { // 길이 만큼 반복
        	int start = commands[i][0];
        	int end = commands[i][1];
        	int find = commands[i][2];
        	
        	
        	
        	ArrayList<Integer> findArray = new ArrayList<>();
        	
        	for (int j=start-1; j<end; j++) {
        		
        		findArray.add(array[j]);
        		
        	}
        	
        	Collections.sort(findArray); // 어레이리스트 정렬함.

        	resultArr.add(findArray.get(find-1));// 찾는 배열의 n번째 숫자를 기입
        	
        	
        }
        
        int result[] = new int[resultArr.size()]; //결과를 담을 배열을 크기만큼 생성 
        
        for (int i =0; i<resultArr.size(); i++) {
        	
        	result[i]=resultArr.get(i);
        	
        	
        }
        
        
        
        
        return result;
    }

    public static void main(String[] args) {

    	int array[] = new int[] {1,5,2,6,3,7,4};
    	
    	int commands[][] = new int [][] {{2,5,3},{4,4,1},{1,7,3}};
    	
    	solution(array,commands);
    	
        System.out.println(); // [Alice, Bob] 출력
    }
}
