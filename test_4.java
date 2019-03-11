package hello_world;

public class test_4 {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int num1 = nums1.length;
        int num2 = nums2.length;

        if(num1 == 0) return (num2%2==0)? (double)(nums2[num2/2] + nums2[(num2-2)/2])/2 : (double)nums2[(num2-1)/2];
        if(num2 == 0) return (num1%2==0)? (double) (nums1[num1/2] + nums1[(num1-2)/2])/2 : (double) nums1[(num1-1)/2];

        int i = 0,j=0,x = 0,count = 0,rem = 0;

        if((num1+num2)%2 == 0){
            x = (num1+num2)/2;
        }else{
            rem = 1;
            x = (num1+num2-1)/2;
        }
        int[] tmp = new int[x+1];
        while(count <= x){
            if(i == num1||j == num2){
                tmp[count] = (i == num1)?nums2[j++]:nums1[i++];
            }
            else{
                if(nums1[i] > nums2[j]){
                    tmp[count] = nums2[j++];
                }else{
                    tmp[count] = nums1[i++];
                }
            }
            count ++;
        }
        return (rem == 1)? (double) tmp[x]:(double)(tmp[x-1]+tmp[x])/2;

    }
}
