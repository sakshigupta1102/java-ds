package bitmasking;

import java.util.Scanner;

public class playingwithbits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while (t > 0) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			int ans = 0;
			for (int idx = a; idx <= b; idx++) {
				int cnt = 0;
				int i = idx;
				while (i > 0) {
					cnt += (i & 1);
					i = (i >> 1);
				}
				ans += cnt;

			}
			System.out.println(ans);
			t--;

		}

	}
}