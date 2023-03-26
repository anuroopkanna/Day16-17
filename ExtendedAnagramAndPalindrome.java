package com.BrigdgelabsDsa;

public class ExtendedAnagramAndPalindrome
{
    static int num=0;
    void numberGenerator(){
        for (int i=0;i<1000;i++){
            num=i;
            show();
        }
    }
    void show(){
        boolean choose=false;
        for (int i=2;i<=num/2;++i){
            if (num%i==0){
                choose=true;
                break;
            }
            //prime number ends
        }//palindrome
        int a=num;
        int rev=0;
        while (a!=0){
            int last =a%10;
            rev =rev*10+last;
            a=a/10;
        }
        //printing
        if (rev==num){
            if (!choose){
                System.out.println(num+ " is a prime number & palindrome");
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("*****Palindrome and Prime number*****");
        ExtendedAnagramAndPalindrome extendedAnagramAndPalindrome=new ExtendedAnagramAndPalindrome();
        extendedAnagramAndPalindrome.numberGenerator();
    }
}
