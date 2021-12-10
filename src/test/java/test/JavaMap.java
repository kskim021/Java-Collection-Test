package test;

import com.java.collection.domain.Member;
import org.junit.jupiter.api.Test;

import javax.xml.transform.Source;
import java.util.*;
import java.util.stream.Stream;

public class JavaMap {

    @Test
    public void javaMapTest() {
        /*HashMap 에는 키를 기반으로하는 값이 들어 있습니다.
          고유 한 요소 만 포함합니다.
          하나의 널 (null) 키와 복수의 널 값을 가질 수 있습니다.
          그것은 순서를 유지 하지 않습니다 .*/
        Map mapA = new HashMap();
        /*TreeMap 에는 키를 기반으로 한 값이 들어 있습니다.
          NavigableMap 인터페이스를 구현하고 AbstractMap 클래스를 확장합니다.
          고유 한 요소 만 포함합니다.
          null 키는 가질 수 없지만 복수의 널 값을 가질 수 있습니다.
          그것은 HashMap 과 마찬가지로 오름차순 을 유지합니다 (키의 자연 순서를 사용하여 정렬 됨).*/
        Map mapB = new TreeMap();
    }

    @Test
    public void hashMapTest() {
        Map<String, Member> map = new HashMap<>();
        Member member = new Member("name");
        map.put("test", member);
        map.put("test1", member);

        for (String key : map.keySet()) {
            Member value = map.get(key);
            System.out.println(value.getName());
        }

        Member ele1 = map.get("test1");
        System.out.println("====> " + ele1.getName());

        Member ele2 = map.getOrDefault("E", new Member("nameTest"));
        System.out.println("====2>" + ele2.getName());

        boolean hasKey = map.containsKey("test");
        System.out.println(hasKey);

    }

    @Test
    public void iteratingMap() {
        Map<String, Member> map = new HashMap<>();
        map.put("t", new Member("test1"));
        map.put("t1", new Member("test2"));
        map.put("t2", new Member("test3"));

        Iterator iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        Stream stream = map.keySet().stream();
        stream.forEach(ele -> System.out.println(ele));

        for (Member value : map.values()) {
            System.out.println(value.getName());
        }

    }

    @Test
    public void entryIter() {
        Map<String, Member> map = new HashMap<>();
        map.put("t", new Member("test1"));
        map.put("t1", new Member("test2"));
        map.put("t2", new Member("test3"));

        map.replace("t", new Member("test4"));

        Set<Map.Entry<String, Member>> entries = map.entrySet();

        Iterator<Map.Entry<String, Member>> iterator = entries.iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, Member> entry = iterator.next();
            String key = entry.getKey();
            String value = entry.getValue().getName();

            System.out.println("2====> " + key);
            System.out.println("1====> " + value);

        }

    }

    @Test
    public void compute() {
        Map<String, Integer> map = new HashMap<>();
        map.put("test1", 10);
        map.put("test2", 20);
        map.put("test3", 30);
        map.put("test4", 40);

        map.compute("test1", (k,v) -> v + 50);
        System.out.println(map.get("test1"));
    }

    @Test
    public void merge() {
        Map<String, Integer> map = new HashMap<>();
        map.put("test1", 10);
        map.put("test2", 20);
        map.put("test3", 30);
        map.put("test4", 40);

        map.merge("test1", 10, (k,v) ->  v + 50);
        System.out.println(map.get("test1"));
    }


}
