package com.BrigdgelabsDsa.BankingCash4;

import java.util.Scanner;

public class CashCounter {
    public static void main(String[] args) {
        Queue<Integer> cashCounterQueue= new Queue<>();
        boolean status= true;
        while (status){
            Scanner in = new Scanner(System.in);
            System.out.println("**********Welcome to Bank Cash Counter**********");
            System.out.println("Enter the Total Balance");
            Integer totalBalance= Integer.valueOf(in.next());
            cashCounterQueue.enqueue(totalBalance);
            System.out.println("********************");
            System.out.println("1) Deposit");
            System.out.println("2) Withdraw");
            System.out.println("3) Display Balance");
            System.out.println("4) Exit");
            int choice= in.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Enter the Amount you want to Deposit:");
                    Integer depositAmount= Integer.valueOf(in.next());
                    totalBalance= totalBalance + depositAmount;
                    cashCounterQueue.dequeue();
                    cashCounterQueue.enqueue(totalBalance);
                    System.out.println("Current Balance:");
                    cashCounterQueue.peek();
                    cashCounterQueue.dequeue();
                    break;
                case 2:
                    System.out.println("Enter the Amount you want to Withdraw:");
                    Integer withdrawAmount= Integer.valueOf(in.next());
                    if(withdrawAmount > totalBalance){
                        System.out.println("Insufficient Balance!!!");
                    } else {
                        totalBalance = totalBalance - withdrawAmount;
                        cashCounterQueue.dequeue();
                        cashCounterQueue.enqueue(totalBalance);
                    }
                    System.out.println("Current Balance:");
                    cashCounterQueue.peek();
                    cashCounterQueue.dequeue();
                    break;
                case 3:
                    System.out.println("Current Balance is:");
                    cashCounterQueue.peek();
                    break;
                default:
                    status= false;
                    break;
            }
        }

    }
}
