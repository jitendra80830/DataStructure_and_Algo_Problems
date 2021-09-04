package HeapPack;

import java.util.Collections;
import java.util.PriorityQueue;

public class HeapDemo {
    public static void main(String[] args){
        PriorityQueue<Integer> pq = new PriorityQueue<>(); //min heap
        pq.add(12);
        pq.add(10);
        pq.add(20);
        pq.add(9);
        pq.add(90);
        System.out.println(pq);

        PriorityQueue<Integer> pqmax = new PriorityQueue<>(Collections.reverseOrder());//max Heap
        pqmax.add(12);
        pqmax.add(10);
        pqmax.add(20);
        pqmax.add(9);
        pqmax.add(90);
        System.out.println(pqmax);
    }
}
