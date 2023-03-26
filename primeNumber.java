package com.BrigdgelabsDsa;

public class primeNumber {
    static int num=0;
    void prime(){
        int count=0;
        for (int i=2;i<1000;i++){
            num=i;
            show();
        }
    }

     void show() {
        boolean choose= false;
        for (int i=2;i<=num/2;i++){
            if(num%i==0){
                choose=true;
                break;
            }
        }
        if (!choose){
            System.out.println(num + " ");
        }
    }

    public static void main(String[] args) {
        System.out.println("***** Presenting you the Prime numbers of 1-1000 *****");
        primeNumber primeNumber= new primeNumber();
        primeNumber.prime();
    }
}
