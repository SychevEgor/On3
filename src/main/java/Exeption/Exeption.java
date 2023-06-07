package Exeption;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static org.example.Exeption1.rand;

public class Exeption {
    public static void main(String[] args) {
        System.out.println(""" 
                1. Исключение ArithmeticException
                2. Исключение ArrayIndexOutOfBoundsException 
                3. Исключение NumberFormatException               
                4. Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив, 
                каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке. Если длины массивов не равны, 
                необходимо как-то оповестить пользователя.
                                
                """);
        //1userInput();
        Scanner scan = new Scanner(System.in);
        int cheking = scan.nextInt();

        while (cheking != 0) {
            switch (cheking) {
                case 1 -> {
                    System.out.println("Исключение ArithmeticException");
                    exeption1();

                }
                case 2 -> {
                    System.out.println("Исключение ArrayIndexOutOfBoundsException ");
                    exeption2();
                }
                case  4 ->{
                    userInput();
                    cheking = 0;
                }
                case 3 -> {
                    System.out.println("Исключение NumberFormatException");
                    exeption3();
                }
            }
        }
    }

    public static int exeption1() {
        int a = 1;
        int b = 0;
        return a / b;
    }

    public static int exeption2() {
        int a[] = {1, 2, 3};
        return a[4];
    }

    public static int exeption3() {
        int a = Integer.parseInt(null);
        return a;
    }

    public static int[] createArray(int arraySize) {
        int[] array = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            array[i] = rand.nextInt(255);
        }
        return array;

    }

    public static void CreateUserArray(int[] array1, int[] array2) {
        System.out.println("Первый массив: " + Arrays.toString(array1) + '\n' + "Второй массив: " + Arrays.toString(array2));
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < array1.length; i++) {
            result.add(array1[i] - array2[i]);

        }
        System.out.println("Результат вычитания каждого элемента массивов " + Arrays.toString(new ArrayList[]{result}));

    }

    public static void userInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длинну первого массива");
        int result1 = sc.nextInt();
        System.out.println("Введите длинну второго  массива");
        int result2 = sc.nextInt();


        int[] userarray = createArray(result1);
        int[] userarray2 = createArray(result2);
        if (userarray.length != userarray2.length) {
            System.out.println("Различная длинна массивов, повторите ввод с одинаковой длинной!");
            userInput();
        }
        CreateUserArray(userarray, userarray2);
    }


}

