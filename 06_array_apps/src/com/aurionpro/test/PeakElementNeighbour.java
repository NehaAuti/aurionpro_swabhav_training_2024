package com.aurionpro.test;
import java.util.Scanner;
public class PeakElementNeighbour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.print("The peak elements are: ");
        if (n >= 1 && (n == 1 || array[0] >= array[1])) {
            System.out.print(array[0] + " ");
        }
        for (int i = 1; i < n - 1; i++) {
            if (array[i] >= array[i - 1] && array[i] >= array[i + 1]) {
                System.out.print(array[i] + " ");
            }
        }
        if (n >= 2 && array[n - 1] >= array[n - 2]) {
            System.out.print(array[n - 1] + " ");
        }
        scanner.close();
	}

}
