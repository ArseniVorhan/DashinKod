package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String colors[] = {"red","blue","green"};
        String size[] = {"small", "medium","big"};

        Tree tree = new Tree(7,50);
        ArrayList<Ball> balls = new ArrayList<Ball>();
       /* for(int i = 0; i < 10; i++ ) {
            Ball ball = new Ball(colors[(int)(Math.random()*3)],size[(int)(Math.random()*3)],50);
            balls.add(ball);
        }
*/
        Ball a = new Ball("z","s", 20);
        Ball b = new Ball("g","s", 20);
        Ball c = new Ball("d","s", 20);
        balls.add(a);
        balls.add(b);
        balls.add(c);
        tree.addBalls(balls);
        tree.showballs();
        tree.removeBall("g");
        tree.showballs();
    }
}
