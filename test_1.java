package test_1;
/**Given an array of integers, return indices of the two numbers such that they add up to a specific target.

 You may assume that each input would have exactly one solution, and you may not use the same element twice.**/

public class test_1 {public static void main(String[] args){

    int[] nums;
    nums = new int[]{2, 7, 11, 15};
    int target = 9;
    int[] res = twoSum(nums,target);

    for (int i= 0; i <2;i++){
        System.out.println(res[i]);
    }


}

    private static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];

        for(int i = 0;i<nums.length;i++){
            for(int j = i+1;j<nums.length;j++){
                int check = nums[i] + nums[j];

                if(check == target){
                    result[0] = i;
                    result[1] = j;
                    return  result;
                }
            }
        }
        return result;
    }
}
