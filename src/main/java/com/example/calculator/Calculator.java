package com.example.calculator;

import java.util.List;

public class Calculator {
    private double x;
    private double y;
    public Calculator(){};

    public void setNumbers(double x,double y){
        this.x = x;
        this.y = y;
    }

    public double suma(){
        return x+y;
    }

    public double impartire(){
        return x/y;
    }
    public double inmultire(){
        return x*y;
    }
    public double diferenta(){
        return x-y;
    }
    public double minim(){
        if(x<y)return x;
        return y;
    }
    public double maxim(){
        if(x>y)return x;
        return y;
    }


}
