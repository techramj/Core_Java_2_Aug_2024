package pkg2;

public class A {
   int a;
      
   private A(int a) {
	   this.a = a;
   }
   
   public static A getInstance() {
	   A ob = new A(10);
	   return ob;
   }
}
/*
can we create object of A outside class A?
can we use reference of A outside class A?
I want object of A outside class A without creating default constructor

A ob = new A();
A ob1 = new A(10);
*/