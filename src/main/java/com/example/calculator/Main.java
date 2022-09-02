package com.example.calculator;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean exit = false;
        Calculator calculator = new Calculator();
        while(!exit) {
            System.out.println("0. Exit");
            System.out.println("1. Citire numere");
            System.out.println("2. Adunare");
            System.out.println("3. Diferenta");
            System.out.println("4. Inmultire");
            System.out.println("5. Impartire");
            System.out.println("6. Minimul");
            System.out.println("7. Maximul");
            int alegere = scanner.nextInt();


            switch (alegere){
                case 0: {
                    exit = true;
                    break;
                }
                case 1:{
                    System.out.println("Scrie 2 numere");
                    double x = scanner.nextDouble();
                    double y = scanner.nextDouble();
                    calculator.setNumbers(x,y);
                    break;
                }
                case 2:{
                    System.out.println(calculator.suma());
                    break;
                }
                case 3:{
                    System.out.println(calculator.diferenta());
                    break;
                }
                case 4:{
                    System.out.println(calculator.inmultire());
                    break;
                }
                case 5:{
                    System.out.println(calculator.impartire());
                    break;
                }
                case 6:{
                    System.out.println(calculator.minim());
                    break;
                }
                case 7:{
                    System.out.println(calculator.maxim());
                }
                default:
            }


        }

    }

}
