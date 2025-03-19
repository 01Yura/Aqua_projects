package data_structure.preparing.hashSet;

import java.util.HashSet;

public class TenRandomNumbers {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        while (hashSet.size() < 10) {
            hashSet.add((int) (Math.random() * 10));

        }
        System.out.println(hashSet);

    }
}
