package com.aurionpro.test;
import java.util.Scanner;
public class CheckNumberInArray {

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

        System.out.print("Enter the number to check: ");
        int numberToCheck = scanner.nextInt();
        boolean exists = false;
        for (int i = 0; i < n; i++) {
            if (array[i] == numberToCheck) {
                exists = true;
                break;
            }
        }
        if (exists) {
            System.out.println("The number " + numberToCheck + " exists in the array.");
        } else {
            System.out.println("The number " + numberToCheck + " does not exist in the array.");
        }

	}

}
