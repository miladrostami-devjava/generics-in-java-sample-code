package org.example.wrapperwithoutgeneric;

import java.util.Scanner;

public class GenericsClazz <T extends Number>{
    private T amount;

    public GenericsClazz() {
    }

    public GenericsClazz(T amount) {
        this.amount = amount;
    }

    public T getAmount() {
        return amount;
    }

    public void setAmount(T amount) {
        this.amount = amount;
    }

    public int intValue() {
        return amount.intValue();
    }

    public long longValue() {
        return amount.longValue();
    }

    public float floatValue() {
        return amount.floatValue();
    }

    public double doubleValue() {
        return amount.doubleValue();
    }

    public byte byteValue() {
        return amount.byteValue();
    }

    public short shortValue() {
        return amount.shortValue();
    }

    @Override
    public String toString() {
        return "GenericsClazz{" +
                "amount=" + amount +
                '}';
    }

    public static  <T> Boolean compareDouble(T number){
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter amount in input:");
        Double input = scanner.nextDouble();
        boolean output = number.equals(input);
     if (!output){
         System.out.println(" is not correct");
         return false;
     }
        System.out.println("number is " + number  + " " + output);
     return output ;
    }

    public static void main(String[] args) {
        compareDouble(44.3);
    }


}
