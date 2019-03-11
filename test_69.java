package hello_world;

public class test_69 {
    public static int mySqrt(int x) {
        if(x == 0) return 0;

        long res = x;
        while (res*res> x) res = (res+x/res) /2 ;

        return (int)res;


    }
}
