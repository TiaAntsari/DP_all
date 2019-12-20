package ma.ensa;

import java.util.ArrayList;
import java.util.List;

import ma.ensa.bases.BasicWagon;
import ma.ensa.bases.Wagon;
import ma.ensa.decorator.Empty;
import ma.ensa.decorator.HeadFirst;
import ma.ensa.decorator.HeadLast;
import ma.ensa.decorator.Loaded;
import ma.ensa.decorator.Passenger;
import ma.ensa.decorator.Restaurant;

public class Train {

	List<Wagon> wagons = new ArrayList<>();

	public Train(String train) {
		//
		for (int i = 0; i < train.toCharArray().length; i++) {
			char test = train.toCharArray()[i];
			if (Character.toString(test).equalsIgnoreCase("h") && (i == 0)) {
				wagons.add(new HeadFirst(new BasicWagon()));
			}
			if (Character.toString(test).equalsIgnoreCase("h") && (i != 0)) {
				wagons.add(new HeadLast(new BasicWagon()));
			}
			if (Character.toString(test).equalsIgnoreCase("p")) {
				wagons.add(new Passenger(new BasicWagon()));
			}

			if (Character.toString(test).equalsIgnoreCase("r")) {
				wagons.add(new Restaurant(new BasicWagon()));
			}

			if (Character.toString(test).equalsIgnoreCase("c")) {
				wagons.add(new Empty(new BasicWagon()));
			}

		}

	}

	public String print() {
		String printTrain = "";
		for (Wagon wg : wagons) {
			if (wg.equals(wagons.get(wagons.size() - 1))) {
				printTrain += wg.print();
			} else
				printTrain += wg.print() + "::";
		}
		return printTrain;
	}

	public void detachHead() {
		wagons.remove(0);
	}

	public void detachEnd() {
		wagons.remove(wagons.size() - 1);
	}

	public boolean fill() {
		int i = 0;
		boolean isfilled = false;
		for (Wagon wg : wagons) {
			// wg instanceOf EmptyCargo
			if (wg.getType().equals("ec")) {
				wagons.set(i, new Loaded(new BasicWagon()));
				isfilled = true;
				break;
			}
			i++;

		}
		return isfilled;
	}

	public static void main(String[] args) {
		Train train = new Train("hprrpcch");
		System.out.println(train.print());
		train.fill();
		System.out.println(train.print());
		train.fill();
		System.out.println(train.print());

	}

	// public static void main(String[] args) {
	// Wagon wagon = new BasicWagon();
	//
	// System.out.println("##################### BASE TRAIN ##################");
	// System.out.println(wagon.print());
	// System.out.println("##################### WITH PASSENGER
	// ##################");
	// wagon = new Passenger(wagon);
	// System.out.println(wagon.print());
	// System.out.println("##################### WITH EMPTY WAGON
	// ##################");
	// wagon = new Empty(wagon);
	// System.out.println(wagon.print());
	// System.out.println("##################### WITH LOADED WAGON
	// ##################");
	// wagon = new Loaded(wagon);
	// System.out.println(wagon.print());
	// System.out.println("##################### WITH HEAD ##################");
	// wagon = new HeadFirst(wagon);
	// System.out.println(wagon.print());
	// System.out.println("##################### WITH CONNECTOR
	// ##################");
	// System.out.println(wagon.getType());
	//
	// }

}
