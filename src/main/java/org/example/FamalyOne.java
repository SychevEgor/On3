package org.example;

public class FamalyOne extends People implements GettingInfo {
    public FamalyOne(String name,int age ) {
        super(name,age);
    }


    @Override
    public void getInfo() {
        System.out.print("Имя: " + super.getName() +" "+  "Возраст: "+ super.getAge()+" "+ "Статус: "+ super.getStatus());
        System.out.println();
    }
}
