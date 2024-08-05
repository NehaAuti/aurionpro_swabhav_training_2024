package com.aurionpro.test;
import java.util.Scanner;
public class ShiftCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n (number of places to shift): ");
        int n = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Enter the string to shift: ");
        String input = scanner.nextLine();
        String shiftedString = shiftCharacters(input, n);
        System.out.println("Shifted string: " + shiftedString);
        scanner.close();
    }

    public static String shiftCharacters(String input, int n) {
        if (input == null || input.isEmpty()) {
            return input;
        }
        n = n % input.length();
        char[] chars = input.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char originalChar = chars[i];
            char shiftedChar = originalChar;
            if (originalChar >= 'a' && originalChar <= 'z') {
                shiftedChar = (char) (originalChar + n);
                if (shiftedChar > 'z') {
                    shiftedChar = (char) ('a' + (shiftedChar - 'z' - 1));
                } else if (shiftedChar < 'a') {
                    shiftedChar = (char) ('z' - ('a' - shiftedChar - 1));
                }
            }
            else if (originalChar >= 'A' && originalChar <= 'Z') {
                shiftedChar = (char) (originalChar + n);
                if (shiftedChar > 'Z') {
                    shiftedChar = (char) ('A' + (shiftedChar - 'Z' - 1));
                } else if (shiftedChar < 'A') {
                    shiftedChar = (char) ('Z' - ('A' - shiftedChar - 1));
                }
            }
            chars[i] = shiftedChar;
        }
        return new String(chars);
	}

}
