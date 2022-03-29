package com.terrapay;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;



public class LambdaUsage {
    public static void main(String[] args) {
        List<Integer>list=new ArrayList<>();
        list.add(10);
        list.add(5);
        list.forEach(System.out::println);
        System.out.println("----------sorting------------");
      /*  list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });*/
       list.sort((Integer o1, Integer o2)->{
           return o1.compareTo(o2);
           //return o1 - o2;
       });
        list.forEach((Integer element) -> {
            System.out.println(element);
        });
    }
}
