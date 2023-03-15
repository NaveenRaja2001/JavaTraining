package one;

import java.io.IOException;

public class throwAndObject {
  public static void main(String[] args){
	Exceptions obj=new Exceptions();
	obj.throwing();
}
}
class Exceptions{
	  public void throwing(){
		  throw new IOException();
	  }
}
