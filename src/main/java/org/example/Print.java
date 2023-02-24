package org.example;

import java.util.List;
import java.util.Scanner;

public interface Print {
    default void checkNumsEqualsOne(List<String> rolls, List<People> famalyOneOnList, Integer
            nums, FamalyOne p1) {
        if (nums == 1) {
            Scanner move = new Scanner(System.in);
            System.out.println("Выбранна Людмила\nВведите цифру от 1 до 3,\nГде 1 - вывод информации\nГде 2 - показать родителей\nГде 3 - показать детей");
            int q1 = Integer.parseInt(move.nextLine());
            if (q1 == 1) {
                p1.getInfo();

            } else if (q1 == 2) {
                System.out.println("Это начало древа , родители не найдены");
            } else if (q1 == 3) {
                p1.getChild(rolls, famalyOneOnList);
            }
        }

    }
    default void checkNumsEqualsTwo(List<String> rolls, List<People> famalyOneOnList, Integer
            nums, FamalyOne p1) {
        if (nums == 2) {
            Scanner move2 = new Scanner(System.in);
            System.out.println("Введите цифру от 1 до 3,\nГде 1 - вывод информации\nГде 2 - показать родителей\nГде 3 - показать детей");
            int q2 = Integer.parseInt(move2.nextLine());
            if (q2 == 1) {
                p1.getInfo();

            } else if (q2 == 2) {
                System.out.println("Это начало древа , родители не найдены");
            } else if (q2 == 3) {
                p1.getChild(rolls, famalyOneOnList);
            }
        }
    }
    default void checkNumsEqualsThree(List<String> rolls, List<People> famalyOneOnList, Integer
            nums, FamalyOne p1) {
        if (nums == 3) {
            Scanner move3 = new Scanner(System.in);
            System.out.println("Введите цифру от 1 до 3,\nГде 1 - вывод информации\nГде 2 - показать родителей\nГде 3 - показать детей");
            int q3 = Integer.parseInt(move3.nextLine());
            if (q3 == 1) {
                p1.getInfo();

            } else if (q3 == 2) {
                p1.getParrents(rolls, famalyOneOnList);
            } else if (q3 == 3) {
                System.out.println("У выбранного человека еще нет детей");
            }
        }
    }
    default void checkNumsEqualsFour(List<String> rolls, List<People> famalyOneOnList, Integer
            nums, FamalyOne p1) {
        if (nums == 4) {
            Scanner move3 = new Scanner(System.in);
            System.out.println("Введите цифру от 1 до 3,\nГде 1 - вывод информации\nГде 2 - показать родителей\nГде 3 - показать детей");
            int q3 = Integer.parseInt(move3.nextLine());
            if (q3 == 1) {
                p1.getInfo();

            } else if (q3 == 2) {
                p1.getParrents(rolls, famalyOneOnList);
            } else if (q3 == 3) {
                System.out.println("У выбранного человека еще нет детей");
            }
        }
    }
}

