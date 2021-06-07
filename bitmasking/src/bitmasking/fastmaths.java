package bitmasking;

import java.util.Scanner;

public class fastmaths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while (t > 0) {
			int num1 = scan.nextInt();
			int num2 = scan.nextInt();
			StringBuilder sb = new StringBuilder();

			while (num1 > 0 || num2 > 0) {
				int b1 = num1 % 10;
				int b2 = num2 % 10;
				int ans = b1 ^ b2;
				sb.append(ans);
				num1 = num1 / 10;
				num2 = num2 / 10;
			}
			for (int i = sb.length() - 1; i >= 0; i--) {
				System.out.print(sb.charAt(i));
			}
			System.out.println();
			t--;
		}
	}
}
