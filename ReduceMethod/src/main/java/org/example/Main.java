package org.example;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 7, 8, 1, 5, 9);
        //print all number by using the map function

        numbers.stream().forEach(System.out::println);

        //here using reduce method to sum all the numbers

        Integer sum = numbers.stream().reduce(0,(a,b)->a+b);
        System.out.println("sum "+sum);

        //this also return the same output without the initial value
        System.out.println("without the initial value for counting sum");
        Integer sum3 = numbers.stream().reduce(0,(a,b)->a+b);
        System.out.println("sum "+sum3);

        System.out.println("without initial value");
        //for each individual sum print using this, without adding the first element with the initial value
        numbers.stream()
                .reduce((a, b) -> {
                    int sum1 = a + b;
                    System.out.println(sum1);
                    return sum1;
                });
        System.out.println("with initial value");

        //for each individual sum print using this,  adding the first element with the initial value
        //here 0 is the initial value
        numbers.stream().reduce(0,(a,b)->{
            int sum1 = a+b;
            System.out.println(sum1);
            return sum1;
        });

        //now sum those numbers which is greater than 3.
        //in this circumstances we need to use filter method for filtering this logic.
        System.out.println("filter sum");
        int filterSum = numbers.stream().filter(a->a>3).reduce((a, b)->a+b).get();
        System.out.println(filterSum);
    }
}