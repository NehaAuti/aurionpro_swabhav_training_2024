package com.aurionpro.test;
import java.util.Arrays;
import java.util.Scanner;
public class SortedSquareArray {

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

        int[] sortedSquares = sortedSquares(array);

        System.out.println("The sorted squares are: ");
        for (int i = 0; i < sortedSquares.length; i++) {
            System.out.print(sortedSquares[i] + " ");
        }
        scanner.close();
    }

    public static int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] squares = new int[n];
        for (int i = 0; i < n; i++) {
            squares[i] = nums[i] * nums[i]; 
        }

        Arrays.sort(squares);  

        return squares; 
	}

}
