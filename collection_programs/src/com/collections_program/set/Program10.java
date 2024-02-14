package com.collections_program.set;

import java.util.Set;
import java.util.TreeSet;

public class Program10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set set=new TreeSet(new IDdescedingOrder());
		set.add(new Student(1,20,"Lovely"));
		set.add(new Student(2,21,"krity"));
		set.add(new Student(3,23,"priya"));
		set.add(new Student(4,24,"seela"));
		System.out.println(set.size());
		System.out.println(set);

	}

}
