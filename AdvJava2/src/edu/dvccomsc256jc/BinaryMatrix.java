/*
 * Justin Choy
 * Student ID: 1731686 
 * */
package edu.dvccomsc256jc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BinaryMatrix {

	int random, input;
	ArrayList <Integer> row = new ArrayList<Integer>();
	ArrayList <Integer> column = new ArrayList<Integer>();
	
	public BinaryMatrix(int input){
		
		this.input = input;
		//this.random = random;
		
	}

	public ArrayList<Integer> addRowNum(int input){
		
		for(int i = 0; i < input; i++){
			int random = (int) (Math.random() * ((1-0) + 1));
			row.add(random);
		}
		
		return row;
		
		}
	
	public ArrayList<Integer> addColNum(int input){
		for(int i = 0; i < input; i++){
			int random = (int) (Math.random() * ((1-0) + 1));
			column.add(random);
			
		}
		
		return column;
	}
	
	public int colCount(){
		int ones = 0;
		for(int i = 0; i < column.size(); i++)
		{
			if(column.contains(1)){
				ones++;
			}
		}
		
		return ones;
	}
	
	public int rowCount() {
		int ones = 0;
		for(int i = 0; i < row.size(); i++)
		{
			if(row.contains(1)){
				ones++;
			}
		}
		
		return ones;
	}
	
	
	public String rowToString() {
		StringBuilder result = new StringBuilder("");
		
		for(int i = 0; i < row.size(); i++) {
			result.append(row.get(i));
		}
		
		return result.toString();
	}
	
	public String colToString() {
		StringBuilder result = new StringBuilder("");
		
		for(int i = 0; i < column.size(); i++) {
			result.append(column.get(i));
		}
		
		return result.toString();
	}
}
