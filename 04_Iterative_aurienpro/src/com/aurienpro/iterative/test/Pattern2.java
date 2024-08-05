package com.aurienpro.iterative.test;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j;
        int k = 1;
        int n=4;
        
        for (i = 1; i <= n; i++) {
            
            for (j = 1; j <= i; j++) {
                
                System.out.print(k + " ");
                k++;
            }

            // printing new line for each row
            System.out.println();
        }

	}

}
