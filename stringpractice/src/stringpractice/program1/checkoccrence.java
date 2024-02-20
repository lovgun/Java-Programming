package stringpractice.program1;

//program to count occurence of a character in a string
//steps:
//	1.take same int array container that a string sentence have
//	2.convert string sentence to character array
//	3.count each word of the string and store in array
//	4.determine minium and maximum character occerence
public class checkoccrence {
	public static void main(String[] args) {
		String st="grass is greener on the other side";  
		int frequency[]=new int[st.length()];
		char minChar=st.charAt(0);
		char maxChar=st.charAt(0);
		int i,j,min,max;
	//Converts given string into character array  	
		char stArray[]=st.toCharArray();
	       
    //Count each word in given string and store in array frequency	
		for(i=0;i<stArray.length;i++){
			frequency[i]=1;
			for(j=0;j<=stArray.length-1;j++){
				if(j==i){
					j+=1;
				}
				if(stArray[i]==stArray[j]&& stArray[i]!= ' '&&stArray[i]!='0' ){
				frequency[i]++;
	//Set string[j] to 0 to avoid printing visited character
				
				}
			}
	 //Determine minimum and maximum occurring characters 
			min=max=frequency[0];
			for(i=0;i<frequency.length;i++){
		      if(min > frequency[i]) { 
		    	  min=frequency[i];
		    	  minChar=stArray[i];
		    	  
		      }
		      if(max<frequency[i] ){
		    	  max=frequency[i];
		    	  maxChar=stArray[i];
		      }
				
			}
				System.out.println("mimimum occurence character is"+" "+minChar);
				System.out.println("maximum occerence character is"+" "+maxChar);
			}
	}
				
				
				
				
		}
		
		
	

