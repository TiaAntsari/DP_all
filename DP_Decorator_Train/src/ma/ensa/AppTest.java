package ma.ensa;

import ma.ensa.bases.BasicWagon;
import ma.ensa.bases.Wagon;
import ma.ensa.decorator.Empty;
import ma.ensa.decorator.HeadFirst;
import ma.ensa.decorator.Loaded;
import ma.ensa.decorator.Passenger;

public class AppTest {
	public static void main(String[] args) {
		Wagon wagon = new BasicWagon();

		System.out.println("##################### BASE TRAIN ##################");
		System.out.println(wagon.print());
		System.out.println("##################### WITH HEAD ##################");
		wagon = new HeadFirst(wagon);
		System.out.println("##################### WITH PASSENGER##################");
		wagon = new Passenger(wagon);
		System.out.println(wagon.print());
		System.out.println("##################### WITH EMPTY WAGON ##################");
		wagon = new Empty(wagon);
		System.out.println(wagon.print());
		System.out.println("##################### WITH LOADED WAGON##################");
		wagon = new Loaded(wagon);
		System.out.println(wagon.print());

		System.out.println(wagon.print());
		System.out.println("##################### WITH CONNECTOR ##################");
		System.out.println(wagon.getType());

	}
}
