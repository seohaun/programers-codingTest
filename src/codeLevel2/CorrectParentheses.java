package codeLevel2;

import java.util.Stack;

/*
 https://school.programmers.co.kr/learn/courses/30/lessons/12909
 올바른 괄호
 - 괄호가 바르게 짝지어졌다는 것은 '(' 문자로 열렸으면 반드시 짝지어서 ')' 문자로 닫혀야 한다는 뜻입니다.
 - "()()" 또는 "(())()" 는 올바른 괄호입니다.
 - ")()(" 또는 "(()(" 는 올바르지 않은 괄호입니다.

 stack 사용해서 해결
 */
public class CorrectParentheses {
    public boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        for(char chr:s.toCharArray()){
            if(stack.isEmpty()){
                stack.push(chr);
                continue;
            }
            if(stack.peek() == '(' && chr == ')'){
                stack.pop();
            }else{
                stack.push(chr);
            }
        }
        return stack.isEmpty();
    }
}
