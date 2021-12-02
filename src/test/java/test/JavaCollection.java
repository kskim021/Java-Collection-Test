package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

public class JavaCollection {

    // Collection collection = new ArrayList();

    public void collectionTest(Collection collection) {

        Iterator iterator = collection.iterator();

        while (iterator.hasNext()) {
            Object o = iterator.next();
            System.out.println("===========>" + o);
        }

    }

    @Test
    public void CollectionUtil() {
        Set set = new HashSet();
        List list = new ArrayList();
        List list2 = new LinkedList();

        set.add("a");
        set.add("b");
        set.add("c");

        list.add("1");
        list.add("2");
        list.add("3");

        list2.add("aa");
        list2.add("bb");
        list2.add("cc");

        JavaCollection jc = new JavaCollection();

        // collection에 어떠한 타입도 가능함.
        jc.collectionTest(set);
        jc.collectionTest(list);
        jc.collectionTest(list2);

    }

    @Test
    public void AddElement() {
        String anElement = "an element";
        Collection collection = new HashSet();

        boolean didCollectionChange = collection.add(anElement);

        Assertions.assertEquals(true, didCollectionChange);


        boolean wasElementRemoved = collection.remove(anElement);

        Assertions.assertEquals(true, wasElementRemoved);

    }

    @Test
    public void CollectionRetain() {
        Collection col1 = new ArrayList();
        Collection col2 = new ArrayList();

        col1.add("A");
        col1.add("B");
        col1.add("C");


        col2.add("1");
        col2.add("2");
        col2.add("3");

        Collection target = new HashSet();
        target.addAll(col1);
        target.addAll(col2);

        System.out.println("1=======> " + target);

        target.retainAll(col1);
        //target.retainAll(col2);

        System.out.println("2=======> " + target);

    }

    @Test
    public void checkCollection() {
        Collection collection = new HashSet();
        boolean containsElement = collection.contains("an Element");
        System.out.println("1======> " + containsElement);

        Collection element = new HashSet();
        boolean containAll = element.containsAll(element);
        System.out.println("2======> " + containAll);

    }

    @Test
    public void iteratorCollection() {
        Collection collection = new HashSet();
        collection.add("a");
        collection.add("b");
        collection.add("c");

        Iterator iterator = collection.iterator();

        while (iterator.hasNext()) {
            Object o = iterator.next();
            System.out.println("========> " + o);
        }

    }

    @Test
    public void iteratorCollection2() {
        Collection collection = new HashSet();
        collection.add("1");
        collection.add("2");
        collection.add("3");

        for (Object o : collection) {
            System.out.println("========> " + o);
        }


    }


}
