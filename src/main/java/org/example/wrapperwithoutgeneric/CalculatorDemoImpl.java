package org.example.wrapperwithoutgeneric;

public class CalculatorDemoImpl implements CalculatorDemo{

    @Override
    public Number add(Number input_one, Number input_two) {
        Integer sum = input_one.intValue() + input_two.intValue();
        return sum;
    }

    @Override
    public Number subs(Number input_one, Number input_two) {
        Integer sub = input_one.intValue() - input_two.intValue();
        return sub;
    }

    @Override
    public Number divide(Number input_one, Number input_two) {
        Integer div = input_one.intValue() / input_two.intValue();
        return div;
    }

    @Override
    public Number multiple(Number input_one, Number input_two) {
        Integer multi = input_one.intValue() * input_two.intValue();
        return multi;
    }
}
