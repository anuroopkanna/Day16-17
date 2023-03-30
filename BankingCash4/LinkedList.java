package com.BrigdgelabsDsa.BankingCash4;

public class LinkedList<T> {
    Node<T> head;
    Node<T> tail;
    public void addData(T data){
        Node<T> newNode = new Node(data);
        if(head == null){
            head=newNode;
            tail=newNode;
        }
        else {
            tail.next=newNode;
            tail=newNode;
        }
    }
    public T pop() {
        if(head == null)
            return null;
        T popData = head.data;
        head = head.next;
        return popData;
    }
    public int size() {
        Node<T> temp = head;
        int count=0;
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        return count;
    }

    public void show() {
        Node<T> temp = head;
        while(temp!= null)
        {
            System.out.print(temp.data + "-> ");
            temp= temp.next;
        }
    }
    public void deleteAnyElement(T delete) {
        Node<T> temp = head;
        Node<T> temp2 = head;
        Node<T> temp3 = head;
        int count=0;
        while(temp!=null & temp2!=null & temp3!=null){
            count++;
            if(count>2)
            {
                temp3=temp3.next;
            }
            if(temp.data.equals(delete)){
                temp2=temp2.next;
                temp3.next=temp2;
                System.out.println("Data deleted successfully!!");
            }
            temp=temp.next;
            temp2=temp2.next;
        }
    }
    public void search(T search) {
        Node <T> temp = head;
        boolean choose = false;
        while(temp!=null)
        {
            if(temp.data.equals(search))
            {
                choose =true;
                deleteAnyElement(search);
            }
            temp=temp.next;
        }
        if(!choose){
            addData(search);
            System.out.println("data added successfully");
        }
    }
}
