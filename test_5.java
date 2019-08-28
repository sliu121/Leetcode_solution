package hello_world;

public class test_5 {
    public static String longestPalindrome(String s) {
        if(s.isEmpty()) return null;

        int mark_head = 0, mark_tail = 0,maxlen = -1;
        int tail = s.length()-1;
        for(int head = 0;head<s.length();head++){
            while(tail>head){
                if(s.charAt(head) == s.charAt(tail)){
                    int inner_head = head+1, inner_tail = tail -1;
                    while(inner_head < inner_tail){
                        if(s.charAt(inner_head) == s.charAt(inner_tail)){
                            inner_head++;
                            inner_tail--;
                        }else{
                            break;
                        }
                    }

                    if(inner_head>=inner_tail){
                        int tmp = tail-head +1;
                        if(tmp>maxlen){
                            maxlen = tmp;
                            mark_head = head;
                            mark_tail = tail;
                        }
                    }
                }
                tail --;
            }

            tail = s.length() -1;

        }


        return s.substring(mark_head,mark_tail+1);

    }
}
