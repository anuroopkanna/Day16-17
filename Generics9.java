package com.BrigdgelabsDsa;

public class Generics9<T> {
    static <T>void printArray(T[] array){
        for (T x:array) {
            System.out.println(x+"");
        }
    }
    static <T> void searchElement(T search,T[] array){
        for (T a:array) {
            if (a==search){
                System.out.println(a+" is present");
            }
        }
    }
    static <T extends Comparable<T>>void sorting(T[] array){
        boolean choose= true;
        while (choose){
            choose=false;
            for (int i=1;i<array.length;i++){
                if (array[i-1].compareTo(array[i])>0){
                    T temp =array[i-1];
                    array[i-1]=array[i];
                    array[i] =temp;
                    choose=true;
                }
            }
        }
    }
    public static void main(String[] args) {
        Integer[]  intArray={1,4,3,5,8,6};
        String[] stringarray={"Lohith","Divya","Maha","Swathi","Silky"};
        System.out.println("Original array is: ");
        printArray(intArray);
        System.out.println();
        printArray(stringarray);
        sorting(intArray);
        sorting(stringarray);
        System.out.println();
        System.out.println("sorted array is: ");
        printArray(intArray);
        System.out.println();
        printArray(stringarray);
        searchElement(3,intArray);
        searchElement("lohith",stringarray);
    }
}
