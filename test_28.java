package test_28;

public class test_28 {
    public static void main(String[] args){
        String haystack = "mississippi";
        String needle = "sippia";
        System.out.println(strStr(haystack,needle));
    }

    public static int strStr(String haystack, String needle){
        if(haystack.length()<needle.length()) return -1;
        if(haystack.isEmpty()||needle.isEmpty()) return 0;
//        boolean result = false;
//        int res = 0;

//        for(int i = 0; i<haystack.length();i++){
//            if(haystack.charAt(i) == needle.charAt(0)){
//                if(i == haystack.length() - 1 && needle.length() ==1){
//                    return i;
//                }else if( i == haystack.length() - 1 && needle.length() !=1){
//                    return -1;
//                }
//
//                int tmp = i;
//                for(int j = 0; j < needle.length();j++){
//                    int edge = tmp +1;
//                    if(haystack.length()<edge) return -1;
//                    if(haystack.charAt(tmp++) != needle.charAt(j)){
//                        result = false;
//                        break;
//                    }else {
//                        result = true;
//                    }
//                }
//                if(result) return i;
//            }
//        }
//        return -1;
        int threshold = haystack.length() - needle.length();
        for (int i = 0; i <= threshold; ++i) {
            if (haystack.substring(i,i+needle.length()).equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}
