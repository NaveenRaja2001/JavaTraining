package Builder;

public class ShowRoom{
	/**
	 * 
	 * @param args unused
	 * create the object of manufactoring Unit along with neccesary object which the user can decide
	 */
   public static void main(String[] args) {
	  //creating object for manual and deisel independently 
	Car obj=new ManufactoringUnit().setGearSystem("manual").setFuelType("Deisel").getCar();
	System.out.println(obj);
}
}
