package test;

import org.junit.jupiter.api.Test;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.stream.Stream;

public class JavaQueue {

    @Test
    public void javaQueueTest() {
        //FIFO 형태 - 먼저 들어온 데이터가 가장 먼저 나가는 구조를 말합니다.
        Queue queueA = new LinkedList();
        Queue queueB = new PriorityQueue();

        queueB.add("4444");
        queueB.add("5555");
        queueB.add("6666");

        queueA.add("1111");
        queueA.add("2222");
        queueA.add("3333");

        //System.out.println(queueA.peek());
        System.out.println(queueA.element());
        System.out.println(queueB.element());
        //System.out.println(queueA.poll());

        Iterator iterator = queueA.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        Stream stream = queueA.stream();
        stream.forEach(value -> System.out.println(value));

        boolean t = queueA.contains("1111");
        System.out.println(t);



    }
}
