package com.BrigdgelabsDsa.PrimeNumberStack;

public class ExtenedPNRangeStack {
    Stack<Integer> stack = new Stack<>();
    static int num=0;
    int[][] primeNumber = new int[10][25];
    static int start ,start1,start2,start3,start4,start5,start6,start7,start8,start9=0;
    void prime() {
        System.out.println("Printing prime numbers which is Anagram between 0-1000 ");
        for (int i = 2; i < 1000; i++) {
            num = i;
            print();
        }
    }
    void print(){

        boolean flag = false;
        for (int i = 2; i <= num / 2; ++i) {
            if (num % i == 0) {
                flag = true;
                break;
            }
        }
        if(!flag)
        {
            int a=num;
            int rev = 0;
            while (a!=0) {
                int last = a % 10;
                rev = rev * 10 + last;
                a = a / 10;
            }
            if(rev==num) {
                stack.add(num);
            }
        }

    }
    void show(){
        stack.show();
    }
    public static void main(String[] args) {
        ExtenedPNRangeStack primeNumberRange = new ExtenedPNRangeStack();
        primeNumberRange.prime();
        primeNumberRange.show();
    }
}
