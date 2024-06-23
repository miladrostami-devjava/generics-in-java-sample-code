package org.example;

import org.example.wrapperwithoutgeneric.CalculatorDemoImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Result!" );
        CalculatorDemoImpl service = new CalculatorDemoImpl();
        Integer result = (Integer) service.add(33,22);
        int result2 = (int) service.add(33.2,32.43);
        System.out.println(result2);





    }
}
