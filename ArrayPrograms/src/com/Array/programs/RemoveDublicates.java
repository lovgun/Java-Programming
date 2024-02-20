package com.Array.programs;

public class RemoveDublicates {
		public static void find_dubli(int [] copy){
			int count=0;
			
			int temp=0,j=0;
			int new_arr[]=new int[copy.length-2];		
			for(int i=0;i<copy.length;i++){

				temp=copy[i];
				

				if(i==0){
					j++;
				}
				else{
					j=0;
				}
				
				for( ;j<i;j++){
					if(temp==copy[j]){
						count=1;
					
					break;
						
					}															
					
				}
				if(count==0){
					new_arr[i]=temp;
				}
				
			}
		
			
				
			for(int k=0;k<new_arr.length;k++){
				System.out.println(new_arr[k]);
			
				
			}
		}
				
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int[] arr=new int[]{4,5,1,2,3,4,5};
			
			System.out.println("original elements are======>");
			for(int i=0;i<arr.length;i++){
				System.out.print(arr[i]+" ");
			}
			System.out.println();
			System.out.println("After removing dublicates elements are:=======>");
			find_dubli(arr);		

		}

	}

	


