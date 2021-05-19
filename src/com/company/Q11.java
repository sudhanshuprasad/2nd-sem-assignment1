package com.company;

import java.util.Scanner;

class point{
    int x,y;
    void setPoint(int x, int y){
        this.x=x;
        this.y=y;
    }
}

public class Q11 {

    public static double findDistance(point p1, point p2){
        return Math.sqrt(Math.pow(p1.x-p2.x,2)+Math.pow(p1.y-p2.y,2));
    }

    public static void main(String[] args) {
        point p1=new point();
        point p2=new point();
        Scanner sc=new Scanner(System.in);
        p1.setPoint(sc.nextInt(), sc.nextInt());
        p2.setPoint(sc.nextInt(), sc.nextInt());
        System.out.println(p1.x+" "+p1.y+" "+p2.x+" "+p2.y);
//        p1.setPoint(3, 0);
//        p2.setPoint(0, 4);
        System.out.println(findDistance(p1,p2));
    }
}
