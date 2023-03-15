package two;

public class Sample{
	public void mth1()
	{
		mth2();
		System.out.println("caller");
	}
	public void mth2()
	{
		try
		{
			int number=1/0;
			return;
			
		}
		catch(Exception e)
		{
		
			System.out.println("catch-mth2");
		}
		finally
		{
			System.out.println("finally-mth2");
		}
	}
	public static void main(String[] args) {
		Sample obj = new Sample();
		obj.mth1();
	}
}
