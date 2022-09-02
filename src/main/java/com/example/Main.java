package com.example;

public class Main {
    public static void main(String[] args){
        Human exemplu = new Human("Adrian",29);
        System.out.println(exemplu.getName()+" are "+exemplu.getAge() + " ani.");
    }
}

class Human{
    String name;
    final int age;
    public Human(String name,int age){
        this.name = name;
        this.age = age;
    }
    String getName(){
        return name;
    }
    int getAge(){
        return age;
    }
}
