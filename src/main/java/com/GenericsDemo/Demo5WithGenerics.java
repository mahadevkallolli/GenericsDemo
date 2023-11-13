package com.GenericsDemo;

import java.util.ArrayList;

//to overcome from the previous problems we can use Generics concept
public class Demo5WithGenerics {
    public static void main(String[] args) {
        //in this ArrayList we can add only String type of Objects
        ArrayList<String> l= new ArrayList<>();
        l.add("Rahul");
        l.add("Arohi");
        //l.add(120);//compile time error:we can't add objects other than String type
        l.add("Ram");
        System.out.println(l);
//Hence Through Generics we are getting type-safety and at the time of retrival we are
// not required to ty-cast
        System.out.println("============type casting is not required===========");
        String name1=l.get(0);
        String name2=l.get(1);
        String name3=l.get(2);
        System.out.println(name1+"\n"+name2+"\n"+name3);
    }

}
