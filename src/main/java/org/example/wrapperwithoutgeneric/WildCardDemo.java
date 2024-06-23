package org.example.wrapperwithoutgeneric;

import org.example.wrapperwithgeneric.Wrapper;
import sun.nio.fs.ExtendedOptions;

public class WildCardDemo {

    public static void main(String[] args) {
        Wrapper<String,Integer,Boolean> stringIntegerBooleanWrapper =
                new Wrapper<>("hello");
        System.out.println(stringIntegerBooleanWrapper.getValue());
printValue("obj");
    }

    public static void printValue(Object obj){
        obj.toString();
    }



}
