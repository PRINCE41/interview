package pdump.pelev;

import java.util.Stack;

public class Sol {
    //Write a method to check if a string containing parentheses is balanced.
    // For example, the string "((()))" is balanced, but "(()" is not.
    public static void main(String[] args) {
        String s = "(a)()";
        System.out.println(isBalanced(s));
    }

    private static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if(c == '('){
                stack.push(c);
            }else if(c == ')'){
                if(stack.isEmpty()) return false;
                stack.pop();
            }
        }

        return stack.isEmpty();

    }
}
