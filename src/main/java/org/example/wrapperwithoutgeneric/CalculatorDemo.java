package org.example.wrapperwithoutgeneric;

public interface CalculatorDemo <T extends Number>{
    T add (T input_one,T input_two );
    T subs (T input_one,T input_two);
    T divide (T input_one,T input_two);
    T multiple (T input_one,T input_two);

}
