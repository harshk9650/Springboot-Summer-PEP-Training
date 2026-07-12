package Cooollections;

import java.util.HashSet;
import java.util.Set;

public class Hashsettt {
    static void main(String[] args) {
        Set<Integer> hashset = new HashSet<>();
       hashset.add(10);
        hashset.add(20);
        hashset.add(30);
        hashset.add(50);

        Set<Integer> hashset2 = new HashSet<>();
        hashset2.add(10);
        hashset2.add(20);
        hashset2.add(30);
        hashset2.add(40);
        hashset2.add(50);
        hashset2.add(60);
        hashset2.add(70);
        hashset2.add(80);

        System.out.println(hashset2.containsAll(hashset));
        System.out.println(hashset);

    }
}
