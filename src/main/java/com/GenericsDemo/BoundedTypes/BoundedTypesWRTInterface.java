package com.GenericsDemo.BoundedTypes;

public class BoundedTypesWRTInterface<Emp extends Runnable> {
    public static void main(String[] args) {
        BoundedTypesWRTInterface<Runnable> WRTI= new BoundedTypesWRTInterface<>();
        BoundedTypesWRTInterface<Thread> WRTI2= new BoundedTypesWRTInterface<>();
        //BoundedTypesWRTInterface<String> WRTI3= new BoundedTypesWRTInterface<>();//invalid


    }
}
