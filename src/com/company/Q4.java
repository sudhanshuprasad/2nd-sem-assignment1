package com.company;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();
        String str[]=new String[n];
        for (int i = 0; i < n; i++) {
            str[i]=sc.next();
        }
        sc.close();
        for (int i = n-1; i >= 0; i--) {
            System.out.println(str[i]);
        }
    }
}
