package com.collections_program.set;

import java.util.HashSet;
import java.util.Set;

//add methods return false when dublicates elemnts are store
//hashcode methode returns object unique id
//equal method return t or f.if objects are equal return true otherwise false
//add methods return true if equal() return false.if euqual()return t then add() return false 
//here shown in the example
public class Program5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set set=new HashSet();
		set.add(12);
		set.add(2004);
		set.add(104);
		set.add(45.34f);
		set.add("Lovely");
		set.add(new String("Lovely"));//add()return f because equal() return t.
		set.add(new Character ('b'));
		set.add(true);
		System.out.println(set.size());
		System.out.println(set);//it give output not in any order bccause of hashSet implementation class is used


	}

}
