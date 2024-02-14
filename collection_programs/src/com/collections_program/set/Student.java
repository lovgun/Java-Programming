package com.collections_program.set;

public class Student implements Comparable {
	int id;
	int age;
	String name;
	Student(int id,int age,String name){
		this.age=age;
		this.id=id;
		this.name=name;
	}
//	@Override
//	public String toString() {
//	return name +":"+" "+"id==>"+ id +" "+"age==>"+" "+age ;
//			
//			
//}
	@Override
	public String toString() {
		return name+" "+id+" "+age;
				
				
	}


	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return id;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return this.hashCode()==obj.hashCode();
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Student st=(Student) o;
		return this.id-st.id;
	}
    }
