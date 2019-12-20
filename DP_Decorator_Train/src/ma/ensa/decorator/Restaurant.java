package ma.ensa.decorator;

import ma.ensa.bases.Wagon;

public class Restaurant extends TrainDecorator {

	public Restaurant(Wagon wagon) {
		super(wagon);
	}

	@Override
	public String print() {
		return wagon.print() + "|hThT|";
	}

	@Override
	public String getType() {
		return wagon.getType() + "r";
	}

	@Override
	public String getConnector() {
		return wagon.getConnector();
	}
}
