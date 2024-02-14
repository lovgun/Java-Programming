package com.collections_program.set;

import java.util.Set;
import java.util.TreeSet;

//tree set with comparator
//It is also known as default sorting.In this comparable interface works
//Object class,Wrapper class,String class is already inherited comparator<I>
//no dublicates allowed
//store homogenious objects
//if you want to store your own class object than you have to inherit comparable<i>
//here in this eg. it is shown......
public class Program8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set set=new TreeSet();
		set.add(new Student(1,20,"Lovely"));
		set.add(new Student(2,21,"krity"));
		set.add(new Student(3,23,"priya"));
		set.add(new Student(4,24,"seela"));
		System.out.println(set.size());
		System.out.println(set);
	}

}
