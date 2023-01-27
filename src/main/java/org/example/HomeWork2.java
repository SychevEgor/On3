package org.example;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
public class HomeWork2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите Номер задачи от 1 до 2");
        String task = scan.nextLine();
        int taskInt = Integer.parseInt(task);
        if (taskInt == 1) ex1();
        else  ex2();


    }
    private static void ex1() {
        boolean question = true;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите строку для проверки: \n");
        String check = scan.next();

        for (int i = 0; i < check.length() / 2; i++) {
            if (check.charAt(i) != check.charAt(check.length() - 1 - i)) {
                question = false;
                break;
            }
        }

        System.out.println(question);
    }
    private static void ex2() {
        createFile();
        writeFile();
    }

    private static void writeFile() {
        String testString = "TEST".repeat(100);
        try (PrintWriter pw = new PrintWriter("src/main/java/org/example/text.txt")){
            pw.write(testString);
            pw.close();
            System.out.println("Запись добавлена");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Запись не работает");
        }
    }

    private static void createFile() {
        File file = new File("src/main/java/org/example/text.txt");
        try {
            if (file.createNewFile()) {
                System.out.println("Файл создан");
            } else {
                System.out.println("Файл уже существует");
            }
        } catch (Exception e){
            System.out.println("Создание файла не работает");
        }
    }


}

