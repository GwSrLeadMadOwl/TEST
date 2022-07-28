package com.bootcampexcercise.module8.activity;

//Needs to be completed

import java.util.HashSet;
import java.util.Set;

public class SetActivity {

    public static void main(String[] args) {
        SetActivity sa = new SetActivity();
        //TODO: 1 - Type code to create a set of names.
        HashSet namesSet = new HashSet();
        //Also try adding a few duplicate entries to this set.
        namesSet.add("Disha");
        namesSet.add("Sergei");
        namesSet.add("Viola");
        namesSet.add("Svieta");
        namesSet.add("Gandalf White");

        //TODO: 2 - Call print method to print the set passed as its parameter.
//        SetActivity.print(namesSet);
        sa.print(namesSet);
//        System.out.println(namesSet);
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