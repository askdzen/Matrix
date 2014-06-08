package com.epam.ad.matrix;

final public class Matrix {
    private final int M;             // number of rows
    private final int N;             // number of columns
    public double[][] data;

    public Matrix(int M, int N) {
        this.M = M;
        this.N = N;
        data = new double[M][N];
    }



    public static Matrix random(int M, int N) {
        Matrix A = new Matrix(M, N);
        for (int i = 0; i < M; i++)
        {
            for (int j = 0; j < N; j++)
                A.data[i][j] = Math.random();
        }
        return A;
    }

    public void show() {
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++)
                System.out.printf("%9.4f ", data[i][j]);
            System.out.println();
        }
    }
    public  static  Matrix multiply(Matrix a, Matrix b){
        Matrix c = new Matrix(a.M,a.N);
        for (int i=0;i<a.M;i++){
            for(int j=0;j<a.N;j++)
                c.data[i][j]=a.data[i][j]*b.data[i][j];}
        return c;

    }
}