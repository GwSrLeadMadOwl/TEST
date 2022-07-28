package com.bootcampexcercise.module8.activity;

//Needs to be completed

import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

public class ListActivity {

    public static void main(String[] args) {
        //TODO: 1 - Type code to create a list of names. Use ArrayList.
        List list = new ArrayList();
        //TODO: 2 - Call print method to print the list passed as its parameter.
        list.add("Disha");
        list.add("Viola");
        list.add("Gandalf White");

        ListActivity arr = new ListActivity();
        arr.print(list);
    }

    void print(List list)
    {
        //TODO: 3 - Type code to print this list
        //Notice the order in which elements get printed.
//Iterator is an interface which provides a uniform way to access
        //individual elements of a Collection

        //2 - Use Iterator to iterate over this list.
        Iterator<Object> nameOfIterator = list.iterator();
//        System.out.println("*** Work of iterator ***");
//        while (nameOfIterator.hasNext()) {
//            System.out.println(nameOfIterator.next());
//        }

//        System.out.println("*** Work of for loop ***");
        for (Object nameOfMyObject : list) {
            System.out.println(nameOfMyObject.toString());
        }
    }
}
