package test;

import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Stream;

public class JavaSet {

    @Test
    public void setType() {

        Set setA = new HashSet();   // 중복제거, null 허용, 순서 관리x
        Set setB = new LinkedHashSet();    // 중복제거, null 허용, 순서 관리 O
        Set setC = new TreeSet();   //  이진 탐색 트리 구조, 중복제거, null 허용, 순서 관리x

    }

    @Test
    public void setTest() {
        Set<String> setA = new HashSet();

        setA.add("element1");
        setA.add("element2");
        setA.add("element3");

        // 값을 꺼낼 때
        Iterator iterator = setA.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        for (String str : setA) {
            System.out.println(str);
        }

    }

    @Test
    public void setTest1() {
        Set<String> set = new HashSet<>();
        set.clear();

        set.add("one");
        set.add("two");
        set.add("three");

        set.remove("one");
        //set.removeAll(set);

        //  Java 8 의 기능 사용
        Stream<String> stream = set.stream();
        stream.forEach(element -> {
            System.out.println(element);
        });


        Set<String> set1 = new HashSet<>();
        set1.add("one");
        set1.addAll(set);

        Stream<String> stream1 = set1.stream();
        stream1.forEach(element -> {
            System.out.println(element);
        });

        System.out.println(set1.retainAll(set));

        boolean isEmpty = set1.isEmpty();
        System.out.println(isEmpty);


    }

    @Test
    public void setConvertList() {
        Set<String> set = new HashSet<>();

        set.add("123");
        set.add("456");

        List<String> list = new ArrayList<>();
        list.addAll(set);

        System.out.println(list);
    }

    @Test
    public void treeSetTest() {
        TreeSet<String> set = new TreeSet<>();
        set.add("one");
        set.add("two");
        set.add("three");

        System.out.println(set.first());

        Iterator iterator = set.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }


}
