package stringpractice.program1;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="i love my india";
		String name1="";
		
		
		char[]namearr =name.toCharArray();
		char word;
		for( int i=namearr.length-1;i>=0;i--){
			word=namearr[i];
			name1=name1+word;
		}
		System.out.println(name1);

	}

}
