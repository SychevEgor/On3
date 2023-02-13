package org.example;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import java.util.ArrayList;

public class HomeWork6 {
    public static void main(String[] args) {
        Random rand = new Random();
        notemook l1 = new notemook(rand.nextInt(100_000, 999_999), 1000, "black", false, true, rand.nextInt(1000, 2000));
        notemook l2 = new notemook(rand.nextInt(100_000, 999_999), 1000, "blue", true, true, rand.nextInt(1000, 2000));
        notemook l3 = new notemook(rand.nextInt(100_000, 999_999), 1000, "white", true, true, rand.nextInt(1000, 2000));
        notemook l4 = new notemook(rand.nextInt(100_000, 999_999), 1000, "white", false, false, rand.nextInt(1000, 2000));
        notemook l5 = new notemook(rand.nextInt(100_000, 999_999), 1000, "black", true, false, rand.nextInt(1000, 2000));
        notemook l6 = new notemook(rand.nextInt(100_000, 999_999), 1000, "gray", false, true, rand.nextInt(1000, 2000));
        notemook l7 = new notemook(rand.nextInt(100_000, 999_999), 1000, "black", true, false, rand.nextInt(1000, 2000));
        notemook l8 = new notemook(rand.nextInt(100_000, 999_999), 1000, "blue", false, true, rand.nextInt(1000, 2000));
        notemook l9 = new notemook(rand.nextInt(100_000, 999_999), 1000, "white", true, true, rand.nextInt(1000, 2000));
        notemook l10 = new notemook(rand.nextInt(100_000, 999_999), 1000, "black", false, true, rand.nextInt(1000, 2000));
        List<notemook> notebok = List.of(l1, l2, l3, l4, l5, l6, l7, l8, l9, l10);

        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("""
                   Цифра 1 - вывод всех моделей
                   Цифра 2 - фильрация цены
                   Цифра 3 - выход
                    """);
            String input = scan.nextLine();
            switch (input) {
                case ("1") -> {
                    for (notemook notemook : notebok) {
                        System.out.println("Ноутбук № " + (notebok.indexOf(notemook) + 1));
                        notemook.getInfo();
                        System.out.println();

                    }
                }
                case ("2") -> {
                    System.out.println("Введите минимальную цену ноутбука (1000$ - 3000$)");
                    int min = scan.nextInt();
                    System.out.println("Введите максимальную цену ноутбука (1000$ - 3000$)");
                    int max = scan.nextInt();

                    for (notemook notemook : notebok) {
                        if (notemook.getPrice() >= min && notemook.getPrice() <= max ) {
                            System.out.println("Ноутбук № " + (notebok.indexOf(notemook) + 1));
                            notemook.getInfo();
                            System.out.println();
                        }


                    }
                }
                case ("3") -> System.exit(0);
            }
        }
    }
}
