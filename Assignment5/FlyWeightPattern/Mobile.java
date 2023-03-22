package FlyWeightPattern;

public class Mobile implements Specification{
	private String OS;
	private String color;
	private int ram;
	
	Mobile(){
		OS="Android";//internsic property
	}
	//externsic property
	@Override
	public void color(String color) {
		// TODO Auto-generated method stub
		this.color=color;
	}
	//externsic property
	@Override
	public void RAM(int ram) {
		// TODO Auto-generated method stub
		this.ram=ram;
	}
	//return all the property
	@Override
	public void buy() {
		// TODO Auto-generated method stub
		System.out.println("Mobile Phone Specification are color:"+color  +" RAM:"+ram+"GB  OS:"+OS);
	}


}
