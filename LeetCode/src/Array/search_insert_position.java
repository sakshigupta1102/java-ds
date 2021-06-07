package Array;

import java.util.Scanner;

//Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
//
//You may assume no duplicates in the array.
//
//Example 1:
//
//Input: [1,3,5,6], 5
//Output: 2
//Example 2:
//
//Input: [1,3,5,6], 2
//Output: 1
public class search_insert_position {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int item = scan.nextInt();
		int flag = 0;
		int[] a = new int[7];
		for (int i = 0; i < a.length; i++) {

			a[i]=scan.nextInt();

		}

		for (int i = 0; i < a.length; i++) {

			if (a[i] == item) {
				System.out.println(i);
			} else {
				flag = 1;
			}

		}

		if (flag == 1) {
			for (int i = 1; i < a.length-1; i++) {
				if (item > a[i] && item < a[i + 1]) {
					System.out.println(i + 1);
					break;
				} else if (item > a[a.length - 1]) {
					System.out.println(a.length);
					break;
				} else if (item < a[0]) {
					System.out.println(0);
					break;
				}
			}

		}

	}
}
