package org.example;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class notemook {
    private int serialNumber;
    private int ram;
    private String color;
    private Boolean nfc;
    private Boolean bluetooth;
    private int price;

    public notemook(int serialNumber, int ram, String color, Boolean nfc, Boolean bluetooth,int price){
        this.serialNumber = serialNumber;
        this.ram = ram;
        this.color = color;
        this.nfc = nfc;
        this.bluetooth = bluetooth;
        this.price = price;

    }
    public void getInfo(){
        System.out.println("Серийный номер:"+this.serialNumber);
        System.out.println("Размер оперативной памяти:"+this.ram);
        System.out.println("Цвет: "+this.color);
        System.out.println("Наличие функции NFC: "+this.nfc);
        System.out.println("Наличие функции bluetooth: "+this.bluetooth);
        System.out.println("Цена " + this.price+"$");

    }


}