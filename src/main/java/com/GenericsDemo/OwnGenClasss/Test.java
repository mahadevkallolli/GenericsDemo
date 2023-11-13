package com.GenericsDemo.OwnGenClasss;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
       // List l= Arrays.asList("mk","rk","bk");
       /* OurOwnGenericsClass<String> g1=new OurOwnGenericsClass<>("rahul");
        g1.show();
        System.out.println(g1.getOb());
        System.out.println("=============Integer type===================");
        OurOwnGenericsClass<Integer> g2=new OurOwnGenericsClass<>(1001);
        g1.show();
        System.out.println(g1.getOb());
        System.out.println("=================Double Type=======================");
        OurOwnGenericsClass<Double> g3=new OurOwnGenericsClass<>(222.333);
        g1.show();
        System.out.println(g1.getOb());*/

       Employee employees = new Employee(1001,"rahul");

        OurOwnGenericsClass<Employee> e=new OurOwnGenericsClass<Employee>(employees);
        e.show();
        System.out.println(e.getOb());

    }
}
