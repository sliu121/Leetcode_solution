package hello_world;

public class test_70 {
    public static int climbStairs(int n) {
        if(n == 1|| n==2) return (n==2)? 2:1;

        int count = 2;
        int i = 2;
        int fx0 = 1;
        int fx1 = 2;
        while(i!=n){
            count = fx0 + fx1;
            fx0 = fx1;
            fx1 = count;
            i++;
        }

        return count;
    }
}
