package stringpractice.program1;

 public class Printdublicates {
     public static String solv(String str1) {
    	 StringBuffer ans=new StringBuffer();
     
	int flag=0;
            
      for(int i=0;i<str1.length()-1;i++){
			for(int j=0;j<str1.length()-1;j++){
				if(j==i){
					j+=1;
				}
				
				if(str1.charAt(i)==str1.charAt(j)){
					
						flag=1;
					}
			}

					
				if(flag!=1){
					ans.append(str1.charAt(i));
				}
			
			

	}
	return ans.toString();

	}

	public static void main(String[] args) {
			// TODO Auto-generated method stub
			String firstString="acbfcdbef";
			System.out.println("final string  is:");
			System.out.println(solv(firstString));
			

	}
 }
