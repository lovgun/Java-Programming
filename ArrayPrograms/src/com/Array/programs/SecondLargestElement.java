package com.Array.programs;

public class SecondLargestElement {
	static int greatest;
	static int second_greatest;		 
   public static void second_largest(int copy[]){	
	int new_arr[]=new int[copy.length];
		   
	   for(int i=0;i<copy.length;i++){
		   for(int j=i+1;j<copy.length;j++){
		   if(copy[i]>copy[j]){
			   greatest=copy[i];			   			   
		   }		   
	   }	  
	   }      
	   for(int i=0;i<copy.length;i++){
		   if(copy[i]!=greatest){
               new_arr[i]= copy[i];			   			   
		   }		  
	   }  
	   for(int i=0;i<new_arr.length;i++){
		   for(int j=i+1;j<copy.length;j++){
		   if(copy[i]>copy[j]){
			   second_greatest=copy[i];
			//   new_arr=copy[];		   			   
		   }
		   else{
			   second_greatest=copy[j];
		  			   
		   } 
	   }		  
	   }
	   System.out.println("second greatest no is"+" "+ second_greatest );	   
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[]{111,333,555,777,333,444,555};
		second_largest(arr);
	}
}
