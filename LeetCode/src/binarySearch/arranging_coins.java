package binarySearch;

//You have a total of n coins that you want to form in a staircase shape, where every k-th row must have exactly k coins.
//
//Given n, find the total number of full staircase rows that can be formed.
//
//n is a non-negative integer and fits within the range of a 32-bit signed integer.
//
//Example 1:
//
//n = 5
//
//The coins can form the following rows:
//¤
//¤ ¤
//¤ ¤
//
//Because the 3rd row is incomplete, we return 2.
//Example 2:
//
//n = 8
//
//The coins can form the following rows:
//¤
//¤ ¤
//¤ ¤ ¤
//¤ ¤
//
//Because the 4th row is incomplete, we return 3.
public class arranging_coins {

	public static void main(String[] args) {
		int n = 7;
		int flag = 0;
		int i=1;
		int sum = 0;
		for ( i = 1; i <= n; i++) {
			sum = sum + i;
			if (sum > n) {
				flag = 1;
				break;
			}
		}
		System.out.println(i);
	}

}
