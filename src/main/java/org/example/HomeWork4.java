package org.example;
import java.util.*;

public class HomeWork4 {
    public static void main(String[] args) {
        while (true) {
            System.out.println("""
                    Список задач:
                    1. Реализовать консольное приложение, которое:
                    Принимает от пользователя и “запоминает” строки.
                    Если введено print, выводит строки так, чтобы последняя введенная была первой в списке,\s
                    а первая - последней.
                    Если введено revert, удаляет предыдущую введенную строку из памяти.
                    
                    2. Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет\s
                    “перевернутый” список.
                    
                    Введите 0 для выхода из программы.
                    """);

            Scanner scan = new Scanner(System.in);
            System.out.println("Введите номер задачи");
            String number = scan.next();
            switch (number) {
                case "1" -> ex1();
                case "2" -> ex2();
                default -> System.exit(0);
            }
        }
    }

    private static void ex1() {
        Deque<String> thisIsOurString = new ArrayDeque<>();
        Scanner cheking = new Scanner(System.in);
        while (true){
            System.out.println("""
                               Вводите строки через Enter, чтобы вывести результат - Напишите "print". Для удаления предыдущей строки введите "revert" .
                               Введите 0, чтобы вернуться к выбору задачи.
                               """);

            String str = cheking.nextLine();
            switch (str) {
                case "print" -> {
                    if (thisIsOurString.isEmpty()) {
                        System.out.println("Список пуст");
                    } else {
                        System.out.println(thisIsOurString);
                    }
                }
                case "revert" -> {
                    try {
                        thisIsOurString.removeFirst();
                    } catch (Exception e) {
                        System.out.println("Из пустого списка, не чего удалить.");
                    }
                }
                case "0" -> {
                    return;
                }
                default -> thisIsOurString.addFirst(str);
            }
        }
    }

    private static void ex2() {
        while(true){
            Random rang = new Random();
            int size = rang.nextInt(4, 11);
            LinkedList<Integer> thisIsOurList = new LinkedList<>();
            System.out.println("Создан список:");
            for (int i = 0; i < size; i++) {
                thisIsOurList.add(rang.nextInt(-100, 101));
            }
            System.out.println(thisIsOurList);

            if (size % 2 == 1){
                for (int i = 0; i < size / 2; i++) {
                    int buf1 = thisIsOurList.get(i);
                    int buf2 = thisIsOurList.get(size - i - 1);
                    thisIsOurList.set(i, buf2);
                    thisIsOurList.set(size - i - 1, buf1);
                }
            } else {
                for (int i = 0; i < size / 2; i++) {
                    int buf1 = thisIsOurList.get(i);
                    int buf2 = thisIsOurList.get(size - i - 1);
                    thisIsOurList.set(i, buf2);
                    thisIsOurList.set(size - i - 1, buf1);
                }
            }
            System.out.println("Перевернутый список:");
            System.out.println(thisIsOurList);

            System.out.println("Введите 0 для возврата к выбору задачи и что угодно для повтора этой программы:");
            Scanner cheking = new Scanner(System.in);
            String command = cheking.next();
            if (command.equals("0")) {
                return;
            }
        }



    }
}