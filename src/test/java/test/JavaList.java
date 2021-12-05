package test;

import com.java.collection.domain.Car;
import com.java.collection.domain.Member;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Stream;

public class JavaList {

    @Test
    public void ListType() {

        //List 에는 다양한 인터페이스가 존재함.
        List listA = new ArrayList();  // 자주사용
        List listB = new LinkedList();
        List listC = new Vector();
        List listD = new Stack();

        List<Member> list = new ArrayList<Member>();

        list.add(new Member("kwan"));
        list.add(1, new Member("test"));

        Member member = (Member) list.get(0);
        System.out.println("=======1> " + member.getName());

        for (Object object : list) {
            Member member1 = (Member) object;
            System.out.println("=======2>" + member1.getName());
        }

    }

    @Test
    public void ListArray() {
        List listA = new ArrayList();

        listA.add("element 1 ");
        listA.add("element 2 ");
        listA.add("element 3 ");
        listA.add("element 4 ");
        listA.add("element 2 ");

        Object o = null;

        List<Object> list = new ArrayList<>();

        // listA 전체를 추가함.
        list.addAll(listA);

        System.out.println(list);

        list.add(o);
        System.out.println(list);

        // index 를 찾음
        System.out.println(list.indexOf("element 4 "));
        // element 2 의 마지막 index를 찾음
        System.out.println(list.lastIndexOf("element 2 "));

        // list에 포함된 요소 확인
        boolean testContain = list.contains("element 2 ");
        System.out.println(testContain);

        list.add(null);
        System.out.println(list.contains(null));

        // list 초기화
        list.clear();
        System.out.println(list.size());
    }

    @Test
    public void ListSet() {
        List<String> list = new ArrayList();

        list.add("test 1");
        list.add("test 2");
        list.add("test 3");
        list.add("test 4");
        list.add("test 4");

        // list의 중복 제거
        Set<String> set = new HashSet();
        set.addAll(list);

        System.out.println(set);

    }

    @Test
    public void listConvertArr() {
        // 리스트를 배열로 변환
        List<String> list = new ArrayList<>();

        list.add("test 1");
        list.add("test 2");
        list.add("test 3");
        list.add("test 3");

        String[] values = list.toArray(new String[0]);

        for (int i = 0; i < values.length; i++) {
            String s = values[i];
            System.out.println(s);
        }

    }

    @Test
    public void arrConvertList() {
        //배열을 리스트로 변환
        String[] values = new String[]{"test 1", "test 2", "test 3"};

        List<String> list = Arrays.asList(values);

        System.out.println(list);
    }

    @Test
    public void sortList() {
        List<String> list = new ArrayList<>();
        list.add("test 3");
        list.add("test 1");
        list.add("test 4");
        list.add("test 3");

        Collections.sort(list);

        System.out.println(list);
    }

    @Test
    public void sortListComparator() {
        List list = new ArrayList();

        list.add(new Car("Volvo V40", "XYZ 201845", 5));
        list.add(new Car("Citroen C1", "ABC 164521", 4));
        list.add(new Car("Dodge Ram", "KLM 845990", 2));

        Comparator<Car> carComparator = new Comparator<Car>() {

            @Override
            public int compare(Car o1, Car o2) {
                return o1.brand.compareTo(o2.brand);
            }

        };

        Collections.sort(list, carComparator);

        System.out.println(list);


        Comparator<Car> carBrandComparatorLambda =
                (car1, car2) -> car1.brand.compareTo(car2.brand);

        Comparator<Car> carNumberPlatComparatorLambda =
                (car1, car2) -> car1.numberPlate.compareTo(car2.numberPlate);

        Comparator<Car> carNoOfDoorsComparatorLambda =
                (car1, car2) -> car1.noOfDoors - car2.noOfDoors;

        Collections.sort(list, carBrandComparatorLambda);
        Collections.sort(list, carNumberPlatComparatorLambda);
        Collections.sort(list, carNoOfDoorsComparatorLambda);

        Iterator<Car> iterator = list.iterator();

        while (iterator.hasNext()) {
            Car n = iterator.next();
            System.out.println(n.toString());
        }

        System.out.println(list);
    }

    @Test
    public void listIterator() {
        List list = new ArrayList();

        list.add("first");
        list.add("second");
        list.add("third");

        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
        }

    }

    @Test
    public void iterateStream() {
        List<String> list = new ArrayList<>();

        list.add("test 3");
        list.add("test 1");
        list.add("test 4");
        list.add("test 3");

        //  람다를 사용하여 데이터를 꺼냄냄
       Stream<String> stream = list.stream();

        stream.forEach(element -> {
            System.out.println(element);
        });


    }


}
