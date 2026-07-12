package Cooollections;

import java.util.Collections;
import java.util.LinkedList;

public class LinKklist {
    static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(60);
        list.add(30);
        list.add(5000);
        list.add(40);
        list.add(20);

        System.out.println(list.toArray());
        Object[] arr = list.toArray();

        System.out.println(arr[0]);
        System.out.println(arr[2]);


    }
}
