package com.mycompany.springbasic1102.di.round;

public class CircleArea {
    private double roundArea;
    private double radius;

    public double getRoundArea() {        
        return roundArea;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "CircleArea{" + "roundArea=" + roundArea + ", radius=" + radius + '}';
    }
    
    
}
