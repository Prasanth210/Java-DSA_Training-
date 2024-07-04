package Oops;

import java.util.Scanner;
class Operations {

    static Scanner scan = new Scanner(System.in);
    int[][] MatA;
    int [][] MatB;
    int r;
    int c;

    public void details(int[][] MatA,int[][] MatB,int r,int c){
        this.MatA=MatA;
        this.MatB=MatB;
        this.r=r;
        this.c=c;
    }

    public static int[][] getMatrix(int r, int c) {
        int[][] matrix = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.println("[" + i + "]" + "[" + j + "]");
                matrix[i][j] = scan.nextInt();
            }
            System.out.println();
        }

        return matrix;
    }

    public static int[][] Addition(int[][] A, int r1, int c1, int[][] B) {
        int[][] sum = new int[r1][c1];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                sum[i][j] = A[i][j] + B[i][j];
                System.out.print(sum[i][j]+" ");
            }

        }
        return sum;
    }

    public static int[][] Subtraction(int[][] A, int r1, int c1, int[][] B) {
        int[][] sub = new int[r1][c1];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                sub[i][j] = A[i][j] - B[i][j];
            }
        }
        return sub;
    }

    public static int[][] Divition(int[][] A, int r1, int c1, int[][] B) {
        int[][] Div = new int[r1][c1];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                try {
                    Div[i][j] = A[i][j] - B[i][j];
                } catch (Exception e) {
                    System.out.print("Can't divide this two numbers");
                }
            }
        }
        return Div;
    }

    void display() {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                //      System.out.print([i][j] + " ");
            }
            System.out.println();
        }
    }
}
public class Matrix {
    public static void main(String args[]) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int row = scan.nextInt();

        System.out.println("Enter number of column: ");
        int column = scan.nextInt();

        Operations op=new Operations();

        System.out.println("Enter matrix A: ");
        int[][] Mat1 = op.getMatrix(row, column);

        System.out.println("Enter matrix B: ");
        int[][] Mat2 = op.getMatrix(row, column);

        int[][] sum=op.Addition(Mat1,row,column,Mat2);

        for(int i=0;i<row;i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }
    }
}
