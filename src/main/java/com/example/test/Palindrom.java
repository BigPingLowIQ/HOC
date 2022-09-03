package com.example.test;

public class Palindrom {
    public static void main(String[] args) {
        int numar = 12321;
        int invers = 0;
        int x = numar;
        while(x!=0){
            invers = invers * 10 + x%10;
            x/=10;
        }
        if(numar==invers)
            System.out.println("DA");
        else
            System.out.println("NU");

    }
}
