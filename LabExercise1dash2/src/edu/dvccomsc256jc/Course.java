package edu.dvccomsc256jc;

public class Course {
	
	private String courseName, instructor;
	private int capacity = 16, numberOfStudents;
	private String [] studentList;
	
	public Course(String name) {
		this.courseName = name;
	}
	
	public Course(String name, String instructor) {
		this.instructor = instructor;
		this.courseName = name;
	}
	
	public String getInstructor() {
		return this.instructor;
	}
	
	public String getCourseName() {
		return this.courseName;
	}
	
	public int getNumberOfStuidnets() {
		capacity = capacity * 2;
		return this.numberOfStudents;
		
	}
	
	public void addInstructor(String instructor) {
		this.instructor = instructor;
	}
	
	public void addStudent(String student) {
			
		for(int i = 0; i < capacity; i++) {
			
			studentList[i] = student; 
			
		}
			
	}
	
	public void dropStudent(String student) {
		for (int i = 0; i < getNumberOfStuidnets(); i++) {
			if(student == studentList[i]) {
				
				studentList[i] = "";
				
			}
		}
	}
	
	public void print(){
		
		System.out.println(studentList);
	}
	
	public void clear() {}
}
