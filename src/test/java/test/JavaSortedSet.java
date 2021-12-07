package test;

import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Stream;

public class JavaSortedSet {

    List<String> testData = Arrays.asList("test3", "test2", "test1", "test0");

    @Test
    public void sortedSet() {
        //  원소들이 정렬되어 있는 Set
        SortedSet<String> sortedSet = new TreeSet<>(testData);

        System.out.println(sortedSet);
    }

    @Test
    public void sortedSetTest() {

        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.addAll(testData);

        Iterator<String> iterator = treeSet.descendingIterator();

        /*while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }*/

        Stream<String> stream = treeSet.stream();

        stream.forEach(ele -> System.out.println(ele));

    }

    @Test
    public void headSet() {

        SortedSet sortedSet = new TreeSet();
        sortedSet.addAll(testData);

        // SortedSet headSet = sortedSet.headSet("test2");
        SortedSet headSet = sortedSet.tailSet("test2");

        System.out.println(headSet);

    }


}
