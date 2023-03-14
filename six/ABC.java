package six;
//class A
class A {
	public A() {
		System.out.println("Object of class A is created");
	}
}
//class B
class B {
	public B() {
		System.out.println("Object of class B is created");
	}
}

class C extends A {
//	creating object of B class
	B obj2 = new B();

}
//ABC Class 
public class ABC {
	public static void main(String[] args) {
		C obj = new C();
		System.out.print(obj);
	}
}
