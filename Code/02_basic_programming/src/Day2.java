
public class Day2 {
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to the class of Java");
		checkPrime1(11);
		checkPrime1(22);
		checkPrime1(4345);
		
		//printNPrimeNumber(2000);
		printPattern2();
		

	}
	
	static void printPattern2() {
		
		for(int i=1;i<=4;i++) {
			
			//print space
			for(int j=1;j<=4- i; j++) {
				System.out.print(" ");
			}
			
			//print star
			for(int j=1;j<= 2*i-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static void printPattern1() {
		
		for(int i=1;i<=4;i++) {
			//print star
			for(int j=1;j<= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static void printNPrimeNumber(int num) {
		int count = 1;
		int i = 2;
		while(count<=num) {
			if(checkPrime1(i)) {
				System.out.print(i+"  ");
				count ++;
				if(count%10 == 0) {
					System.out.println();
				}
			}
			i++;
		}
		System.out.println();
	}
	
	static boolean checkPrime1(long num) {
		int flag = 0;
		for(long i=2;i<num;i++) {			
			if(num%i == 0) {
				flag = 1;
				break;
			}
		}
		if(flag == 0) {
			//System.out.println(num+" is prime");
			return true;
		}else {
			//System.out.println(num+" is not prime");
			return false;
		}
	}
	
	static boolean checkPrime(long num) {
		//number only divisible by 1 and number itself 
		int count = 0;
		for(long i=1;i<=num;i++) {
			if(num%i == 0) {
				count++;  //count = count +1
			}
		}
		if(count == 2) {
			System.out.println(num+" is prime");
			return true;
		}else {
			System.out.println(num+" is not prime");
			return false;
		}
	}
	
	static int add(int num1,int num2) {
		return num1 + num2;
	}
	
	static void printSum(int num1, int num2) {
		int res = num1+num2;
		System.out.println("result: "+res);
	}
	
	static void printEvenOrOdd(int number) {
		if(number%2 == 0) {
			System.out.println(number+" is even");   //shortcut sysout ctrl+space
		}else {
			System.out.println(number+" is odd");
		}
	}

}
