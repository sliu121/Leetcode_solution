package test_20;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Stack;

public class test_20 {
    public static void main(String[] args){
        String g = "()()()()";
        if(isValid(g)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }

    private static boolean isValid(String s) {
        HashMap<Character,Character> h= new HashMap<>();
        h.put(')','(');
        h.put('}','{');
        h.put(']','[');

        /* We use Stack algorithm, get value on the top and pop if it matches*/

        Stack<Character> stack = new Stack<>();
        for(int i = 0;i<s.length();i++){
            char tmp = s.charAt(i);

            if(h.containsKey(tmp)){
                if(stack.empty()){      // If stack is empty and we still have right side para, it would be false.
                    return false;
                }else{
                    char top_stack = stack.pop();   // Pop the top element in stack, and check whether it is matched.
                    if(h.get(tmp) != top_stack){
                        return false;
                    }
                }
            }else if(h.containsValue(tmp)){
                stack.push(tmp);    // If it is left side para, save at the top of stack.
           }
        }

        if(stack.empty()){
            return true;    // Checked all the char in String s, and there is no value left in stack, return true
        }

        return false; // Any other condition should return false.
    }

}
