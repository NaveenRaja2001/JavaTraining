package four;
class OwnException  extends Exception{

	public OwnException(String str){
		super(str);
	}
}
public class Demo {
	public static void main(String[] args) throws Exception{
		int number=4;
		Demo obj=new Demo();
		obj.createException(number);
	}
	
	 public void createException(int num) throws Exception{
		try {
			if(num%2==0) {
				throw new OwnException("This number is even");
			}
		}
		catch(OwnException e){
			System.out.println(e.getMessage());
			
		
		}
		finally {
			System.out.println("Finally it is running");
		}
	}
}
