package test;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

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
        Map mapb = new TreeMap();
    }
}
