package org.example.episode_3;

public class GenericC <T extends Comparable<T>>{
    private T data;
    private GenericC<T> next;

    public GenericC(T data, GenericC<T> next) {
        this.data = data;
        this.next = next;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public GenericC<T> getNext() {
        return next;
    }

    public void setNext(GenericC<T> next) {
        this.next = next;
    }
}
