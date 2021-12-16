package test;

import org.junit.jupiter.api.Test;

import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.TreeMap;

public class JavaNavigableMap {

    @Test
    public void javaNavigableMap() {
        //
        NavigableMap navigableMap = new TreeMap();
        navigableMap.put("test1", "1");
        navigableMap.put("test2", "2");
        navigableMap.put("test3", "3");

        // System.out.println(navigableMap.descendingMap());

        Object ceilingKey = navigableMap.ceilingKey("test1");
        // System.out.println(ceilingKey);

        Map.Entry ceilingEntry = navigableMap.ceilingEntry("test1");
        System.out.println(ceilingEntry);

        NavigableSet reverse = navigableMap.descendingKeySet();
        System.out.println(reverse);

    }




}
