package com.company;

import java.util.ArrayList;

/**
 * Created by user on 04.05.2016.
 */
public class Tree implements Placement{
    private int numbCapacity;
    private double weightCapacity;
    private int counter = 0;
    private ArrayList<Ball> balls;

    public int getNumbCapacity() {
        return numbCapacity;
    }

    public void setNumbCapacity(int numbCapacity) {
        this.numbCapacity = numbCapacity;
    }

    public double getWeightCapacity() {
        return weightCapacity;
    }

    public void setWeightCapacity(double weightCapacity) {
        this.weightCapacity = weightCapacity;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public ArrayList<Ball> getBalls() {
        return balls;
    }

    public void setBalls(ArrayList<Ball> balls) {
        this.balls = balls;
    }

    Tree(){
        this.numbCapacity = 10;
        this.weightCapacity = 1000;
        this.balls = new ArrayList<Ball>();
    }
    Tree(int a, double b){
        this.numbCapacity = a;
        this.weightCapacity = b;
        this.balls = new ArrayList<Ball>();

    }
    public void showTree (){

    }

    @Override
    public void addBall(Ball ball) {

        if(ball.weight <= this.weightCapacity && this.numbCapacity >= 1){
            this.balls.add(ball);
            counter ++;
            this.weightCapacity -= ball.weight;
            this.numbCapacity --;
            System.out.println("Ball was added");

        }
        else
            System.out.println("Error!");

    }

    @Override
    public void addBalls(ArrayList<Ball> balls) {
        for (Ball ball : balls) {
            if (this.weightCapacity == 0 || this.numbCapacity == 0) {
                System.out.println("Not enough space!There are " + counter + " balls at the tree.");
                break;
            }
            else
                addBall(ball);


        }
        System.out.println("There are " + counter + " balls at the tree");

    }
    public void showballs (){
        for(Ball ball : this.balls)
            System.out.println(ball.color + " " + ball.size + " " + ball.weight);
    }
    public void removeBall (String parametr){
        for(Ball ball: this.balls){
           if( ball.color.equals(parametr) ||ball.size.equals(parametr)){
               this.balls.remove(ball);
               System.out.println("Ball deleted");
               break;
           }
        }


    }


}
