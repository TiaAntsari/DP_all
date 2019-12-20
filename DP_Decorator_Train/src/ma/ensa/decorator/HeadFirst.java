package ma.ensa.decorator;

import ma.ensa.bases.Wagon;

public class HeadFirst extends TrainDecorator {

	public HeadFirst(Wagon wagon) {
		super(wagon);
	}

	@Override
	public String print() {
		return wagon.print() + "<HHHH";
	}

	@Override
	public String getType() {
		return wagon.getType() + "fh";
	}

	@Override
	public String getConnector() {
		return wagon.getConnector();
	}
}
