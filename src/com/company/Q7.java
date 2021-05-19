package com.company;

public class Q7 {
public static int minimum(int n[]){
    int min=n[0];
    for (int i = 0; i < n.length; i++) {
        if(n[i]<min)
            min=n[i];
    }
    return min;
}

    public static void main(String[] args) {
        int n[]={2,4,5,7,2,4,6,8,9};
        System.out.println(minimum(n));
    }
}
