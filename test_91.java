/**
 * This answer is a wrong answer!!
 * How you guys know whether this problem is Fabonacci
 * for case, "100","001" I still dont know how to solve.
 * Should I do this problem use tail-to-head all the time?
 * When should I use t-to-h?
 * **/


package hello_world;

public class test_91 {
    public static int numDecodings(String s) {
//        if(s.isEmpty()) return 0;
//        if(s.)
        int count = 0;
        int i =0;
        int fx0 = 1;
        int fx1= (s.charAt(i)=='0')? 0:1;

        while (i<s.length()-1){
            if(s.charAt(i) != '0'){
                if(Integer.parseInt(s.substring(i,i+2))<=26){
                    count = fx0+fx1;
                    fx0 = fx1;
                    fx1 = count;
                }else {
                    count = fx1;
                }
            }
            i++;
        }

        return count;
    }
}
