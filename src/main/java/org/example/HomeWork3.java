package org.example;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите Номер задачи от 1 до 2");
        String task = scan.nextLine();
        int taskInt = Integer.parseInt(task);
        if (taskInt == 1) ex1();
        else  ex2();
    }
    private static void ex1(){
        Random rang = new Random();
        int size = rang.nextInt(6, 11);
        ArrayList<Integer> list = new ArrayList<>(size);
        System.out.println("Создаем  список: ");
        for (int i = 0; i < size; i++) {
            list.add(rang.nextInt(0, 5));
            System.out.printf("%s ", list.get(i));
        }

        list.removeIf(num -> num % 2 == 0);
        System.out.println();

        System.out.println("Список без четных чисел: ");
        for (Integer i: list) {
            System.out.printf("%s ", i);
        }
        System.out.println();
    }

    private static void ex2() {
        Random rang = new Random();
        int size = rang.nextInt(6, 11);
        ArrayList<Integer> list = new ArrayList<>(size);
        System.out.println("Создаем список: ");
        for (int i = 0; i < size; i++) {
            list.add(rang.nextInt(0, 50));
            System.out.printf("%s ", list.get(i));
        }
        System.out.println();

        double srarf = 0;
        int max = list.get(0);
        int min = list.get(0);

        for (Integer i: list) {
            srarf += i;
            if (min > i) {
                min = i;
            } else if (max < i) {
                max = i;
            }
        }
        srarf = srarf / list.size();
        System.out.printf("Минимальное значение = %d \nМаксивальное значение = %d\nСреднее арифметическое = %.2f \n", min, max, srarf);
    }
}