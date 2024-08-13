
public class ArrayDemo1 {
	
	public static void main(String[] args) {
	
		int[] arr; //arr is a reference 
		int barr[];
		
		arr = new int[3];
		barr = new int[] {2,3,4,5};
		
		int[] carr = {10,20,30}; //so, Array is called first class object
		
		int[] darr = new int[5];
		//arr = {10,20,30); creating array without new is only possible at the time of declaration
		
		display(arr);
		display(barr);
		display(carr);
	}
	
	static void display(int[] arr) {
		for(int i =0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

}
