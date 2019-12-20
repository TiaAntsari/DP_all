package ma.ensa.decorator;

import ma.ensa.bases.Wagon;

public class Empty extends TrainDecorator {

	public Empty(Wagon wagon) {
		super(wagon);
	}

	@Override
	public String print() {
		return wagon.print() + "|____|";
	}

	@Override
	public String getType() {
		return wagon.getType() + "ec";
	}

	@Override
	public String getConnector() {
		return wagon.getConnector();
	}

}
