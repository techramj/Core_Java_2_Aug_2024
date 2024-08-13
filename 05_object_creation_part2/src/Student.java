
public class Student {
	
	//non static and static
	private int rollNo;
	private String name;
	private static String trainerName = "Ram";
	
	static{
		//static block
		System.out.println("Static block called");
	}
	
	static{
		//static block
		System.out.println("Static block called");
	}
	
	
	public Student() {
		System.out.println("default construtor called");
	}
	
	public Student(int rollNo, String name) {
		System.out.println("Parameterized constructor called");
		this.rollNo = rollNo;
		this.name = name;
	}
	
	public static String getTrainerName() {
		return trainerName;
	}
	
	public String toString() {
		return "Roll no:"+rollNo+"  Name: "+name+"\n";
	}
	
	

}
