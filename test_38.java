package test_38;

import java.util.HashMap;

public class test_38 {
    public static void main(String[] args){
        System.out.println(countAndSay(6));
    }
    public static String countAndSay(int n) {
        String res= "";
        if(n == 1) return "1";
        if(n == 2) return "11";
        int count = 1, i = 0;

        String tmp = countAndSay(n-1);

        while(i<tmp.length()){
            if(i == tmp.length() -1 )  return res = res + count + tmp.charAt(i);
            if(tmp.charAt(i) != tmp.charAt(i+1)){
                res = res + count + tmp.charAt(i);
                i ++ ;
                count = 1;
            }else {
                count++;
                i++;
            }
        }
        return res;
    }
}
