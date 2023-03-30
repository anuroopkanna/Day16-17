package com.BrigdgelabsDsa.SimpleBalancedParentheses;

import java.util.Scanner;

public class StackMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> stack = new Stack<>();
        String str = " ( 5 + 6 ) ∗ ( 7 + 8 ) / ( 4 + 3 ) ( 5 + 6 ) ∗ ( 7 + 8 ) / ( 4 + 3 ) ";
        String regex ="\\d+";
        str = str.replaceAll(regex," ");
        System.out.println(str);
        String[] strArray= str.split(" ");
        String push ="(";
        String push2 =")";
        for(int i=0;i<strArray.length;i++)
        {
            if(strArray[i].equals(push)) {
                stack.push(strArray[i]);
            } else if (strArray[i].equals(push2)) {
                stack.pop(strArray[i]);
            }
        }
        stack.check();

    }
}
