package hello_world;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/***
 * 3. Longest Substring Without Repeating Characters
 *
 * Given a string, find the length of the longest substring without repeating characters.
 *
 * Example 1:
 * Input: "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 *
 * Example 2:
 * Input: "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 *
 * Example 3:
 * Input: "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a
 *              subsequence and not a substring.
 */

public class test_3 {
    public int lengthOfLongestSubstring(String s) {
        int lss = 0;
        LinkedList<Character> list = new LinkedList<>();

        for(int i = 0; i < s.length();i++){
            char c = s.charAt(i);

            if(list.contains(c)){
                if(list.indexOf(c) == 0){
                    list.removeFirst();
                    list.add(c);
                }else{
                    lss = (list.size()>lss)? list.size():lss;

                    int num = list.indexOf(c);
                    while(num>=0){
                        list.remove(num);
                        num--;
                    }

                    list.add(c);
                }
            }else{
                list.add(c);
            }

            lss = (list.size()>lss)? list.size():lss;

        }
        return lss;
    }
}
