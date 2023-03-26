package com.BrigdgelabsDsa;

import java.util.Arrays;
import java.util.Scanner;

public class Anogram6 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter 1st String: ");
        String str =sc.next().toUpperCase();
        System.out.println("Enter 2nd String: ");
        String str1 =sc.next().toUpperCase();
        if (str.length()== str1.length()) {
            char char1[] = str.toCharArray();
            char char2[] = str1.toCharArray();

            Arrays.sort(char1);
            Arrays.sort(char2);
            String sorted1 = new String(char1);
            String sorted2 = new String(char2);
            if (sorted1.equals(sorted2))
                System.out.println("is anagram");
            else
                System.out.println("not anagram");
        }
    }
}
