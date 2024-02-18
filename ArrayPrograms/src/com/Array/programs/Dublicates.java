package com.Array.programs;

public class Dublicates {
	
	public static void find_dubli(int [] copy){
		System.out.println("printing elemrnts are");
		for(int i=0;i<copy.length;i++){
			for(int j=i+1;j<copy.length;j++){
				if(copy[i]==copy[j]){
					System.out.println(copy[i]);				
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[]{111,333,555,777,333,444,555};
		find_dubli(arr);		

	}

}
