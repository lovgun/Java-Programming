package com.collections_program.set;

import java.util.HashSet;
import java.util.Set;

//override hashcode() and equal()
//set<i>store dublicates here because in student class we override hash code and equal method
public class Program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set set=new HashSet();
		set.add(new Student(1,20,"Lovely"));
		set.add(new Student(1,20,"Lovely"));
		set.add(12);
		set.add(2004);
		set.add(104);
		set.add(45.34f);
		set.add(new Character ('b'));
		set.add(true);
		System.out.println(set.size());
		System.out.println(set);//it give output not in any order bccause of hashSet implementation class is used
		

	}

}
