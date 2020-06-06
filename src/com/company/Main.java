package com.company;

public class Main {

    public static void main(String[] args) {
        Myiteratorimp myiteratorimp = new Myiteratorimp();
        myiteratorimp.addobject("aaa");
        myiteratorimp.addobject("bbb");
        myiteratorimp.addobject("ccc");
        Myiterator iter = myiteratorimp.createit();
        while (iter.hasnext()){
            System.out.println(iter.get());
            iter.next();
        }

    }
}
