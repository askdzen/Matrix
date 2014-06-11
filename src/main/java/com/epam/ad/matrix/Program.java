package com.epam.ad.matrix;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        System.out.println("Enter the number of columns...");
        Scanner c = new Scanner(System.in);
        int col=c.nextInt();
        System.out.println();
        System.out.println("Enter the number of rows...");
        Scanner r = new Scanner(System.in);
        System.out.println();
        int row=r.nextInt();
        Matrix A = Matrix.random(col, row);
        Matrix B = Matrix.random(col, row);
        A.show();
        System.out.println();
        B.show();
        System.out.println();
        Matrix C = Matrix.multiply(A, B);
        C.show();

    }
}
