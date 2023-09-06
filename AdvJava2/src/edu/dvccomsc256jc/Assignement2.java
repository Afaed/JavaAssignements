/*
 * Justin Choy
 * Student ID: 1731686 
 * */
package edu.dvccomsc256jc;

import java.util.Scanner;

public class Assignement2 {
	
	public static void main (String [] args) {
	
		Scanner myObj = new Scanner(System.in);
		
		System.out.println("Enter the array size n: ");
		int input = myObj.nextInt();
		
		
		//This is the for loop for the top row
		
		//BinaryMatrix column = new BinaryMatrix(input, random);
		for(int i = 0; i < input; i++) 
		{
			BinaryMatrix row = new BinaryMatrix(input);
			row.addRowNum(input);
			System.out.println(row.rowToString());
		}
		
		for(int i = 0; i < input; i++) 
		{
		BinaryMatrix column = new BinaryMatrix(input);
		column.addColNum(input);
		System.out.println(column.colToString());
		}
		
		
	}
}
