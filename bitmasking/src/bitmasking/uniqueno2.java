package bitmasking;
import java.util.Scanner;
public class uniqueno2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}

		int a = arr[0];
		for (int i = 1; i < n; i++) {
			a = (a ^ arr[i]);
		}
		int cnt = 0;
		int temp = a;

		while (temp != 0) {
			int bit = temp & 1;
			cnt++;
			if (bit == 1) {
				break;
			}
			temp = temp >> 1;
			
		}
		cnt=cnt-1;
		int mask=1<<cnt;
		
		int ans1 = 0;
		for (int i = 0; i < n; i++) {
			int ele = arr[i] & (mask);
			if (ele != 0 ) {
				ans1 = ans1 ^ arr[i];
			}
		}
		
        int fans= ans1;
        int sans= ans1^a;
		System.out.println(Math.min(fans,sans)+" "+Math.min(fans, sans));

	}

}
