package com.terrapay.streams;

import java.util.*;

public class NewStringMethods {
    public static void main(String[] args) {
        String s1="Terra pay";
        String s2= s1.repeat(12);
        System.out.println(s2);

        //convert Collections to Array
        List<String>list=new ArrayList<>();
        list.add("Hey");
        list.add("world");
        Object[] li=  list.toArray();
        System.out.println(Arrays.toString(li));


    }
}
