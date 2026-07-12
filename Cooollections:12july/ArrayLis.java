package Cooollections;

import java.util.*;

public class ArrayLis {

    static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList();
        list.add(30);
        list.add(20);
        list.add(10);


        System.out.println(list);
        Collection<Integer> llist = new ArrayList<>();

        Collections.sort(list);
        list.sort(Comparator.reverseOrder());
        System.out.println(list);



    }
}
