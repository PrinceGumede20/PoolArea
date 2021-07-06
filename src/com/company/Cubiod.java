package com.company;

public class Cubiod extends Rectangle {
    private double height;

    public Cubiod(double width, double length, double height) {
        super(width, length);
        if(height<0){
            height=0;
            this.height=height;
        }else{
            this.height=height;
        }
    }

    public double getHeight() {
        return height;
    }

    public double getVolume(){
        double calculatedVolume=getArea() *height;
        return calculatedVolume;
    }
}
