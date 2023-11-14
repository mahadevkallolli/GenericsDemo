package com.GenericsDemo.MixedBoundedTpessClassAndInterface;

public interface Test<T extends  Number&Runnable> {
    public static void main(String[] args) {
        System.out.println("Test<T extends  Number&Runnable>");
    }
}
