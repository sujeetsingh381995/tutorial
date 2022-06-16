package com.ziletech.generics;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Vector;

public class GenericMain {

    public static void main(String[] args) {
        Vector<Integer> store = new Vector<>(5);
        store.add(10);
        store.add(20);
        store.add(30);
//        store.print();

        MyArrayList<String> storeAlpha = new MyArrayList<>(3);
        storeAlpha.add("A");
        storeAlpha.add("B");
        storeAlpha.add("C");
//        storeAlpha.print();

        for(String item : storeAlpha){
            System.out.println(item);
        }

    }

}

class MyArrayList<T> implements Iterable<T>{

    private final Object[] items;
    private int size;

    public MyArrayList(int size){
        items = new Object[size];
    }

    public void add(T item){
        if(size > items.length -1){
            throw new SizeOverflowException("Valid size is " + size);
        }
        items[size] = item;
        size++;
    }

    public void print(){
        for (int i = 0; i < size; i++) {
            System.out.println(items[i]);
        }
    }

    public int size(){
        return this.size;
    }

    @Override
    public Iterator<T> iterator() {

        return new Iterator<T>() {
            int currentIndex = 0;
            public boolean hasNext() {
                return currentIndex < size;
            }

            public T next() {
                T t = (T) items[currentIndex];
                currentIndex++;
                return t;
            }
        };
    }
}

class SizeOverflowException extends RuntimeException{

    public SizeOverflowException(String message) {
        super(message);
    }
}