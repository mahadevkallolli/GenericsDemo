package com.GenericsDemo;

import java.util.ArrayList;
//without generics
public class Demo4 {
    public static void main(String[] args) {
        ArrayList l = new ArrayList();
        l.add("Garuda");
        l.add("Rocky");
        l.add("Reena");
        //type-casting is compulsory in collections because we don't know type of element present inside the collections and collections can hold Heterogeneous object
        //String name=l.get(0);//compile time error:java: incompatible types: java.lang.Object cannot be converted to java.lang.String
        String name1= (String) l.get(0);
        String name2= (String) l.get(1);
        String name3= (String) l.get(2);
        System.out.println("List: "+l);
        System.out.println("========After type-cast==========");
        System.out.println(name1+"\n"+name2+"\n"+name3);

    }
}
