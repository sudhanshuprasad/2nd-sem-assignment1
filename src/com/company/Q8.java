package com.company;

import java.util.Scanner;

public class Q8 {
    public static int[] dotProduct(int a[], int b[]) {
        int c[] = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i] * b[i];
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        sc.close();
        int c[] = dotProduct(a, b);
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i] + " ");
        }
    }
}
