package com.aurionpro.test;
import java.util.Scanner;
public class SumOfMatrix {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows for the first matrix: ");
        int rows1 = scanner.nextInt();
        System.out.print("Enter the number of columns for the first matrix: ");
        int columns1 = scanner.nextInt();

        int[][] matrix1 = new int[rows1][columns1];

        System.out.println("Enter the elements of the first matrix:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns1; j++) {
                //System.out.print("Element at (" + i + ", " + j + "): ");
                matrix1[i][j] = scanner.nextInt();
            }
        }

        System.out.print("Enter the number of rows for the second matrix: ");
        int rows2 = scanner.nextInt();
        System.out.print("Enter the number of columns for the second matrix: ");
        int columns2 = scanner.nextInt();

        int[][] matrix2 = new int[rows2][columns2];
        System.out.println("Enter the elements of the second matrix:");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < columns2; j++) {
              //  System.out.print("Element at (" + i + ", " + j + "): ");
                matrix2[i][j] = scanner.nextInt();
            }
        }

        if (rows1 != rows2 || columns1 != columns2) {
            System.out.println("Matrix addition is not possible. Matrices must have the same dimensions.");
        } else {
          
            int[][] resultMatrix = new int[rows1][columns1];

            for (int i = 0; i < rows1; i++) {
                for (int j = 0; j < columns1; j++) {
                    resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
                }
            }

            System.out.println("Sum of the two matrices:");
            for (int i = 0; i < rows1; i++) {
                for (int j = 0; j < columns1; j++) {
                    System.out.print(resultMatrix[i][j] + " ");
                }
                System.out.println();
            }
        }

        scanner.close();
		

	}

}
