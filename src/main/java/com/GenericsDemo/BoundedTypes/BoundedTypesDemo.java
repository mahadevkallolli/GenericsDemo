package com.GenericsDemo.BoundedTypes;

public class BoundedTypesDemo<T extends Number> {

    public static void main(String[] args) {

        BoundedTypesDemo<Number> t= new BoundedTypesDemo<>();
        //we cant do this because String is not a child class of Number
       // BoundedTypesDemo<String> t2= new BoundedTypesDemo<String>();


    }
}
