package com.company;

public class Phone {
    int number;
    String model;
    int weight;

    Phone(int number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return number + ", " + model + ", " + weight;
    }

    String name;

    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public void getNumber() {
        System.out.println(number);

    }

    Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    Phone() {
    }

    public void receiveCall(String name, int number) {
        System.out.println("Звонит " + name + " его номер телефона " + number);
    }

    public void sendMessage(int... num) {
        int numbers = 0;
        for (int x : num) {
            numbers = x;
            System.out.println("Сообщение отправлено на номер "+numbers);
        }

    }
}
