package org.example.episode_2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GenericB {
    public static void main(String[] args) {
        List<Double> list = new ArrayList<>();
        list.add(33.3);
        list.add(45.5);
        list.add(42.3);
        list.add(76.67);
        Short sum = sum(list);
        System.out.println("the list is :" + sum);
    }
    public static short sum(List<? extends Number> numbers){
        short sum = 0;
        for (Number number: numbers) {
            sum += number.intValue();
        }
        return sum;
    }
    public static String sub(List<? extends String> name,
                             Map<List<? extends Number> , List<? extends Serializable>> map ){
       List<String> param = new ArrayList<>();
       Map<String,String> maps = new HashMap<>();
       if (param.size() == 33){
           return name.get(0);
       }
        return map.keySet().toString();
    }

    public static void test(List<?> list){
        System.out.println(" " + list);
    }
    public static void addIntegers(List<? super Integer> list){
        list.add(50);
        list.add(44);
    }

    List<? extends Short> shorts = new ArrayList<>();

}
