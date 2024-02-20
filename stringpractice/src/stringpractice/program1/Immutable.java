package stringpractice.program1;


final class Immutable{
	final String name;
	final int age;
	 Immutable(String st,int age){
		name=st;
		this.age=age;
	 }
		
	Immutable change (String str,int ag) {
	// TODO Auto-generated constructor stub
		Immutable newobj=new Immutable(str, ag);
		return newobj;
}
}
	class Immutable1{
		public static void main(String[] args) {
			Immutable imu=new Immutable("lovely", 31);
			System.out.println(imu.name);
			System.out.println(imu.age);
			Immutable newobj1=imu.change("lovelyPANDEY", 30);
			System.out.println(newobj1.name);
			System.out.println( newobj1.age);
			
		}
			
		}
	

