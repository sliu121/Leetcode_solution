package test_35;

public class test_35 {
    public static void main(String[] args){
        int[] nums = {1,3,5,6};
        int target = 0;
        System.out.println(searchInsert(nums,target));

    }

    public static int searchInsert(int[] nums, int target){
        if(nums.length == 0) return -1;

        for(int i = 0; i<nums.length;i++){
            if(target <= nums[i]){
                return i;
            }
        }
        return nums.length;
    }
}
