/*
 * Justin Choy
 * Student ID: 1731686 
 * */
package edu.dvccomsc256jc;

import java.util.ArrayList;

public class BinaryMatrix {

	int input, max, min;
	ArrayList <Integer> row = new ArrayList<Integer>();
	ArrayList <Integer> column = new ArrayList<Integer>();
	
	int random = (int) (Math.random() * ((max-min) + 1));
	
	public BinaryMatrix(int input, int min, int max){
		
		this.input=input;
		this.min = min;
		this.max = max;
		
	}
	
	public ArrayList<Integer> addRowNum(int input, int min, int max){
		
		for(int i = 0; i < input; i++){
			int random = (int) (Math.random() * ((max-min) + 1));
			
			row.add(random);
		}
		
		return row;
		
		}
	
	public ArrayList<Integer> addColNum(int input, int min, int max){
		for(int i = 0; i < input; i++){
			int random = (int) (Math.random() * ((max-min) + 1));
			
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
}
