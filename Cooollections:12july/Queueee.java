package Cooollections;

import java.util.LinkedList;
import java.util.Queue;

public class Queueee {
    static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        System.out.println(queue.peek());
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);
        queue.offer(50);

        System.out.println(queue.poll());



    }
}
