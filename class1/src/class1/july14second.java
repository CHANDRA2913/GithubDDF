package class1;

import java.util.ArrayList;

public class july14second {

	public static void main(String[] args) {
		// store car companies into arraylist class
		ArrayList<String>car=new ArrayList<String>();
		car.add("TATA");
		car.add("TECH");
		car.add("TAYOTA");
		car.add("HONDA");
		car.add("BMW");
		car.add("KIA");
		car.add("BENZ");
	System.out.println(car.size());
	System.out.println(car.get(3));
	for (int i = 0; i <4;i++) {
		System.out.println(car.get(i));
	}
		 
	}

}
