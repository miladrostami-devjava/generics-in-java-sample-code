package org.example.wrapperwithoutgeneric;

public class Wrapper {
    private Object value;

    public Wrapper() {
    }

    public Wrapper(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
