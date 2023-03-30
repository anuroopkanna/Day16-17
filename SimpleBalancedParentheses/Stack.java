package com.BrigdgelabsDsa.SimpleBalancedParentheses;

public class Stack<T> {
    Node<T> head;
    Node<T> tail;

    void push(T data){
        Node<T> newNode = new Node<>(data);
        if(head==null)
        {
            head=newNode;
            tail=newNode;
        }
        else {
            newNode.next=head;
            head=newNode;
        }

    }
    public void show(){
        Node<T>temp = head;
        while (temp!=null){
            System.out.println(temp.data+"-> ");
            temp=temp.next;
        }
    }


    public void pop(T data) {
        head=head.next;
    }

    public void check() {
        if(head==null)
        {
            System.out.println("equation is balanced");
        }
        else {
            System.out.println("equation is not balanced ");
            show();
        }
    }
}
