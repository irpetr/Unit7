package com.company;

public class Kelvin extends BaseConverter{

    Kelvin(double C) {
        super(C);
        System.out.println(C+" градусов по Цельсию = "+ (C+273.15) + " градусов по Кельвину.");
    }
}
