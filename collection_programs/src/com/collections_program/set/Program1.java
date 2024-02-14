package com.collections_program.set;

import java.util.ArrayList;

//Just a demo program that is used to add hetrogenious
//objects into a collection

public class Program1 {
	public static void main(String[] args) {
		ArrayList collection =new ArrayList();
		collection.add(new Integer(100));//=====>boxing
		collection.add(10.23);//======>AutoBoxing
		collection.add(2004);
		collection.add(10);
		collection.add(7761999879l);
		collection.add(new Double(779879.8861999879));
		collection.add(new Character('A'));
		collection.add(true);
		collection.add(new String ("kriti"));
		collection.add(new Student(1, 20,"Twinkle"));
		collection.add(new Student(2,21,"Lovely"));
		collection.add(new Student(3,22,"pooja"));
		
		System.out.println(collection.size());
		System.out.println(collection);
			}
	

}
