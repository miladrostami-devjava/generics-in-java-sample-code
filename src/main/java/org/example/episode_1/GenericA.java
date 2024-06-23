package org.example.episode_1;

public class GenericA<T> {
private T member;
    public static <T extends Comparable> Integer compareTo(T t1,T t2){
        if (t1 == t2){
         return null;
        }
        return t1.compareTo(t2);
    }

}
