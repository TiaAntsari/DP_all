package ma.ensa.decorator;

import ma.ensa.bases.Wagon;

public class Loaded extends TrainDecorator {

	public Loaded(Wagon wagon) {
		super(wagon);
	}

	@Override
	public String print() {
		return wagon.print() + "|^^^^|";
	}

	@Override
	public String getType() {
		return wagon.getType() + "l";
	}

	@Override
	public String getConnector() {
		return wagon.getConnector();
	}
}
