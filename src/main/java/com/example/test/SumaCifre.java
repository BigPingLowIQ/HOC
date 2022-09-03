package com.example.test;

public class SumaCifre {
    public static void main(String[] args) {
        int numar = 1235;
        int uc,pc=0;
        int x = numar;
        uc = x%10;
        while(x!=0){
            pc = x%10;
            x/=10;
        }
        System.out.println(uc+pc);
    }
}
