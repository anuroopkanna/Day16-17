package com.BrigdgelabsDsa.OrderedDSA2;

import java.util.Scanner;

public class LinkedListMain<T> {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SortedLinkedList<Integer> sortedLinkedList = new SortedLinkedList<>();
//        LinkedList<Integer> linkedList=new LinkedList<>();
        System.out.println("How many number do you want to add: ");
        int number = sc.nextInt();
        for (int i = 0; i < number; i++) {
            System.out.println("Enter a number which you want to add to the linkedList");
            int a = sc.nextInt();
            sortedLinkedList.add(a);
        }
        System.out.println("Original linked list");
        sortedLinkedList.show();
        System.out.println();
        System.out.println("Sorted linked list");
        sortedLinkedList.sortTheElements();
        sortedLinkedList.show();
        while (true) {
            System.out.println();
            System.out.print("Enter a number to check weather it is present or not:-");
            int n = sc.nextInt();
            sortedLinkedList.searchElement(n);
            System.out.println("Updated linked list");
            sortedLinkedList.show();
        }
    }
}
