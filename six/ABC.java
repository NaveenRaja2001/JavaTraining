package six;

/**
 * class A contains a public constructor which prints when the object is created
 */
class A {
	public A() {
		System.out.println("Object of class A is created");
	}
}

/**
 * class B contains a public constructor which prints when the object is created
 */
class B {
	public B() {
		System.out.println("Object of class B is created");
	}
}

/**
 * class extends A and the other class object is created
 *
 */
class C extends A {
	B obj2 = new B();

}

/**
 * class contains the main method in which object of C class is created
 *
 */
public class ABC {
	public static void main(String[] args) {
		C obj = new C();
		System.out.print(obj);
	}
}
