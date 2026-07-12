package Cooollections;

import java.util.Stack;

public class Stacks {
    static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
//        stack.add(10);
//        stack.add(20);
//        stack.add(30);
//        stack.add(40);
//        stack.add(50);
//        stack.add(60);

        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println(stack.peek());



    }
}
