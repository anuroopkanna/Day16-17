package com.BrigdgelabsDsa.BankingCash4;

public class Queue <T>{
    LinkedList<T> linkedList=new LinkedList<>();
    public void enqueue(T data) {
        linkedList.addData(data);
    }

    public void peek() {
        linkedList.show();
    }

    public T dequeue(){
        return linkedList.pop();
    }

    public int size(){
        return linkedList.size();
    }
}
