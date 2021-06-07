package Array;

//Given an array of integers, return indices of the two numbers such that they add up to a specific target.
//
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//
//Example:
//
//Given nums = [2, 7, 11, 15], target = 9,
//
//Because nums[0] + nums[1] = 2 + 7 = 9,
//return [0, 1].
public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={1,2,3,4,5};
		int target=5;
		for(int i=0;i<arr.length;i++){
			int res=  Math.abs(target-arr[i]);
			for(int j=i+1;j<arr.length;j++){
				if(arr[j]==res){
					System.out.println(arr[i]+" "+ arr[j]);
				}
				
				
			}
			
			
			
			
			
			
		}

	}

}
