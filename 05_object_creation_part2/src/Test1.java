
public class Test1 {
	
	public static void main(String[] args) {
		Employee e1 =  new Employee("jack", 1000);
		Employee e2 =  new Employee("SAM", 1000);
		
		e1 = e2;
		System.gc();  //request to gc
		Employee e3;
		
		/*for(long i =1;i<=999999;i++) {
			e3 = new Employee(1,"name-"+i, 1000);
		}*/
		
		System.out.println("end");
		
	}

}
