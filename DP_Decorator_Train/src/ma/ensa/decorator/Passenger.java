package ma.ensa.decorator;

import ma.ensa.bases.Wagon;

public class Passenger extends TrainDecorator {

	public Passenger(Wagon wagon) {
		super(wagon);
	}

	@Override
	public String print() {
		return wagon.print() + "|OOOO|";
	}

	@Override
	public String getType() {
		return wagon.getType() + "p";
	}

	@Override
	public String getConnector() {
		return wagon.getConnector();
	}
}
