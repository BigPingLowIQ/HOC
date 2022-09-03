package com.example.punct;

public class Point {
    private int x,y;

    public Point(int x,int y){
        this.x=x;
        this.y=y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double distance(int xB,int yB){
        return Math.sqrt(Math.pow(x-xB,2)+Math.pow(y-yB,2));
    }

    public double distance(Point point){
        return Math.sqrt(Math.pow(x-point.getX(),2)+Math.pow(y-point.getY(),2));
    }

}
