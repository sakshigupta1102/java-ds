package bitmasking;

import java.util.Scanner;

public class setbits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while (t > 0) {
			int n = scan.nextInt();
			int cnt = 0;
			while (n != 0) {
				cnt+= n&1;
				n = n >> 1;
			}
			System.out.println(cnt);
			t--;
		}
	}

}
