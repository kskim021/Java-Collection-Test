package test;

import org.junit.jupiter.api.Test;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class JavaDeque {

    @Test
    public void javaDeque() {
        //  Queue 와 달리 양방향 구이다.
        // add와 offer 차이는 리턴값이 다름 (add는 예외, offer는 false)
        Deque<String> deque = new LinkedList<>();

        Deque<String> deque1 = new ArrayDeque<>();

        deque.add("test1");
        deque.add("test2");
        deque.add("test3");
        deque.add("test4");

        deque.addFirst("test0");
        deque.addLast("test5");

        deque.offer("test6");

        deque.offerFirst("test-1");
        deque.offerLast("test7");

        // poll 삭제
        // deque.poll("test3");
        deque.pollFirst();
        deque.pollLast();


        String removeEle = deque.pop();
        System.out.println("=====> " + removeEle);

        System.out.println("====> " + deque.size());

        for (String s : deque) {
            System.out.println(s);
        }

        Iterator iterator = deque.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


        //  peak 검사

    }

}
