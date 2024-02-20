package stringpractice.program1;

public class Removewhitespace {
	public static void main(String[] args) {
		String name=" i love my india";
		name=name.replaceAll("\\s+", "");
		System.out.println("removed white spaces"+" "+name);
	}

}
