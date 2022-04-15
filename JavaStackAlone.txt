package com.javapgm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class JavaPgm {
    public static void main(String[] args) {

         //  Stack data structure  --- last in first out
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.size());
        System.out.println(stack.empty());
    }
}
