package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        /*BaseConverter kelvin = new Kelvin(5);
        kelvin.convert();
        BaseConverter farengeit = new Farengeit(15);
        farengeit.convert();
        BaseConverter reomur = new Reomur(45);
        reomur.convert();*/

       /* Phone phone1 = new Phone(29100105, "Apple", 115);
        Phone phone2 = new Phone(25200204, "Huawei", 150);
        Phone phone3 = new Phone(33220100, "Samsung", 130);
        System.out.println(phone1.toString());
        System.out.println(phone2.toString());
        System.out.println(phone3.toString());
        phone1.receiveCall("Alex");
        phone1.getNumber();
        phone2.receiveCall("Bob");
        phone2.getNumber();
        phone3.receiveCall("Sam");
        phone3.getNumber();
        Phone phone4 = new Phone(29500600, "Xiomy");
        phone4.receiveCall("Mark", 2941258);

        phone1.sendMessage(37525451);
        phone2.sendMessage(258100100);
        phone3.sendMessage(600600);
*/
        /*Person person1 = new Person();
        Person person2 = new Person("Ivanov",25);
        person1.move("Kulik");
        System.out.println(person1.toString());
        System.out.println(person2.toString());*/

        Reader reader1 = new Reader("Иванов М.В.", 58, "Исторический факультет", 08.1981, 2004512);
        Reader reader2 = new Reader("Миронова О.Г.", 47, "Математический факультет", 12.1995, 2004852);
        Reader reader3 = new Reader("Сом В.А.", 3, " Педагогика", 05.1999, 20058634);
        Reader reader4 = new Reader("Шелест Н.Т.", 8, "Экономический", 01.1998, 2004587);

        Book book1 = new Book("Приключения Незнайки", "Носов Н.Н.");
        Book book2 = new Book("Ёж", "Толстой А.Н.");
        Book book3 = new Book("Война и мир", "Толстой Л.Н.");
        reader1.takeBook(2);
        reader2.takeBook(book1, book2, book3);
        System.out.println();
        reader3.returnBook(3);
        reader4.returnBook(book3, book2);


    }
}




