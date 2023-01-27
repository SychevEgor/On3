package org.example;
import java.util.Random;
import java.util.Scanner;
public class HomeWork1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите Номер задачи от 1 до 3");
        String task = scan.nextLine();
        int taskInt = Integer.parseInt(task);
        if (taskInt == 1) ex1();
        else if (taskInt == 2) ex2();
        else ex3();
    }

    private static void ex1() {
        Random random = new Random();

        int[] nums = new int[random.nextInt(5, 10)];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(1, 11);
            System.out.printf(nums[i] + " ");
        }
        System.out.println();

        int max = nums[0];
        int min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            } else if (nums[i] < min) {
                min = nums[i];
            }
        }

        System.out.printf("В данном массиве максимальное =  %d, а минимальное = %d", max, min);

    }
    private static void ex2() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите год");
        String year = scan.nextLine();
        int ourYearInInt = Integer.parseInt(year);
        boolean question;

        if (ourYearInInt % 100 != 0) {
            question = ourYearInInt % 4 == 0;
        } else question = ourYearInInt % 400 == 0;

        System.out.println(question);
    }
    private static void ex3() {
       Random random = new Random();

        int[] nums = new int[random.nextInt(5, 10)];
        System.out.println("Создан массив: ");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(1, 4);
            System.out.printf(nums[i] + " ");
        }

        Scanner scan = new Scanner(System.in);
        System.out.println("\nВведите число");
        String val = scan.next();

        int numVal = Integer.parseInt(val);
        int leftIndex = 0;
        int rightIndex = nums.length - 1;

        while (leftIndex < rightIndex) {
            if (nums[leftIndex] == numVal & nums[rightIndex] != numVal) {
                int c = nums[leftIndex];
                nums[leftIndex] = nums[rightIndex];
                nums[rightIndex] = c;
                leftIndex++;
                rightIndex--;
            } else if (nums[leftIndex] != numVal) {
                leftIndex++;
            } else if (nums[rightIndex] == numVal) {
                rightIndex--;
            }
        }

        for (int num : nums) {
            System.out.printf(num + " ");
        }
        System.out.println();
    }
}