package test;

import org.junit.jupiter.api.Test;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.stream.Stream;

public class JavaStack {

    @Test
    public void javaStackTest() {
        //  한 쪽 끝에서만 자료(데이터)를 넣고 뺄 수 있는 형식의 자료 구조
        //  가장 나중에 들어간 데이터가 맨 처음 데이터
        Stack<String> stack = new Stack();
        stack.push("1");    // 데이터 추가
        stack.push("2");
        stack.push("3");
        stack.push("4");

        String top = stack.pop();  // 최근에 추가된(Top) 데이터 삭제
        System.out.println(top);

        String top1 = stack.peek(); // 최근에 추가된(Top) 데이터 조회
        System.out.println(top1);

        boolean check = stack.empty();  // stack 에 값이 비어 있는지 확인
        System.out.println(check);

        int index = stack.search("1");  //  stack 의 값의 순서를 반환
        System.out.println(index);

        //
        Iterator<String > iterator = stack.iterator();

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        Stream stream = stack.stream();
        stream.forEach(value -> System.out.println(value));

    }

    @Test
    public void javaReverse() {
        List<String> list = new LinkedList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");

        Stack<String> stack = new Stack<>();

        while (list.size() > 0) {
            stack.push(list.remove(0));
        }

        while (stack.size() > 0) {
            list.add(stack.pop());
        }

        System.out.println(list);

    }

}
