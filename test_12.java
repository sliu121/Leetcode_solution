

public class test_12 {
    public static void main(String[] args){
        int num = 1994;
        String s = intToRoman(num);
        System.out.println(s);

    }


    public static String intToRoman(int num) {

        String[] symbol = new String[]{"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int[] values = new int[]{1000,900,500,400,100,90,50,40,10,9,5,4,1};

        StringBuilder str = new StringBuilder();

        for(int i = 0;i<values.length;i++){
            while(num>=values[i]){
                num -= values[i];
                str.append(symbol[i]);
            }
        }
        return str.toString();


    }
}
