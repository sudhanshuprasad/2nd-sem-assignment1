package com.company;

import java.util.Scanner;

public class Q6 {
    public  static int max(int x[]){
        int max=x[0];
        for (int i = 0; i < x.length; i++) {
            if(x[i]>max){
                max=x[i];
            }
        }
        return max;
    }
    public  static int min(int x[]){
        int min=x[0];
        for (int i = 0; i < x.length; i++) {
            if(x[i]<min){
                min=x[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int x[]=new int[n];
        for (int i = 0; i < x.length; i++) {
            x[i]= sc.nextInt();
        }
        sc.close();
//        int x[]={1,2,3,4,5,3,2,4};
        System.out.println(max(x)+" "+min(x));
    }
}
