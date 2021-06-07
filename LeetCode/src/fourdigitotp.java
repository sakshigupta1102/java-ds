import java.util.Scanner;


public class fourdigitotp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String ans="";
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		for(int i=1;i<str.length() && ans.length() < 4;i=i+2){
			int digit = Integer.parseInt(str.charAt(i)+"");
			int sq= digit*digit;
			ans+= sq+"";
			
		}
		System.out.println(ans);
		System.out.println(ans.substring(0, 4));
	}

}
