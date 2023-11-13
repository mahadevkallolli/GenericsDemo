package com.GenericsDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> l= new ArrayList<>();
        l.add("Rahul");
        System.out.println(l);
        List<String> l2=new ArrayList<>();
        l2.add("Rocky");
        System.out.println(l2);
        Collection<String> c= new ArrayList<>();
        c.add("rahul");
        System.out.println(c);
       // ArrayList<Objects> l3= new ArrayList<String>();//cant do like this

    }
}
