package com.dll;

class Node{
    Node prev;
    int data;
    Node next;

    Node(){
        prev = null;
        next = null;
        data = -999;
    }

}

class Dll{
    Node first;
    Node last;
    int size = 0;

    boolean isEmpty(){
        return size == 0;
    }

    void insertAtLast(int x){
        Node temp = new Node();
        temp.data = x;

        if(isEmpty()){
            first = temp;
            last = temp;
        }
        else {
            last.next = temp;
            temp.prev = last;
            last = temp;
        }
        size++;
    }

    void insertAtFirst(int x){
        Node temp = new Node();
        temp.data = x;
        if (isEmpty()) {
            first = temp;
            last = temp;
        }
        else {
            temp.next = first;
            first.prev = temp;
            first = temp;
        }
        size++;
    }

    void deleteAtIndex(int i){
        if (isEmpty())
        {
            System.out.println("Empty");
            return;
        }
        else {
            Node temp = first;
            int counter = 0;
            if(i == 0)
            {
                first.next.prev = null;
                first = first.next;
                return;
            }
            int flag = 0;
            temp = first.next;
            while(temp != null){
                counter++;
                if(counter == i) {
                    flag = 1;
                    break;
                }
                temp = temp.next;
            }
            if (flag == 0) {
                System.out.println("no such index");
                return;
            }
            if (temp.next == null)
            {
                temp.prev.next = null;
                temp.prev = null;
                size--;
                return;
            }
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
            temp.next = null;
            temp.prev = null;
            size--;
        }
    }

    void insertAtIndex(int i, int x){
        Node temp = new Node();
        temp.data = x;
        if (isEmpty() && i == 0){
            first = temp;
            last = temp;
            size++;
        }
        else if (i == 0){
            first.prev = temp;
            temp.next = first;
            first = temp;
            size++;
        }
        else {
            if (size < i + 1) {
                System.out.println("no such index");
                return;
            }
            int counter = 0;
            Node tem2 = new Node();
            tem2 = first.next;
            while(tem2 != null){
                counter++;
                if(counter == i) {
                    break;
                }
                tem2 = tem2.next;
            }
            tem2.prev.next = temp;
            temp.next = tem2;
            temp.prev = tem2.prev;
            tem2.prev = temp;
            size++;
        }

    }

    void print(){
        Node temp = first;
        while (temp.next != null) {
            System.out.print(temp.data+ " ");
            temp = temp.next;
        }
        System.out.print(temp.data);
        System.out.println();
    }

}

public class DoubleLL {
    public static void main(String[] args) {
        Dll d = new Dll();
        d.insertAtLast(2);
        d.insertAtLast(5);
        d.insertAtFirst(3);
        d.print();
        d.deleteAtIndex(2);
        d.print();
        d.insertAtFirst(7);
        d.insertAtIndex(2, 10);
        d.print();
        d.insertAtIndex(3, 11);
        d.print();
    }
}
