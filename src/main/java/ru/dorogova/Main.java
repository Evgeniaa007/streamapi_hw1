package ru.dorogova;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(15, 2, 8, 9, 12, 9, 22);
        OptionalDouble meanEven = list.stream()
                .filter(number -> number%2 == 0)
                .mapToDouble(Integer::doubleValue).average();
        double res = meanEven.getAsDouble();
        if(res == 0){
            System.out.println("Нет чётных чисел в списке");
        }
        else {
            System.out.println("Среднее значение чётных чисел в списке - " + res);
        }
    }
}