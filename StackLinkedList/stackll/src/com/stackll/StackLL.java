package com.stackll;

class Node{

    // node attributes
    int data;
    Node next;

    // methods
    Node(){
        next = null;
        data = -9999;
    }

    void getDetails(){
        System.out.println(data);
    };
}

class StackClass{
    Node top;
    StackClass(){
        top = null;
    }

    void push(int x){
        Node temp = new Node();
        temp.next = top;
        temp.data = x;
        top = temp;
    }

    int pop(){
        int temp = top.data;
        top = top.next;
        return temp;
    }
}

public class StackLL {
    public static void main(String[] args) {
        StackClass s = new StackClass();
        s.push(3);
        s.push(4);
        System.out.println(s.pop());
    }
}
