package test;

import org.junit.jupiter.api.Test;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class JavaNavigableSet {

    @Test
    public void navigableSet() {
        NavigableSet<String> navigableSet = new TreeSet();
        navigableSet.add("test1");
        navigableSet.add("test2");
        navigableSet.add("test3");
        navigableSet.add("test4");

        // 역순
        Iterator reverse = navigableSet.descendingIterator();

        while (reverse.hasNext()) {
            System.out.println(reverse.next());
        }

        System.out.println(navigableSet.headSet("test3", true));

        /*navigableSet.pollFirst();   // 처음 원소 제거
        navigableSet.pollLast();    // 마지막 원소 제거

        for (String test : navigableSet) {
            System.out.println(test);
        }*/

        String test = navigableSet.ceiling("test1");
        System.out.println("==1> " + test);

        String test1 = navigableSet.floor("test1");
        System.out.println("==2> " + test1);

        String higher = navigableSet.higher("test1");
        System.out.println("==3> " + higher);

        String lower = navigableSet.lower("test2");
        System.out.println("==4> " + lower);





    }

}
