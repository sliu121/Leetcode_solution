package hello_world;


public class test_67 {
    // 该题目，将2换成10 就可以得到一个简单的加法计算器。
    public static String addBinary(String a, String b) {
        if(a.isEmpty()) return b;
        if(b.isEmpty()) return a;

        StringBuilder res = new StringBuilder();

        int a_len = a.length() -1 ,b_len = b.length() -1 ,rem = 0;
        while (a_len >=0||b_len>=0){
            int sum = rem;      // 用sum = rem 来继承上一次计算的结果。
            // 接下来，即使a,b中有一个已经计算完了，也不会影响到我们的计算过程。
            if(a_len >= 0) sum += a.charAt(a_len--) - '0';      //sum 加上此时a的尾数
            if(b_len >= 0) sum += b.charAt(b_len--) -'0';       // sum加上此时b的尾数
            res.append(sum%2);  // 此时，求出sum除以2的余数，并把它append到res里，这个结果无非就是“1”或者‘0’
            rem = sum /2;   //此时计算sum/2的结果，如果sum是‘2’或者‘3’，那么rem就为‘1’，传承给下一次运算，
                            //让下一个sum获得这个rem的值，这样就相当于进位计算。
        }

        if(rem != 0) res.append(rem);   //当两个都String 都算完而rem还不为0，就说明结果要多一位，再次append来保存最后的结果
        return res.reverse().toString(); // 我们的计算是从尾巴开始的，所以这最后的返回结果要反过来才行。
    }
}
