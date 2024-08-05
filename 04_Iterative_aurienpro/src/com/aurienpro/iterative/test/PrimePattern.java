package com.aurienpro.iterative.test;
import java.util.Scanner;
public class PrimePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        
        int primesToPrint = 1;
        int currentPrime = 2;
        
        for(int i = 1; i <= number; i++) {
            int count = 0;
            while (count < primesToPrint) {
                if (isPrime(currentPrime)) {
                    System.out.print(currentPrime + " ");
                    count++;
                }
                currentPrime++;
            }
            primesToPrint++;
            System.out.println();
        }scanner.close();
    }
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        } return true;
	}
}
