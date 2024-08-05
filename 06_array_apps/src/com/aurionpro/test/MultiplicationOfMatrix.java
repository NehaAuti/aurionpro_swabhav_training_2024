package com.aurionpro.test;
import java.util.Scanner;
public class MultiplicationOfMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows for the first matrix:");
        int rows1 = scanner.nextInt();
        System.out.println("Enter the number of columns for the first matrix:");
        int columns1 = scanner.nextInt();

        int[][] matrix1 = new int[rows1][columns1];
        System.out.println("Enter the elements of the first matrix:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns1; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Enter the number of rows for the second matrix:");
        int rows2 = scanner.nextInt();
        System.out.println("Enter the number of columns for the second matrix:");
        int columns2 = scanner.nextInt();

        if (columns1 != rows2) {
            System.out.println("Matrix multiplication is not possible with the given dimensions.");
            return;
        }

        int[][] matrix2 = new int[rows2][columns2];
        System.out.println("Enter the elements of the second matrix:");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < columns2; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }

        int[][] resultMatrix = new int[rows1][columns2];

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns2; j++) {
                for (int k = 0; k < columns1; k++) {
                    resultMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        System.out.println("Resultant matrix after multiplication:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns2; j++) {
                System.out.print(resultMatrix[i][j] + "\t");
            }
            System.out.println();
        }

        scanner.close();
		
	}

}
