package com.Array.programs;

public class ArrayReturn {
	static int[] get(){
		return new int[]{10,20,30,40,50};
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=get();
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}

	}

}
