package hello_world;

public class test_66 {
    public static int[] plusOne(int[] digits){

        int length = digits.length;
        int res[] = new int[length+1];

        for(int i = length - 1; i>= 0 ; i--){
            if(digits[i] != 9){
                digits[i] += 1;
                return digits;
            }else{
                digits [i] = 0;
            }
        }
        res[0] = 1;

        return res;
    }
}
