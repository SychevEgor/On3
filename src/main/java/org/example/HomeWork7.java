package org.example;
import java.util.List;
import java.util.Scanner;

public class HomeWork7    {
    public static void main(String[] args) {
        List<String> rolls = List.of("Мама", "Папа", "Сын", "Дочь");//eNum
        FamalyOne p1 = new FamalyOne("Людмила", 55);
        FamalyOne p2 = new FamalyOne("Миша", 55);
        FamalyOne p3 = new FamalyOne("Дима", 20);
        FamalyOne p4 = new FamalyOne("Маша", 21);

        List<People> famalyOneOnList = List.of(p1, p2, p3, p4);//eNum

        Relationships var = new Relationships();
        var.showRelations(rolls, famalyOneOnList);
        StartMenuRun run = new StartMenuRun();
        run.MenuOf(rolls,famalyOneOnList);
     }
}


