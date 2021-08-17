package Basics;

import java.io.*;
import java.util.*;

class InfixToPostfix{
    
    public static int priority(char ch){
        if(ch=='-'||ch=='+'){
            return 1;
        }
        return 2; 
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();
        Stack<Character> op = new Stack<>();
        Stack<String> postfix = new Stack<>();
        for(int i=0;i<exp.length();i++){
            char  ch = exp.charAt(i);
            if(Character.isDigit(ch)|| ch>='a' && ch<='z')  {
                postfix.push(ch+"");
            }
            else if(ch=='('){
                op.push(ch);
            }
            else if(ch==')'){
                while(op.peek()!='('){
                    String v2 = postfix.pop();
                    String v1 = postfix.pop();
                    char  op1 = op.pop();
                    postfix.push(v1+v2+op1);
                }
                op.pop();
            }
            else if(ch=='+'||ch=='-'||ch=='*'||ch=='/'){
                while(op.size()!=0 && op.peek()!='('
                && priority(op.peek()) >= priority(ch)){
                    String v2 = postfix.pop();
                    String v1 = postfix.pop();
                    char  op1 = op.pop();
                    postfix.push(v1+v2+op1);
                }
                op.push(ch);
            }
        }
        while(op.size()!=0){
                    String v2 = postfix.pop();
                    String v1 = postfix.pop();
                    char  op1 = op.pop();
                    postfix.push(v1+v2+op1);
        }
        System.out.println( postfix.pop());
     }
}