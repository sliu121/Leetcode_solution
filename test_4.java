package hello_world;

/***
 * 4. Median of Two Sorted Arrays
 *
 * There are two sorted arrays nums1 and nums2 of size m and n respectively.
 * Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).
 * You may assume nums1 and nums2 cannot be both empty.
 *
 * Example 1:
 * nums1 = [1, 3]
 * nums2 = [2]
 * The median is 2.0
 *
 *
 * Example 2:
 * nums1 = [1, 2]
 * nums2 = [3, 4]
 * The median is (2 + 3)/2 = 2.5
 */
public class test_4 {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
//        int num1 = nums1.length;
//        int num2 = nums2.length;
//
//        if(num1 == 0) return (num2%2==0)? (double)(nums2[num2/2] + nums2[(num2-2)/2])/2 : (double)nums2[(num2-1)/2];
//        if(num2 == 0) return (num1%2==0)? (double) (nums1[num1/2] + nums1[(num1-2)/2])/2 : (double) nums1[(num1-1)/2];
//
//        int i = 0,j=0,x = 0,count = 0,rem = 0;
//
//        if((num1+num2)%2 == 0){
//            x = (num1+num2)/2;
//        }else{
//            rem = 1;
//            x = (num1+num2-1)/2;
//        }
//        int[] tmp = new int[x+1];
//        while(count <= x){
//            if(i == num1||j == num2){
//                tmp[count] = (i == num1)?nums2[j++]:nums1[i++];
//            }
//            else{
//                if(nums1[i] > nums2[j]){
//                    tmp[count] = nums2[j++];
//                }else{
//                    tmp[count] = nums1[i++];
//                }
//            }
//            count ++;
//        }
//        return (rem == 1)? (double) tmp[x]:(double)(tmp[x-1]+tmp[x])/2;
        int num1 = nums1.length;
        int num2 = nums2.length;
        int mid = (num1 + num2) /2;
        boolean even_or_odd = ((num1+num2) %2 ==0)? true:false;
//        if((num1 + num2)%2 == 0) {
//            mid_sub = mid -1; // if num1 + num2 = 6, then mid = 3, we want Median, then [0..5] the other one should be 2, so mid_sub = mid - 1;
//        }
        double res = 0.0;

        if(num1 == 0 && num2 == 0) {
            return 0.0;
        }
        else if(num2==0){
            if(num1 %2 == 0){
                res = (double)(nums1[mid] + nums1[mid-1])/2;
            }else{
                res = nums1[mid];
            }
        }else if(num1 == 0){
            if(num2 %2 == 0){
                res = (double)(nums2[mid]+nums2[mid-1])/2;
            }else{
                res = nums2[mid];
            }
        }else{
           int mark = 0, i = 0, j =0;
           int[] nums3 = new int[mid+1];
           while(mark < mid+1){
               if(i<nums1.length && j < nums2.length){
                   if(nums1[i]<=nums2[j]){
                       nums3[mark] = nums1[i];
                       i++;
                   }else{
                       nums3[mark] = nums2[j];
                       j++;
                   }
               }else if(i< nums1.length){
                   nums3[mark] = nums1[i];
                   i++;
               }else if(j < nums2.length){
                   nums3[mark] = nums2[j];
                   j++;
               }

               mark++;
           }

           if(even_or_odd){
               res = (double) (nums3[mid-1] +nums3[mid]) /2;
           }else{
               res = nums3[mid];
           }
        }

        return res;
    }
}
