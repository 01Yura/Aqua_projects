package practice_6.stream_api;

import java.util.ArrayList;
import java.util.List;

//5. Удаление дубликатов из списка

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(4);
        list.add(5);
        list.add(3);
        list.add(1);
        System.out.println(list);

        list = list.stream().distinct().toList();
        System.out.println(list);
    }
}
