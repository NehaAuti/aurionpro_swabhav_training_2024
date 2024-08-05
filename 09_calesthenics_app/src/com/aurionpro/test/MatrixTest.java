package com.aurionpro.test;
import java.util.Scanner;
public class MatrixTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] matrix = new int[3][3];
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the matrix elements:");

        createMatrix(matrix, scanner);

        System.out.println("Matrix is:");
        printMatrix(matrix);

        scanner.close();
    }

    private static void createMatrix(int[][] matrix, Scanner scanner) {
        for (int i = 0; i < 3; i++) {
            readRow(matrix, scanner, i);
        }
    }

    private static void readRow(int[][] matrix, Scanner scanner, int rowIndex) {
        for (int j = 0; j < 3; j++) {
            matrix[rowIndex][j] = scanner.nextInt();
        }
    }

    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < 3; i++) {
            printRow(matrix, i);
        }
    }

    private static void printRow(int[][] matrix, int rowIndex) {
        for (int j = 0; j < 3; j++) {
            System.out.print(matrix[rowIndex][j] + "\t");
        }
        System.out.println();
    }
}



