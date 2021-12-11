package test;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedMap;
import java.util.TreeMap;

public class JavaSortedMap {

    @Test
    public void testSortedMap() {
        //  TreeMap은 SortedMap의 구현 클래스
        SortedMap sortedMap = new TreeMap();
        sortedMap.put("test1", "테스트1");
        sortedMap.put("test2", "테스트2");
        sortedMap.put("test3", "테스트3");

        sortedMap.keySet().forEach(key -> System.out.println(sortedMap.get(key)));

        Iterator iterator = sortedMap.keySet().iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        Comparator comparator = sortedMap.comparator();

        SortedMap headMap = sortedMap.headMap("test3");
        System.out.println(headMap);

        SortedMap tailMape = sortedMap.tailMap("test1");
        System.out.println(tailMape);

        SortedMap submap = sortedMap.subMap("test1", "test3");
        System.out.println(submap);

    }

    @Test
    public void testSortedMapWithComparator() {

    }


}
