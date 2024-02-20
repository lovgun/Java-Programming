package stringpractice.program1;

public class RemoveDublicats {

	public static String solv(String str1, String str2) {
		// TODO Auto-generated method stub
		StringBuffer ans=new StringBuffer();
		for(int i=0;i<str1.length();i++){
			int flag=0;
			for(int j=0;j<str2.length();j++){
				if(str1.charAt(i)==str2.charAt(j)){
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
		String firstString="abcdef";
		String SecondString="cefz";
		System.out.println("final string  is:");
		System.out.println(solv(firstString,SecondString));
		

}
	}
