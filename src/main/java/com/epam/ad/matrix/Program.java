package com.epam.ad.matrix;

public class Program {
    public static void main(String[] args) {
        int col =5;
        int row =5;

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
