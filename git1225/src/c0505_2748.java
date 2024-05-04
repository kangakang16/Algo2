import java.util.*;


public class c0505_2748 {

	static long [ ] arr= new long [90];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		arr[0]=0;
		arr[1]=1;
		
		int result=sc.nextInt();
		
		System.out.println(fibo(result)); 
		

	}

	private static long fibo(int n) {
		// TODO Auto-generated method stub
		if (n==0) {
			return 0;
		}
		
        if (n == 1) { 
            return 1;
        }
		if(arr[n]!=0) {
			return arr[n]; 
		}
		
		return  arr[n]=fibo(n-1)+fibo(n-2);
		
		
	}

}
