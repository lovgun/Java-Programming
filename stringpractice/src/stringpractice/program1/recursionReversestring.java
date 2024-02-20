package stringpractice.program1;

public class recursionReversestring {
	public  String reverseString(String str){
		
		if(str.isEmpty()){
			System.out.println("string is empty"+str);
			
                   return str;
		
		}
		else{
			return reverseString(str.substring(1))+str.charAt(0);
			
		}
	}
	
	public static void main(String[] args) {
		recursionReversestring rr=new recursionReversestring();
		String rs1=rr.reverseString("JAVATPOINT");
		String rs2=rr.reverseString("COMPUTER");
		String rs3=rr.reverseString("INDIA");
		System.out.println(rs1);
		System.out.println(rs2);
		System.out.println(rs3);
		
	}

}
