package com.terrapay.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(-1);
        list.add(5);
        list.add(3);
        list.add(-15);
        list.add(101);
        list.add(2);
        Stream<Integer> stream = list.stream();
       /* Stream filtered=stream.filter(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                System.out.println(integer);
                return integer > 0;
            }
        });*/
        Stream filtered = stream.filter((Integer i) -> {
            return i > 0;
        }).sorted();

        List<Integer> finalValue = (List<Integer>) filtered.collect(Collectors.toList());
        System.out.println(finalValue);

    }

}
