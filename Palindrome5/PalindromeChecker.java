package com.BrigdgelabsDsa.Palindrome5;

import java.util.*;
import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word to check weather it is palindrome or not");
        String string = sc.nextLine();

        deque<Character> deque = new LinkedList<>();

        // adding each word in dequeue
        for(int i=0;i<string.length();i++)
        {
            char c= string.charAt(i);
            deque.addLast(c);
        }

        boolean status = true;

        while (deque.size()>1){
            char temp1 = deque.removeFirst();
            char temp2 = deque.removeLast();
            if(temp1!=temp2){
                status =false;
                break;
            }
        }
        if(status)
        {
            System.out.println(string+" is a palindrome");
        }
        else {
            System.out.println(string+" is not palindrome");
        }




    }
}
