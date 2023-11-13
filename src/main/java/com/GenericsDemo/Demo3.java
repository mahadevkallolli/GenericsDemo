package com.GenericsDemo;

public class Demo3 {
    public static void main(String[] args) {
        String[] s = new String[12];
        s[0]="Rahul";
        s[1]="Rocky";
        s[2]="Ram";
        //at the time of retrival not required to typecast because there is a guaranty for the type of element/object present in the String array
        String name1= s[0];
        String name2= s[1];
        String name3= s[2];
        System.out.println(name1+"\n"+name2+"\n"+name3);
    }
}
