package com.company;

import java.util.Scanner;
public class Q5 {
    public static boolean isOdd(int x){
        while (x>0){
            x=x-2;
        }
        if(x==0){
            return false;
        }
        else {
            return true;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x= sc.nextInt();
        sc.close();
        System.out.println(isOdd(x));
    }
}
