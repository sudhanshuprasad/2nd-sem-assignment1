package com.company;
public class Q2 {
    public static int devby2(int num){
        int count=0;
        while(num>2){
            count++;
            num=num/2;
        }
        return count;
    }

    public static void main(String[] args){
        System.out.println(devby2(45));
    }
}
