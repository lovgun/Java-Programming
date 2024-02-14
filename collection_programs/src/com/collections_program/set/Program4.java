package com.collections_program.set;

//how set maintains its uniqness
//Internal logic of add method of collection interface
//add method internally called equal method of given class that we are going to store
//equal method internally called hashcode method of given class that we are going to store
//so here we override hashcode and equal method in Student class to store dublicates elemnts.

public class Program4 {
	public static boolean add(Student stu1){
		Student stu =new Student(1,20,"priya");
		if(stu.equals(stu1)){
			return false;
			
		}
		else {
		
		return true;
		
	}
	}
	public static void main(String[] args) {
		Student stu1=new Student(1,20,"priya");
		System.out.println("stu1 added: "+add(stu1));
		
		
	}

}
