package test_26;

import java.util.Stack;

public class test_26 {
    public static void main(String[] args){
        int[] nums = {3,2,2,3};
        int res = removeElement(nums,3);

        for(int i = 0;i<res;i++){
            System.out.println(nums[i]);
        }

    }
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        } else {
            Stack<Integer> stack = new Stack<>();
            stack.push(nums[0]);
            int index = 1,result = 1; // result is used to calculate

            for(int i = 1;i<nums.length;i++){
                if(!stack.contains(nums[i])){
                    stack.pop();
                    stack.push(nums[i]);
                    nums[index] = nums[i];
                    result++;
                    index++;
                }
            }
            return result;
        }
    }
    public static int removeElement(int[] nums, int val) {
        int result = 0;
        if(nums.length == 0) return result;

        for(int i = 0; i < nums.length;i++){
            if(nums[i] != val){
                result++;
            }else{
                int index = i;
                for(int j = i+1; j<nums.length;j++){
                    if(nums[j]!=nums[i]){
                        int tmp = 0;
                        tmp = nums[j];
                        nums[j] = nums[i];
                        nums[i] = tmp;
                        result ++;
                        break;
                    }
                }
            }
        }

        return result;
    }

    public static void swap(int a,int b){
        int tmp = 0;
        tmp = a;
        a = b;
        b = tmp;
    }
}
