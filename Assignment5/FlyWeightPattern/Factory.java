package FlyWeightPattern;

import java.util.HashMap;

public class Factory {
		//using Hashmap to store the object
		public static HashMap<String,Specification> hashMap=new HashMap<String,Specification>();
		//returns the object if already present or create the new one
		public static Specification getDevice(String type) {
			Specification specs=null;
			if(hashMap.containsKey(type)) {
				//gets the object if already present
				specs=hashMap.get(type);	
			}
			else {
				switch(type) {
				//if type is mobile
				case "Mobile":
					System.out.println("Mobile is created");
					specs=new Mobile();
					break;
				//if type is Laptop
				case "Laptop":
					System.out.println("Laptop is created");
					specs=new Laptop();
					break;
				default:
					//throw exception if nothing is passed
					throw new IllegalArgumentException("nothing is present in type");
			}
			//add to hashMap 	
			hashMap.put(type, specs);
		}
			return specs;
		}
}
