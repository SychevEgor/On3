package org.example;

import java.util.List;
import java.util.Scanner;

public class StartMenuRun implements Print {
    public void MenuOf(List<String> rolls, List<People> famalyOneOnList) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите цифру от 1 до 4, Где 1- начало древа , 4- конец");
        int nums = Integer.parseInt(scan.nextLine());

        switch (nums) {
            case 1 -> {
                FamalyOne one = (FamalyOne) famalyOneOnList.get(0);
                checkNumsEqualsOne(rolls, famalyOneOnList, nums, one);
            }
            case 2 -> {
                FamalyOne two = (FamalyOne) famalyOneOnList.get(1);
                checkNumsEqualsTwo(rolls, famalyOneOnList, nums, two);

            }
            case 3 -> {
                FamalyOne three = (FamalyOne) famalyOneOnList.get(2);
                checkNumsEqualsThree(rolls, famalyOneOnList, nums, three);
            }
            case 4 -> {
                FamalyOne four = (FamalyOne) famalyOneOnList.get(3);
                checkNumsEqualsFour(rolls, famalyOneOnList, nums, four);
            }
        }
    }
}

