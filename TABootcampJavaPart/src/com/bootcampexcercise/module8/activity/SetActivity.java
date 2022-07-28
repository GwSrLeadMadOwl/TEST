package com.bootcampexcercise.module8.activity;

//Needs to be completed

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class SetActivity {

    public static void main(String[] args) {
        SetActivity sa = new SetActivity();
        //TODO: 1 - Type code to create a set of names.
        Set namesSet = new Set() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public Object[] toArray(Object[] a) {
                return new Object[0];
            }

            @Override
            public boolean add(Object o) {
                return true;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection c) {
                return false;
            }

            @Override
            public boolean addAll(Collection c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection c) {
                return false;
            }

            @Override
            public void clear() {

            }
        };
        //Also try adding a few duplicate entries to this set.
        namesSet.add("Disha");
        namesSet.add("Sergei");
        namesSet.add("Viola");
        namesSet.add("Svieta");
        namesSet.add("Gandalf White");

        //TODO: 2 - Call print method to print the set passed as its parameter.
//        SetActivity.print(namesSet);
        sa.print(namesSet);
        System.out.println(namesSet);
    }

    void print(Set set) {
        //TODO: 3 - Type code to print this set
        //Notice the order in which elements get printed.
        for (Object nameOfObject : set) {
            System.out.println(nameOfObject.toString());
        }
//        System.out.println(set);
    }
}