package Exeption3.test;

import Exeption3.controller.ContactManager;
import Exeption3.data.Contact;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Scanner;


public class ContactTest {
     public static String[] inputString() {
        Scanner sc = new Scanner(System.in);
        String inputStr;
        while (true) {
            System.out.println("\nВведите контактные данные в формате:  Фамилия, Имя, Отчество, *дата в формате ддММгггг*, *Номер начиная с 7*, *пол одним символом f- жен m-муж*:" );
            try {
                inputStr = sc.nextLine();
                inputStr = inputStr.trim();
                break;
            } catch (NumberFormatException e) {
                System.out.println( "Неверный ввод!" );
            }
        }
        if (inputStr.isEmpty()) {
            System.out.print("Пустая строка! Введите символы:" );
            inputString();
        }
        return inputStr.split("[,\\s]+");
    }

    public static String dateConverter(String date) {
        SimpleDateFormat format = new SimpleDateFormat("ddMMyyyy");
        try {
            format.format(format.parse(date));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        return date;
    }

    public static String[] stringParser(String[] msg) {
        String[] strResult;
        try {
            String firstName = msg[0];
            String lastName = msg[1];
            String fatherName = msg[2];
            String date = dateConverter(msg[3]);
            if (date.length() != 8) {
                System.out.println( "Ошибка в дате! " + date );
                stringParser(inputString());
            }
            String strPhone = msg[4];
            if (strPhone.length() != 11) {
                System.out.println( "Ошибка в номере! " + strPhone );
                stringParser(inputString());
                try {
                    Long phone = Long.valueOf(strPhone);
                } catch (RuntimeException e) {
                    System.out.println( "Ошибка! " + e );
                    stringParser(inputString());
                }
            }
            String strSex = msg[5];
            char[] chArr = strSex.toCharArray();
            char sex = chArr[0];
        } catch (RuntimeException e) {
            System.out.println( "Ошибка! -----------------------------------------------------------\n" + e );
        }
        return msg;
    }


    public static void main(String[] args) {
        ContactManager cm = new ContactManager();

        Contact c1 = new Contact(stringParser(inputString()));
        Contact c2 = new Contact(stringParser(inputString()));
        Contact c3 = new Contact(stringParser(inputString()));
        Contact c4 = new Contact(stringParser(inputString()));

        System.out.println( "\nДобавление контакта___________________________________________________" );
        int cId1 = cm.addContact(c1);
        int cId2 = cm.addContact(c2);
        int cId3 = cm.addContact(c3);
        int cId4 = cm.addContact(c4);
        List<Contact> result1 = cm.findContacts();
        for (Contact c : result1) {
            System.out.println(c);
        }

        System.out.println( "\nОбновление контакта___________________________________________________" );
        Contact c5 = new Contact(stringParser(inputString()));
        cm.updateContact(cId1, c5);
        List<Contact> result2 = cm.findContacts();
        for (Contact c : result2) {
            System.out.println(c);
        }

        System.out.println(  "\nУдаление контакта_____________________________________________________" );
        cm.deleteContact(cId4);
        List<Contact> result3 = cm.findContacts();
        for (Contact c : result3) {
            System.out.println(c);
        }

        System.out.println(  "\nНайти контакт_________________________________________________________" );
        Contact contact = cm.getContact(cId2);
        System.out.println(contact);

        System.out.println(  "\nЗапись контакта в файл________________________________________________" );
        cm.writeContact(cId1);
        cm.writeContact(cId2);
        cm.writeContact(cId3);
    }
}