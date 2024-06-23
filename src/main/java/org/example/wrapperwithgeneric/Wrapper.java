package org.example.wrapperwithgeneric;

public class Wrapper< T,N extends Number,P> {
    private T value;
    private N number;
    private P parameter;

    public Wrapper() {
    }

    public Wrapper(T value) {
        this.value = value;
    }
    public <U extends T> Wrapper(T t,U u , P p){
        this.value = t;
        this.number = (N) u;
        this.parameter = p;
    }

    public <S> String sGet(S s,T t) throws InterruptedException {
        if (s.equals("ir")){
            return "ei";
        }
        while (true){
            t.getClass().getName();
            s.wait();

        }
    }

    public static <B> void  getB(B b){

    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public <V> void  getValueMethod(V typeMethod,V nameMethod){
        System.out.println(typeMethod.equals(nameMethod) + " " + 45 + " is ok");
    }

    // this is not correct
//    public static T getInt(T getValue, N num, Boolean b){
//
//    }



}
