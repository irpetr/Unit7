package com.company;

public class Farengeit extends BaseConverter{
    Farengeit(double C) {
        super(C);
        System.out.println(C+" градусов по Цельсию = "+ ((C*9/5)+32) + " градусов по Фаренгейту.");
    }
}
