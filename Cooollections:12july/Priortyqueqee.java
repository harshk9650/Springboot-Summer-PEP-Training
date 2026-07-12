package Cooollections;

import java.util.PriorityQueue;
import java.util.Queue;

public class Priortyqueqee {

    static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue<>((a,b)->b-a);

        pq.offer(10);
        pq.offer(20);
        pq.offer(30);
        pq.offer(40);
        pq.offer(50);

        System.out.println(pq);
        System.out.println(pq.peek());



    }
}
