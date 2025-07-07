package com.william.top150.stack;

import java.util.Map;
import java.util.Stack;

/**
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 *
 * An input string is valid if:
 *
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Every close bracket has a corresponding open bracket of the same type.
 */
public class ValidParentheses {

    public static void main(String[] args){

        System.out.println(isValid("]"));

    }

    public static boolean isValid(String s) {

        if(s.length() %2 !=0){
            return false;
        }

        Stack<Character> charStack = new Stack<>();

        for(int i = 0; i< s.length(); i ++){

            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{'){
                charStack.push(s.charAt(i));
            }else {

                if(charStack.isEmpty()){
                    return false;
                }

                if(s.charAt(i) == ')' && charStack.peek() == '(' ){
                    charStack.pop();
                } else if (s.charAt(i) == '}' && charStack.peek() == '{' ) {
                    charStack.pop();
                } else if (s.charAt(i) == ']' && charStack.peek() == '[' ) {
                    charStack.pop();
                }else{
                    charStack.push(s.charAt(i));
                }

            }

        }

        return charStack.isEmpty();
    }

    public static boolean isValid2(String s) {

        if (s.length() % 2 != 0) return false;

        Map<Character, Character> map = Map.of(
                ')', '(',
                '}', '{',
                ']', '['
        );

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (map.containsKey(c)) {

                if (stack.isEmpty() || stack.pop() != map.get(c)) {
                    return false;
                }
            } else {

                stack.push(c);
            }
        }

        return stack.isEmpty();
    }

}
