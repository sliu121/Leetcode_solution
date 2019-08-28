package hello_world;

import java.util.LinkedList;
import java.util.Stack;

/***
 * 7. Reverse Integer
 * Given a 32-bit signed integer, reverse digits of an integer.
 *
 * Example 1:
 * Input: 123
 * Output: 321
 *
 * Example 2:
 * Input: -123
 * Output: -321
 *
 * Example 3:
 * Input: 120
 * Output: 21
 *
 * Note:
 * Assume we are dealing with an environment which could only store integers within the 32-bit signed
 * integer range: [−2^31,  2^31 − 1]. For the purpose of this problem,
 * assume that your function returns 0 when the reversed integer overflows.
 */

public class test_7 {
    public static int reverse(int x) {
//
//        if(x == 0) return x;
//
//        if(x<Math.pow(-2,31) || x>(Math.pow(2,31)-1)) return 0;
//        boolean checkpoint = false;
//        int res = 0;
//        if(x<0){
//            checkpoint = true;
//            x = x*-1;
//        }
//
//        LinkedList<Integer> linkedList = new LinkedList<>();
//        while(x!= 0){
//            linkedList.add(x%10);
//            x = x/10;
//        }
//
//        while(!linkedList.isEmpty()){
//            if(res<Math.pow(-2,31)/10 || res>(Math.pow(2,31)-1)/10){
//                return 0;
//            }else{
//                res = res*10+linkedList.pop();
//            }
//        }
//
//        res = (checkpoint)?res*-1:res;
//
//        return res;
//

        if(x > Integer.MAX_VALUE || x < Integer.MIN_VALUE) return 0;

        StringBuilder sb = new StringBuilder(Integer.valueOf(Math.abs(x)).toString());
        String intReversed = sb.reverse().toString();
        if (x < 0) {
            return Integer.parseInt("-" + intReversed);
        } else {
            return Integer.parseInt(intReversed);
        }
    }
}
