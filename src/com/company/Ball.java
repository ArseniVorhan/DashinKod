package com.company;

import java.util.ArrayList;

/**
 * Created by user on 04.05.2016.
 */
public class Ball {
    String color;
    String size;
    double weight;
    Ball(){
        this.color = "red";
        this.size = "small";
        this.weight = 100;
    }
    Ball(String a, String b, double c){
        this.color = a;
        this.size = b;
        this.weight = Math.random()*c;
    }
    public boolean equals (Object obj){
        if(obj == null)
            return false;
        if(!(obj instanceof Ball))
            return false;
        Ball obj1 = (Ball)obj;
        return this.color == obj1.color && this.size == obj1.size && this.weight == obj1.weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}

