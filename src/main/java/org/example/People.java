package org.example;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter

public class People {
    private String name;
    private int age;
    private String status;


    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name;
    }


    public void getInfo() {
        System.out.print("Имя: " +this.name +" "+  "Возраст: "+ this.age+" "+ "Статус: "+ this.status);
        System.out.println();
    }
    public void   getParrents(List<String> rolls, List<People> famaly){

        System.out.println(rolls.get(0) +" "+ famaly.get(0));
        System.out.println(rolls.get(1) +" "+ famaly.get(1));
    }
    public void getChild(List<String> rolls, List<People> famaly){
        System.out.println(rolls.get(2) +" "+ famaly.get(2));
        System.out.println(rolls.get(3) +" "+ famaly.get(3));


    }
}