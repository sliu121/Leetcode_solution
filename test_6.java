package hello_world;

/***
 * 6. ZigZag Conversion
 *
 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this:
 * (you may want to display this pattern in a fixed font for better legibility)
 *
 * P   A   H   N
 * A P L S I I G
 * Y   I   R
 * And then read line by line: "PAHNAPLSIIGYIR"
 * Write the code that will take a string and make this conversion given a number of rows:
 * string convert(string s, int numRows);
 *
 * Example 1:
 * Input: s = "PAYPALISHIRING", numRows = 3
 * Output: "PAHNAPLSIIGYIR"
 *
 * Example 2:
 * Input: s = "PAYPALISHIRING", numRows = 4
 * Output: "PINALSIGYAHRPI"
 * Explanation:
 * P     I    N
 * A   L S  I G
 * Y A   H R
 * P     I
 */

public class test_6 {

    public String convert(String s, int numRows) {
        if(s.isEmpty()) return "";
        if(numRows == 1 ) return s;
        StringBuilder stringBuilder = new StringBuilder();

        // here we use a index to mark which row we are looking
        int index = 0;

        // all we need is just watch the first column, for the reason I will explain below
        while(index<numRows){
            int mark = index;
            int guilv = 2*numRows - 2;
            int diff =  guilv- 2 * mark;
            // here we have to consider 2 conditions:
            // 1. the first row and the last row;
            // 2. the others.

            // for the 1st condition, we know that diff would be (2*numRows - 2) or 0.
            if(diff == 0 || diff == guilv){
                while(mark<s.length()){
                    stringBuilder.append(s.charAt(mark));
                    mark += guilv;
                }
            }else{ // for 2nd condition, we need talk more.
                boolean checkpoint = true;
                int diff_2 = 2 * mark;
                while(mark<s.length()){
                    stringBuilder.append(s.charAt(mark));
                    //consider what value we should add here, diff or diff_2
                    if(checkpoint){
                        mark += diff;
                        checkpoint = false;
                    }else{
                        mark += diff_2;
                        checkpoint = true;
                    }
                }
            }
            index ++;
        }

        return stringBuilder.toString();
    }
}
