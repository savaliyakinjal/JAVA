package com;

import java.util.Scanner;

public class Spiral_metrix {

	 public static void main(String args[])
	    {
	        System.out.println("Enter The z For metrix col :");
	         
	        Scanner sc = new Scanner(System.in);
	         
	        int n = sc.nextInt();
	         
	        int[][] a = new int[n][n];
	         
	        int z = 1;
	         
	        int minCol = 0;
	         
	        int maxCol = n-1;
	         
	        int minRow = 0;
	         
	        int maxRow = n-1;
	         
	        while (z <= n*n)
	        {
	            for (int i = minCol; i <= maxCol; i++)
	            {
	                a[minRow][i] = z;
	                     
	                z++;
	            }
	             
	            for (int i = minRow+1; i <= maxRow; i++) 
	            { 
	                a[i][maxCol] = z; 
	                 
	                z++; 
	            } 
	             
	            for (int i = maxCol-1; i >= minCol; i--)
	            {
	                a[maxRow][i] = z;
	                             
	                z++;
	            }
	             
	            for (int i = maxRow-1; i >= minRow+1; i--) 
	            {
	                a[i][minCol] = z;
	                 
	                z++;
	            }
	             
	            minCol++;
	             
	            minRow++;
	             
	            maxCol--;
	             
	            maxRow--;
	        }
	         
	        for (int i = 0; i < a.length; i++)
	        {
	            for (int j = 0; j < a.length; j++)
	            {
	                System.out.print(a[i][j]+ "\t");
	            }
	             
	            System.out.println();
	        }
	        sc.close();
	    }
}
