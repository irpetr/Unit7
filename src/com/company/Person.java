package com.company;

public class Person {
    String fullName;
    int age;
    public void move(String fullName) {
        System.out.println(fullName + " говорит");
    }
    public void talk(String fullName) {
        System.out.println(fullName + " говорит");
    }
    Person() {
    }
    Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }
    @Override
            public String toString(){
        return fullName + " "+ age;
    }

}
