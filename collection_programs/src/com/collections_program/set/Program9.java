package com.collections_program.set;

import java.util.Set;
import java.util.TreeSet;

//Treeset program with comparator
//It is also known as custom sorting
public class Program9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set set=new TreeSet(new NameWiseSorting());
		set.add(new Student(1,20,"Lovely"));
		set.add(new Student(2,21,"krity"));
		set.add(new Student(3,23,"priya"));
		set.add(new Student(4,24,"k"));
		set.add(new Student(5,25,"s"));
		set.add(new Student(6,31,"t"));
		set.add(new Student(7,43,"y"));
		set.add(new Student(8,54,"i"));
		System.out.println(set.size());
		System.out.println(set);

	}

}
