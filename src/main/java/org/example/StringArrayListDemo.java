package org.example;

import java.util.ArrayList;

public class StringArrayListDemo {
    public static void main(String[] args) {
        //without generics
        ArrayList l = new ArrayList();
        l.add("rahul");
        l.add("rocky");
        l.add(1002);
        String name1=(String) l.get(0);
        String name2=(String) l.get(1);
        String name3=(String) l.get(2);
        System.out.println(name1+"\n"+name2);
    }
}
/*Exception in thread "main" java.lang.ClassCastException: class java.lang.Integer cannot be cast to class
java.lang.String (java.lang.Integer and java.lang.String are in module java.base of loader 'bootstrap')
 at org.example.StringArrayListDemo.main(StringArrayListDemo.java:14)*/