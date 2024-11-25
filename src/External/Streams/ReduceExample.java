package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);

        final Integer sum = list.stream()
                .reduce(0, Integer::sum);

        String reduce = list.stream()
                .map(String::valueOf)
                        .reduce((s1,s2) -> s1 + "*" + s2).orElse("");
        System.out.println(sum);
        System.out.println(reduce);
    }
}
