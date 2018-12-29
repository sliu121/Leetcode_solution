import java.util.HashMap;

public class test_13 {

    public static void main(String[] args){
        String str = new String();
        str = "MCMXCIV";
        int num = romanToInt(str);
        System.out.println(num);
    }

    public static int romanToInt(String s){
        HashMap<Character,Integer> sym_val = new HashMap<>();
        sym_val.put('M',1000);
        sym_val.put('D',500);
        sym_val.put('C',100);
        sym_val.put('L',50);
        sym_val.put('X',10);
        sym_val.put('V',5);
        sym_val.put('I',1);

        int num = 0;
        int i = 0;

        while(i<s.length()){
            if(i== s.length()-1){
                char now_position = s.charAt(i);
                num += sym_val.get(now_position);
                i++;
            }else {
                int j = i+1;
                char now_position = s.charAt(i);
                char next_position = s.charAt(j);

                int now_value = sym_val.get(now_position);
                int next_value = sym_val.get(next_position);

                if(now_value < next_value){
                    int tmp = next_value-now_value;
                    num += tmp;
                    i+=2;
                }else{
                    num += now_value;
                    i++;
                }

            }

        }

        return  num;



    }
}
