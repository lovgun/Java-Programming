package stringpractice.program1;

public class Removeone {
	public static String remove(String st,int position){
		
		return st.substring(0,position)+st.substring(position+1);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="India is my country";
		System.out.println(remove(str,7));

	}

}
