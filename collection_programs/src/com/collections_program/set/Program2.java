package com.collections_program.set;

import java.util.HashSet;
import java.util.Set;

// set collection programs to store hetrogenious objects 
//with no order(HashSet)
//it display its size 7 because no dublicates allowed in set<I>.
//hashcode same
public class Program2 {
	public static void main(String[] args) {
		Set set=new HashSet();
		set.add(new String("Lovely"));
	    System.out.println(new String ("Lovely").hashCode());
		set.add(12);
	    System.out.println(new String ("Lovely").hashCode());
		set.add(new String("Lovely").hashCode());//==>dublicate object
		set.add(2004);
		set.add(104);
		set.add(45.34f);
		set.add(new Character ('b'));
		set.add(true);
		System.out.println(set.size());
		System.out.println(set);//it give output not in any order bccause of hashSet implementation class is used
		
		
	}

}
