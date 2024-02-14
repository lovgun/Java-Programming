package com.collections_program.set;
//set collection with linkedhashset that is in fifo order
import java.util.LinkedHashSet;
import java.util.Set;

public class Program6 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set set=new LinkedHashSet();
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
