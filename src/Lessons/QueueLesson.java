package Lessons;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueLesson {
    public static void main(String[] args) {
        Queue<Integer> numbers = new PriorityQueue<>();
        numbers.add(7);
        numbers.add(11);
        numbers.add(12);
        numbers.add(6);
        numbers.add(9);
        numbers.offer(23);
    }
}
