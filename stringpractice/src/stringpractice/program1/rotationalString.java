package stringpractice.program1;

public class rotationalString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st1="abcde";
		String st2="deabc";
		if(st1.length()!=st2.length()){
			System.out.println("second string is not rotational to 1st string");
		}
		else{
			st1=st1.concat(st1);
			if(st1.indexOf(st2)!=-1){
				System.out.println("rotation sting");
			}
			else{
				System.out.println("not a rotational string");
			}
		}

	}

}
