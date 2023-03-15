package six;
 
class Super{
	int a;
	 public Super() {
		 throw new Exception();
	 }
}

class Derived extends Super{
	public Derived() {
	
		super();
		
	}
}
public class  Demo {
	
	public static void main(String args[]){
		
		Derived obj=new Derived();
		
		
	}
}
