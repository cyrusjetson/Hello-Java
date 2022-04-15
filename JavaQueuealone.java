package com.javapgm;

import java.util.*;

public class JavaPgm {
    public static void main(String[] args) {
// Queue
        Queue<Person> supermarket = new LinkedList<>();
        supermarket.add(new Person("Alex",18));
        supermarket.add(new Person("Jetson",19));
        System.out.println(supermarket);
        System.out.println(supermarket.size());
        System.out.println(supermarket.peek());
        System.out.println(supermarket.poll()); /// removes entry
        System.out.println(supermarket);

//        Output:
//        [Person[name=Alex, age=18], Person[name=Jetson, age=19]]
//        2
//        Person[name=Alex, age=18]
//        Person[name=Alex, age=18]
//        [Person[name=Jetson, age=19]]
    }
    static record Person(String name, int age){}
}
