package com.collections_program.set;

import java.util.Comparator;

public class NameWiseSorting implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Student st1=(Student) o1;
		Student st2=(Student) o2;
		return st1.name.compareTo(st2.name);
	}

}
