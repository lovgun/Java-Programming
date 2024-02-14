package com.collections_program.set;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

//treeset program
//treeset always store programs in sorted order .By default it is in ascending order
public class Program7 {
	public static void main(String[] args) {
		Set set=new TreeSet();
		set.add("Lovely");
		set.add("krity");
		set.add("abc");
		set.add("priya");
		set.add("shriya");
		set.add(new String("Lovely"));//add()return f because equal() return t.
		
	
		System.out.println(set.size());
		System.out.println(set);//it give output not in any order bccause of hashSet implementation class is used

	}
		
	}


