
import java.io.Console;

public class ConsoleDemo {
	
	public static void main(String[] args) {
		Console  console = System.console();
		System.out.println("enter username: ");
		String username = console.readLine();
		char[] password = console.readPassword("enter password: ");
		System.out.println("username: "+username);
		System.out.println("password: "+ String.valueOf(password));
	}

}
//Users/kiranmishra/eclipse-workspace/java/21_filehandling/src/ConsoleDemo.java