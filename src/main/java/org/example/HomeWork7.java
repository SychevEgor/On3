package org.example;
import java.util.List;
import java.util.Scanner;

public class HomeWork7 {
    public static void main(String[] args) {
        List<String> rolls = List.of("Мама", "Папа", "Сын", "Дочь");

        People h1 = new People("Людмила", 55);
        People h2 = new People("Миша", 55);
        People h3 = new People("Саша", 25);
        People h4 = new People("Даша", 3);
        List<People> famaly = List.of(h1, h2, h3, h4);

        Relationships var = new Relationships();
        var.showRelations(rolls, famaly);


        Scanner scan = new Scanner(System.in);
        System.out.println("Введите цифру от 1 до 4, Где 1- начало древа , 4- конец");
        int nums = Integer.parseInt(scan.nextLine());


        if (nums == 1) {
            Scanner move = new Scanner(System.in);
            System.out.println("Выбранна Людмила\nВведите цифру от 1 до 3,\nГде 1 - вывод информации\nГде 2 - показать родителей\nГде 3 - показать детей");
            int q1 = Integer.parseInt(move.nextLine());
            if (q1 == 1) {
                h1.getInfo();

            } else if (q1 == 2) {
                System.out.println("Это начало древа , родители не найдены");
            } else if (q1 == 3) {
                h1.getChild(rolls, famaly);
            }
        }
        else if (nums == 2)
             {
                Scanner move2 = new Scanner(System.in);
                System.out.println("Введите цифру от 1 до 3");
                int q2 = Integer.parseInt(move2.nextLine());
                if (q2 == 1) {
                    h2.getInfo();

                } else if (q2 == 2) {
                    System.out.println("Это начало древа , родители не найдены");
                } else if (q2 == 3) {
                    h2.getChild(rolls, famaly);
                }
            }
        else if (nums == 3){
            Scanner move3 = new Scanner(System.in);
            System.out.println("Введите цифру от 1 до 3");
            int q3 = Integer.parseInt(move3.nextLine());
            if (q3 == 1) {
                h3.getInfo();

            } else if (q3 == 2) {
                h3.getParrents(rolls, famaly);
            } else if (q3 == 3) {
                System.out.println("У выбранного человека еще нет детей");
            }
        }
        else if (nums == 4) {
            Scanner move4 = new Scanner(System.in);
            System.out.println("Введите цифру от 1 до 3");
            int q4 = Integer.parseInt(move4.nextLine());
            if (q4 == 1) {
                h4.getInfo();

            } else if (q4 == 2) {
                h4.getParrents(rolls, famaly);
            } else if (q4 == 3) {
                System.out.println("У выбранного человека еще нет детей");
            }
        }
    }
}




