import java.util.Scanner;

public class c1343_0328 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		
		String res = "";
		res = name(s);
		System.out.println(res);

	}

	
	private static String name(String s) {
		
		String ans="";
		String A = "AAAA",B="BB";
		
		s = s.replaceAll("XXXX", "AAAA");
		ans = s.replaceAll("XX", "BB");
		
		if(ans.contains("X")) {
			ans="-1";
		}
		
		
		return ans;
	}
}
