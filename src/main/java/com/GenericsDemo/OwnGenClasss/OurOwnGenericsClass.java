package com.GenericsDemo.OwnGenClasss;

public class OurOwnGenericsClass<T> {

    T ob;
    OurOwnGenericsClass(T ob){
        this.ob=ob;
    }
    public void show(){
        System.out.println("The type of oject : "+ob.getClass().getName());
    }

    public T getOb() {
        return ob;
    }
}
