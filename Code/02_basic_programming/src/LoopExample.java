
public class LoopExample {
	
	public static void main(String[] args) {
		printFirst10Number();
		printFirst10NumberUsingWhileLoop();
		printFirst10NumberUsingDoWhileLoop();
		
	}
	
	static void printFirst10Number() {
		for(int i=1;i<=10;i++) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
	static void printFirst10NumberUsingWhileLoop() {
		int i=1;
		while(i<=10) {
			System.out.print(i+" ");
			i= i+1;
		}
		System.out.println();
	}
	
	static void printFirst10NumberUsingDoWhileLoop() {
		int i=1;
		do{
			System.out.print(i+" ");
			i= i+1;
		}while(i<=10);
		System.out.println();
	}

}
