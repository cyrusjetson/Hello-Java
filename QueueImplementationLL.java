package com.queueLL;

class Node{
    int data;
    Node next;
    Node(){
        data = -9999;
        next = null;
    }
}

class QueueImp{
    Node first;

    void enqueue(int x){
        Node temp = new Node();
        temp.data = x;

        Node temp2 = new Node();
        temp2 = first;

        if(first == null){
            first = temp;
        }
        else{
            while (temp2.next != null)
            {
                temp2 = temp2.next;
            }
            temp2.next = temp;
        }
    }

    void print(){
        if(first == null)
            return;
        System.out.println(first.data);
        Node temp = first;
        while(temp.next != null)
        {
            temp = temp.next;
            System.out.println(temp.data);
        }
    }

    int dequeue(){
        int temp;

        if(first == null)
        {
            System.out.print("no element ");
            return -999;
        }

        Node tempNode = first;
        Node tempNode2 = first;
        while (tempNode.next != null)
        {
            tempNode2 = tempNode;
            tempNode = tempNode.next;
        }
        temp = tempNode.data;
        tempNode2.next = null;
        return temp;
    }

    QueueImp(){
        first = null;
    }
}

public class QueueLL {
    public static void main(String[] args) {
        QueueImp q = new QueueImp();
        q.enqueue(1);
        q.enqueue(3);
        q.enqueue(2);

        q.print();
        System.out.println("new");
        System.out.println(q.dequeue());
        System.out.println("after dequeue");
        q.print();
    }
}
