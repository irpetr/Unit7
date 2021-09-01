package com.company;

public class Reomur extends BaseConverter{
    Reomur(double C) {
        super(C);
        System.out.println(C+" градусов по Цельсию = "+ ((C*4/5)) + " градусов по Реомюру.");
    }
}
