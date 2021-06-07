package bitmasking;

import java.util.Scanner;

public class uniqueno3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int[] arr= new int[n];
		for(int i=0;i<n;i++){
			arr[i]= scan.nextInt();
		}
		int[] ans= new int[33];
		for(int i=0;i<n;i++){
			int ele= arr[i];
			int cnt=1;
			while(ele!=0){
				int bit=ele&1;
				ans[cnt]+=bit;
				cnt++;
				ele=ele>>1;
			}
		}
		for(int i=0;i<n;i++){
			arr[i]=arr[i] % 3;
		}
		int fans=0;
		for(int i=0;i<n;i++){
			if(arr[i]==1){
				fans+=i;
			}
		}
		System.out.println(fans);
		

	}

}
