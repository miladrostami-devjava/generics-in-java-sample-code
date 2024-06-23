package org.example.wrapperwithoutgeneric;

import java.net.Proxy;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WildCardTest {

    public static void main(String[] args) {

      /*  List<Number> numbers  = new ArrayList<>();
        numbers.add(45.90);
        numbers.add(44.3f);
        numbers.add(65.36525);
        numbers.add(2);

        List<? super Integer> listIntegers = numbers;
        listIntegers.add(58);
listIntegers.add(332);
        System.out.println(listIntegers);

        List<Integer> listNumber1 = new ArrayList<>();
        listNumber1.add(33);
        listNumber1.add(58);
         List<? extends Integer> integers = listNumber1;
//         integers.add(87);
        integers.get(1);
        System.out.println(integers);*/


genericPrint("milad");
genericPrint("ali");
genericPrint2(4,34);
    }

    public static  <T> void genericPrint(T data){
        System.out.println(" generice type "+ " " + data) ;
    }
    public static <T> void genericPrint2(T type,T data){
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter amount in input:");
        Integer input = scanner.nextInt();
        if (type.equals(input)){
            System.out.println(data + "is ok");
        }
        System.out.println(" the end");
    }

}
