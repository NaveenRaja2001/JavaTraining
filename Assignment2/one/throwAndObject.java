package one;

import java.io.IOException;

/**
 * 
 * @author naveenraja
 * class create the object of OwnException class and calling the method throwingError
 */
public class throwAndObject {
	public static void main(String[] args) {
		OwnException obj = new OwnException();
		obj.throwingError();
	}
}

/**
 * class has a method which throws the object of classIOException
 *
 */
class OwnException{
	public void throwingError() {
		throw new IOException();

	}
}
